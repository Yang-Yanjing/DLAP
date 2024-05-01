# DLAP: A Deep Learning Augmented Large Language Model Prompting Framework for Software Vulnerability Detection

The overall framework is divided into 2 parts:


## SupICL.py - Construction of in-context learning prompts augmented by DL models 

## ChainofThought.py: Generation of the bespoke COT prompts to augment LLMs.

## mainDect.py: Call and Process Automatically

|- codesensor: Static Processing Tool

|- data: Dataset

|- LLMmodel: Large Language Model Invocation

|- result: Result Storage

|- tmp: Process Redundancy

|- tools: Utility Classes

|- config: Configuration

Besides, The Beacon, COTTree are for ChainofThought.py
The Generpromp is for SupICL.py


# Environment Configuration

### 1. System Environment Variables

Here are the system environment variables that need to be configured when using GPT. If using other large language models, please configure them according to the respective requirements. GPT is used as an example as follows.

##### Configure HTTP & HTTPS Proxy Port

You need to configure the HTTP & HTTPS proxy ports for accessing GPT via network requests. You should add two key-value pairs to your system environment variables, namely HTTP_PROXY and HTTPS_PROXY, with the corresponding values being the network proxy port you want to use (e.g., if using Clash as the proxy port, set it to 7890).

##### Configure OpenAI KEY

Accessing GPT requires an OpenAI KEY. You need to add a key-value pair to your system environment variables, with the key being "openaikey" and the value being your OpenAI account key. If using premium large models like GPT-4, running the code will incur corresponding charges.

### 2. Configuration File

The configuration file is placed in the `config` folder, and the specific contents are explained as follows:

##### `LLM_Func` 

- `LLM_model`: Set the large language model you want to use, typically "GPT"
- `Action4code`
  - `data_set`: Set the dataset, you can choose from "linux_kernel" "debian" "FFmpeg" "LibTIFF" "LibPNG"
  - `data_size`: Set the size of the dataset, change as needed.
  - `seed`: Random seed, change as needed.
- `Beacon`
  - `dlnetwork`: Set the DL model of
   DLAP.
- `Chain`
  - `algorithm`: Set the COT algorithm, typically "detail"
- `Discern`
  - `algorithm`: Set the Discern algorithm, typically "deepsec" 
  - `ICLnum`: The number of ICL entries to include


# Running the Code

After modifying the configuration file, you need to change the configuration file you need in comainDect, specifically:

```
config_file = "config.yaml"
```

Then, you can run mainDect, and you will find the corresponding log files in the `result` folder.
