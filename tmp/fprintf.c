static void * qemu_dummy_cpu_thread_fn ( void * arg ) {
 # ifdef _WIN32 fprintf ( stderr , "qtest is not supported under Windows\n" ) ;
 exit ( 1 ) ;
 # else CPUState * cpu = arg ;
 sigset_t waitset ;
 int r ;
 qemu_mutex_lock_iothread ( ) ;
 qemu_thread_get_self ( cpu -> thread ) ;
 cpu -> thread_id = qemu_get_thread_id ( ) ;
 sigemptyset ( & waitset ) ;
 sigaddset ( & waitset , SIG_IPI ) ;
 cpu -> created = true ;
 qemu_cond_signal ( & qemu_cpu_cond ) ;
 cpu_single_env = cpu -> env_ptr ;
 while ( 1 ) {
 cpu_single_env = NULL ;
 qemu_mutex_unlock_iothread ( ) ;
 do {
 int sig ;
 r = sigwait ( & waitset , & sig ) ;
 }
 while ( r == - 1 && ( errno == EAGAIN || errno == EINTR ) ) ;
 if ( r == - 1 ) {
 perror ( "sigwait" ) ;
 exit ( 1 ) ;
 }
 qemu_mutex_lock_iothread ( ) ;
 cpu_single_env = cpu -> env_ptr ;
 qemu_wait_io_event_common ( cpu ) ;
 }
 return NULL ;
 # endif }