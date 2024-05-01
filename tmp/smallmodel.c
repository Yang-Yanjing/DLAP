static int vmw_gb_surface_unbind(struct vmw_resource *res,
				 bool readback,
				 struct ttm_validate_buffer *val_buf)
{
	struct vmw_private *dev_priv = res->dev_priv;
	struct ttm_buffer_object *bo = val_buf->bo;
	struct vmw_fence_obj *fence;

	struct {
		SVGA3dCmdHeader header;
		SVGA3dCmdReadbackGBSurface body;
	} *cmd1;
	struct {
		SVGA3dCmdHeader header;
		SVGA3dCmdInvalidateGBSurface body;
	} *cmd2;
	struct {
		SVGA3dCmdHeader header;
		SVGA3dCmdBindGBSurface body;
	} *cmd3;
	uint32_t submit_size;
	uint8_t *cmd;


	BUG_ON(bo->mem.mem_type != VMW_PL_MOB);

	submit_size = sizeof(*cmd3) + (readback ? sizeof(*cmd1) : sizeof(*cmd2));
	cmd = vmw_fifo_reserve(dev_priv, submit_size);
	if (unlikely(!cmd)) {
		DRM_ERROR("Failed reserving FIFO space for surface "
			  "unbinding.\n");
		return -ENOMEM;
	}

	if (readback) {
		cmd1 = (void *) cmd;
		cmd1->header.id = SVGA_3D_CMD_READBACK_GB_SURFACE;
		cmd1->header.size = sizeof(cmd1->body);
		cmd1->body.sid = res->id;
		cmd3 = (void *) &cmd1[1];
	} else {
		cmd2 = (void *) cmd;
		cmd2->header.id = SVGA_3D_CMD_INVALIDATE_GB_SURFACE;
		cmd2->header.size = sizeof(cmd2->body);
		cmd2->body.sid = res->id;
		cmd3 = (void *) &cmd2[1];
	}

	cmd3->header.id = SVGA_3D_CMD_BIND_GB_SURFACE;
	cmd3->header.size = sizeof(cmd3->body);
	cmd3->body.sid = res->id;
	cmd3->body.mobid = SVGA3D_INVALID_ID;

	vmw_fifo_commit(dev_priv, submit_size);

	/*
	 * Create a fence object and fence the backup buffer.
	 */

	(void) vmw_execbuf_fence_commands(NULL, dev_priv,
					  &fence, NULL);

	vmw_fence_single_bo(val_buf->bo, fence);

	if (likely(fence != NULL))
		vmw_fence_obj_unreference(&fence);

	return 0;
}
