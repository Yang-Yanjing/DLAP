'''
Author: Yanjing Yang
Date: 2023-07-09 14:53:39
FilePath: \DLAP\ChainofThought.py
Description: Feel the combination key value, and take out the corresponding thinking chain hint from the constructed COT tree

Copyright (c) 2023 by NJU(Nanjing University), All Rights Reserved. 
'''

# Knowledge Sets
Knowledge = {
    "access control":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify the access control mechanisms for this function.

        analysis_step 3: Examine input validation and sanitization: Analyze how user input is validated and sanitized before being used in access control decisions.
        
        analysis_step 4: Analyze whether the function's authorization check and authentication check are perfect.

        analysis_step 5: Review role-based access control.

        analysis_step 6: Review whether Mandatory Access Control exists. If so, the function code is highly secure.
        
        analysis_step 7: Test edge cases and boundary conditions: Test the access control mechanisms with various inputs and edge cases to ensure robustness. This includes testing with different user roles, permissions, and scenarios to identify any access control weaknesses or vulnerabilities.

        analysis_step 8: Review function logic flaws: Analyze the code for any logical flaws that could lead to access control bypasses. 
        
        analysis_step 9: Check for secure defaults: Review the code to ensure that access control defaults are set to the most secure options. This includes default deny policies, minimal privileges required, and properly configured access control lists.

        analysis_step 10: Check for direct object references: Look for instances where the code directly references sensitive resources or objects without proper access control checks. This includes situations where sensitive data is exposed through URLs, hidden form fields, or other client-side mechanisms.

        analysis_step 11: Analyze code dependencies: Review any external libraries or components used by the application. Check for any known vulnerabilities or insecure access control practices in these dependencies.

        analysis_step 12: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "improper authorization":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify the access control mechanisms for this function.

        analysis_step 3: Examine input validation and sanitization: Analyze how user input is validated and sanitized before being used in access control decisions.
        
        analysis_step 4: Analyze whether the function's authorization check and authentication check are perfect.

        analysis_step 5: Review role-based access control.

        analysis_step 6: Review whether Mandatory Access Control exists. If so, the function code is highly secure.
        
        analysis_step 7: Test edge cases and boundary conditions: Test the access control mechanisms with various inputs and edge cases to ensure robustness. This includes testing with different user roles, permissions, and scenarios to identify any access control weaknesses or vulnerabilities.

        analysis_step 8: Review function logic flaws: Analyze the code for any logical flaws that could lead to access control bypasses. 

        analysis_step 9: Identify authorization checks: Look for functions or methods that determine whether a user or entity has the necessary permissions to access a particular resource or perform a specific action.
        
        analysis_step 10: Review authorization logic.

        analysis_step 11: Identify potential privilege escalation points: This could include bypassing or manipulating authorization checks, taking advantage of insecure session management, or exploiting vulnerabilities in user role assignments.
        
        analysis_step 12: Check for secure defaults: Review the code to ensure that access control defaults are set to the most secure options. This includes default deny policies, minimal privileges required, and properly configured access control lists.

        analysis_step 13: Check for direct object references: Look for instances where the code directly references sensitive resources or objects without proper access control checks. This includes situations where sensitive data is exposed through URLs, hidden form fields, or other client-side mechanisms.

        analysis_step 14: Analyze code dependencies: Review any external libraries or components used by the application. Check for any known vulnerabilities or insecure access control practices in these dependencies.

        analysis_step 15: Combine the information obtained above, determine if there are potential vulnerabilities step by step
    ''',
    "improper authentication":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify the access control mechanisms for this function.

        analysis_step 3: Examine input validation and sanitization: Analyze how user input is validated and sanitized before being used in access control decisions.
        
        analysis_step 4: Analyze whether the function's authorization check and authentication check are perfect.

        analysis_step 5: Review role-based access control.

        analysis_step 6: Review whether Mandatory Access Control exists. If so, the function code is highly secure.
        
        analysis_step 7: Test edge cases and boundary conditions: Test the access control mechanisms with various inputs and edge cases to ensure robustness. This includes testing with different user roles, permissions, and scenarios to identify any access control weaknesses or vulnerabilities.

        analysis_step 8: Review function logic flaws: Analyze the code for any logical flaws that could lead to access control bypasses.

        analysis_step 9: Identify authentication mechanisms: Look for functions or methods that handle user login, password validation, session management, or any other authentication-related operations.

        analysis_step 10: Review authentication logic: Look for any potential vulnerabilities such as weak password storage, lack of strong authentication methods, hardcoded credentials, or improper handling of authentication tokens.

        analysis_step 11: Check password handling: Look for any potential vulnerabilities such as plaintext storage, weak hashing algorithms, lack of salt, or insufficient password complexity requirements.

        analysis_step 12: Analyze session management: Examine the code that manages user sessions. Look for any potential vulnerabilities such as session fixation, session hijacking, insufficient session expiration, or insecure session ID generation.

        analysis_step 13: Review multifactor authentication (MFA): If MFA is implemented, analyze the code responsible for handling multiple authentication factors. Look for any misconfigurations or vulnerabilities that could undermine the effectiveness of MFA.

        analysis_step 14: Analyze authentication bypass: Look for any code segments that may allow unauthorized access without proper authentication. This could include improper validation or handling of authentication tokens, insecure direct object references, or overlooked access control checks.

        analysis_step 15: Check for secure credential transmission: Review how user credentials are transmitted over the network. Look for any potential vulnerabilities such as lack of encryption or improper handling of secure channels.
        
        analysis_step 16: Check for secure defaults: Review the code to ensure that access control defaults are set to the most secure options. This includes default deny policies, minimal privileges required, and properly configured access control lists.

        analysis_step 17: Check for direct object references: Look for instances where the code directly references sensitive resources or objects without proper access control checks. This includes situations where sensitive data is exposed through URLs, hidden form fields, or other client-side mechanisms.

        analysis_step 18: Analyze code dependencies: Review any external libraries or components used by the application. Check for any known vulnerabilities or insecure access control practices in these dependencies.

        analysis_step 19: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "protection mechanism failure":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify the protection mechanisms that should be in place to secure the code and its components. 

        analysis_step 3: Ensure the implementation of the identified protection mechanisms to ensure they are correctly designed and implemented. 
        
        analysis_step 4: Review potential vulnerabilities such as weak or hard-coded passwords, missing or inadequate access control checks, insecure encryption algorithms, or insufficient input validation.

        analysis_step 5: Evaluate the access control mechanisms in the code.
        
        analysis_step 6: If encryption is used in the code, review its implementation for potential vulnerabilities.

        analysis_step 7: Determine where protection mechanisms are implemented: Review the source code to identify the locations where the protection mechanisms are implemented. Look for functions, methods, or modules that handle authentication, access controls, encryption, and input validation.

        analysis_step 8: Identify any trust assumptions: Determine if the code relies on any trust assumptions, such as assuming that certain inputs or data are secure or trustworthy. Look for potential vulnerabilities that could arise from these trust assumptions being violated.

        analysis_step 9: Combine the information obtained above, determine if there are potential vulnerabilities step by step. 
    
    ''',
    "missing sensitive data encryption":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify the protection mechanisms that should be in place to secure the code and its components. 

        analysis_step 3: Ensure the implementation of the identified protection mechanisms to ensure they are correctly designed and implemented. 
        
        analysis_step 4: Review potential vulnerabilities such as weak or hard-coded passwords, missing or inadequate access control checks, insecure encryption algorithms, or insufficient input validation.

        analysis_step 5: Evaluate the access control mechanisms in the code.
        
        analysis_step 6: If encryption is used in the code, review its implementation for potential vulnerabilities.

        analysis_step 7: Determine where protection mechanisms are implemented: Review the source code to identify the locations where the protection mechanisms are implemented. Look for functions, methods, or modules that handle authentication, access controls, encryption, and input validation.

        analysis_step 8: Identify any trust assumptions: Determine if the code relies on any trust assumptions, such as assuming that certain inputs or data are secure or trustworthy. Look for potential vulnerabilities that could arise from these trust assumptions being violated.

        analysis_step 9: Identify sensitive data: Determine which parts of the code handle sensitive data such as personally identifiable information (PII), passwords, financial data, or other confidential information.

        analysis_step 10: Locate data storage and transmission points: Review the code to identify where the sensitive data is stored or transmitted. Look for functions, methods, or modules that handle or manipulate this data.

        analysis_step 11: Check for encryption implementation: Analyze the code to determine if encryption mechanisms are implemented for sensitive data. Look for functions or libraries used for encryption or decryption operations.

        analysis_step 12: Analyze potential data leakage points: Examine the code for potential data leakage points where sensitive data could be exposed without encryption. This could include logging mechanisms, error messages, or temporary files where sensitive data is stored in plain text.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step. 
    ''',
    
    "broken cryptographic algorithm":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify the protection mechanisms that should be in place to secure the code and its components. 

        analysis_step 3: Ensure the implementation of the identified protection mechanisms to ensure they are correctly designed and implemented. 
        
        analysis_step 4: Review potential vulnerabilities such as weak or hard-coded passwords, missing or inadequate access control checks, insecure encryption algorithms, or insufficient input validation.

        analysis_step 5: Evaluate the access control mechanisms in the code.
        
        analysis_step 6: If encryption is used in the code, review its implementation for potential vulnerabilities.

        analysis_step 7: Determine where protection mechanisms are implemented: Review the source code to identify the locations where the protection mechanisms are implemented. Look for functions, methods, or modules that handle authentication, access controls, encryption, and input validation.

        analysis_step 8: Identify any trust assumptions: Determine if the code relies on any trust assumptions, such as assuming that certain inputs or data are secure or trustworthy. Look for potential vulnerabilities that could arise from these trust assumptions being violated.

        analysis_step 9: Identify cryptographic operations: Look for functions, methods, or modules that handle encryption, decryption, hashing, or other cryptographic operations.

        analysis_step 10: Evaluate cryptographic algorithms used.

        analysis_step 11: Check for insecure or deprecated algorithms: Look for any usage of insecure or deprecated cryptographic algorithms such as MD5 or SHA-1.

        analysis_step 12: Review key generation and management: Check if strong and random keys are generated using appropriate cryptographic techniques. Look for any weaknesses in key storage or management practices such as hard-coding keys or using weak key generation methods.

        analysis_step 13: Assess key length and strength: Check if the keys meet the recommended key length for the chosen cryptographic algorithm. 

        analysis_step 14: Analyze random number generation: If the code relies on random numbers for cryptographic purposes, review the random number generation mechanism. Ensure that a secure random number generator is used to prevent predictable or weak random numbers.

        analysis_step 15: Check for insecure or incomplete implementations: Look for potential vulnerabilities in the implementation of cryptographic operations. Check for missing or incomplete steps such as missing initialization vectors (IVs), incorrect padding schemes, or improper usage of cryptographic APIs.

        analysis_step 16: Evaluate usage of cryptographic libraries: If the code uses cryptographic libraries or third-party components, review their implementation and security practices. Ensure that the libraries are up-to-date, well-maintained, and use secure cryptographic algorithms.

        analysis_step 17: Combine the information obtained above, determine if there are potential vulnerabilities step by step. 

    ''',
        
    "coding standards":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Familiarize yourself with the coding standards that are applicable to the project. This could include industry-standard coding guidelines, company-specific coding conventions, or language-specific best practices. Ensure that you have a clear understanding of the expected coding style, naming conventions, formatting rules, and other relevant guidelines.

        analysis_step 3: Analyze code formatting: Review the source code for adherence to the specified formatting rules.
        
        analysis_step 4: Check naming conventions: Pay attention to variable, function, class, and file names. Ensure that they follow the specified naming conventions. Inconsistent or inappropriate naming can lead to confusion and potential vulnerabilities.

        analysis_step 5: Review code comments

        analysis_step 6: Identify security-specific coding standards

        analysis_step 7: Look for smelled code: Identify common code smells or anti-patterns that violate coding standards. 

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step. 

    ''',
    "prohibited code usage":
    '''
        analysis_step 0: understanding the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Familiarize yourself with the coding standards that are applicable to the project. This could include industry-standard coding guidelines, company-specific coding conventions, or language-specific best practices. Ensure that you have a clear understanding of the expected coding style, naming conventions, formatting rules, and other relevant guidelines.

        analysis_step 3: Analyze code formatting: Review the source code for adherence to the specified formatting rules.
        
        analysis_step 4: Check naming conventions: Pay attention to variable, function, class, and file names. Ensure that they follow the specified naming conventions. Inconsistent or inappropriate naming can lead to confusion and potential vulnerabilities.

        analysis_step 5: Review code comments

        analysis_step 6: Identify security-specific coding standards

        analysis_step 7: Look for smelled code: Identify common code smells or anti-patterns that violate coding standards.

        analysis_step 8: Be familiar with the coding standards and guidelines that identify specific code constructs, functions, or libraries that are prohibited due to security concerns, like known vulnerable functions, deprecated APIs, or insecure coding practices.

        analysis_step 9: Check for direct calls to functions that are known to be vulnerable or have security risks. Examples may include unsafe string manipulation functions like strcpy() or insecure cryptographic algorithms like MD5.

        analysis_step 10: Check for deprecated APIs: Identify and review any usage of deprecated APIs or outdated libraries that may have known security vulnerabilities.

        analysis_step 11: Check for any insecure coding practices that are explicitly prohibited in the coding standards. Examples include the use of weak or insecure encryption algorithms, hardcoded credentials or sensitive information, or improper handling of user input.

        analysis_step 12: Combine the information obtained above, determine if there are potential vulnerabilities step by step. 

    ''',
    "insufficiently trustworthy component":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Familiarize yourself with the coding standards that are applicable to the project. This could include industry-standard coding guidelines, company-specific coding conventions, or language-specific best practices. Ensure that you have a clear understanding of the expected coding style, naming conventions, formatting rules, and other relevant guidelines.

        analysis_step 3: Analyze code formatting: Review the source code for adherence to the specified formatting rules.
        
        analysis_step 4: Check naming conventions: Pay attention to variable, function, class, and file names. Ensure that they follow the specified naming conventions. Inconsistent or inappropriate naming can lead to confusion and potential vulnerabilities.

        analysis_step 5: Review code comments

        analysis_step 6: Identify security-specific coding standards

        analysis_step 7: Look for smelled code: Identify common code smells or anti-patterns that violate coding standards.

        analysis_step 8: Identify external components: Identify any external components or libraries used in the codebase. This includes third-party libraries, open-source frameworks, or any other code that is not developed in-house. 

        analysis_step 9: Assess the trustworthiness of the identified external components. Check if they are well-maintained, actively supported. Look for factors such as the frequency of updates, responsiveness to reported issues, and security track record.

        analysis_step 10: Examine the documentation of the external components. Focus on the security-related aspects mentioned in the documentation, such as any security vulnerabilities, best practices for integration and usage, or any specific considerations for secure coding.

        analysis_step 11: Research and review any known vulnerabilities associated with the identified external components. .

        analysis_step 12: Evaluate how the external components are integrated into the codebase. Look for proper usage of the components as specified in the coding standards. Check if the components are being used in a secure and recommended manner.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step. 

    ''',

    "time-related error":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure. 
        
        analysis_step 2: Check for concurrency issues that could lead to race conditions where the outcome depends on the sequence or timing of uncontrollable events.
        
        analysis_step 3: Inspect for proper synchronization: Check for proper synchronization and locking mechanisms where shared resources are accessed. 

        analysis_step 4: Identify the time-related components: Start by identifying the components of the source code that are related to time operations. These could be timestamps, time checks, sleep functions, or any other time-dependent operations. Look for functions like time(), gettimeofday() in C/C++.

        analysis_step 5: Inspect time manipulation functions: After identifying the time-related components, inspect the functions that manipulate these time values. Check if these functions are susceptible to race conditions, time-of-check-to-time-of-use (TOCTOU) errors, or any other timing errors. For instance, are there any instances where the code checks a condition and then acts on it later? If so, this could be a TOCTOU error if the condition changes between the check and the use.

        analysis_step 6: Review time-related assumptions: Review any assumptions made about the timing in the code. For instance, is there any code that assumes that certain operations will always complete in a certain amount of time?
    
        analysis_step 7: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    
    "improper exception handling":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify all the segments in the source code where exceptions are being handled.
        
        analysis_step 3: Look for catch blocks that are empty or only contain comments, which could lead to the application continuing its execution in an erroneous state.

        analysis_step 4: Ensure that specific exceptions are being caught instead of general exceptions.

        analysis_step 5: Analyze Exception Propagation: Check that exceptions are being propagated up the call stack appropriately.

        analysis_step 6: Inspect Logging Practices: Ensure that exceptions are being logged appropriately. This includes logging the exception message, stack trace, and any relevant data about the state of the application at the time of the exception.

        analysis_step 7: Verify Resource Cleanup: Verify that resources are being cleaned up correctly in the "finally" blocks

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',

    "improper resource control":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "resource exposure":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Locate resource access: Identify code sections where the sensitive resources are accessed or manipulated. Look for functions or methods that interact with these resources, such as read/write operations, database queries, or network communication.

        analysis_step 9: Check for proper access controls: Ensure that appropriate access controls are in place to restrict access to sensitive resources. Look for mechanisms such as authentication, authorization, or permission checks.

        analysis_step 10: Check for encryption and secure communication: Evaluate if sensitive information is properly encrypted when transmitted or stored. Look for functions or methods responsible for encryption and decryption and ensure they are used correctly. 

        analysis_step 11: Examine logging mechanisms: Review how the code handles logging of sensitive information. Verify that log files are adequately protected and access is restricted.

        analysis_step 12: Analyze data validation and sanitization: Examine how the code validates and sanitizes user or external input before using it in operations that involve sensitive resources. Look for potential vulnerabilities such as input validation failures, or SQL injection

        analysis_step 13: Review third-party libraries and APIs: If the code relies on third-party libraries or APIs to interact with sensitive resources, analyze their documentation and source code for any known vulnerabilities related to resource exposure.

        analysis_step 14: Consider confidentiality requirements: Evaluate the code against any specific confidentiality requirements defined for the application. Check if the code adheres to the defined security policies regarding the protection of sensitive information.

        analysis_step 15: Review access control configurations: If the code relies on access control configurations, ensure that they are properly configured and enforced. Verify that only authorized entities have the necessary privileges to access sensitive resources.

        analysis_step 16: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "uncontrolled resource consumption":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Look for loops, recursion, or other repetitive patterns that could potentially lead to excessive resource consumption. Check if the code follows efficient resource management practices.

        analysis_step 9: Identify any code sections where resources are allocated without proper checks for limits or constraints. Look for scenarios where the code might allocate resources based on user-controlled input, leading to uncontrolled consumption.

        analysis_step 10: Consider resource limits and quotas: Evaluate if the code enforces any limits or quotas on resource consumption. Check if these limits are properly defined, enforced, and monitored. Verify that the code does not exceed the specified limit.

        analysis_step 11: Analyze any performance optimizations implemented in the code. Ensure that these optimizations do not inadvertently lead to uncontrolled resource consumption. Look for cases where excessive caching, buffering, or parallelism might result in excessive resource usage.

        analysis_step 12: Review external dependencies: If the code relies on external libraries or APIs that involve resource consumption, analyze their documentation and source code for any potential vulnerabilities related to uncontrolled resource consumption.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "wrong phase resource operation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Analyze resource usage phases: Identify the different phases or states in which the allocated resources are used or operated upon. This could include initialization, processing, and cleanup phases.

        analysis_step 9: Review resource operations in each phase: Look for any resource operations that are performed in the wrong phase. For example, resource deallocation in the initialization phase or resource allocation in the cleanup phase.

        analysis_step 10: Check for missing operations: Evaluate if there are any missing resource operations in a particular phase. Look for cases where resources are not properly initialized, used, or cleaned up in a specific phase.

        analysis_step 12: Examine resource release in cleanup phase: Check if all allocated resources are correctly released, even in the presence of errors or exceptional conditions. Look for cases where cleanup operations are skipped or not performed under certain control flow paths.

        analysis_step 13: Review resource ownership: Look for cases where ownership of a resource is transferred or shared between different components or phases. Ensure that ownership transfers are performed securely and that resources are not accessed or operated upon in the wrong phase.

        analysis_step 14: Analyze concurrent access: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization issues related to resource operations in different phases. 

        analysis_step 15: Analyze resource dependencies: Review the code to identify any dependencies between different allocated resources. Identify any potential issues where the order of resource operations is incorrect or inconsistent.

        analysis_step 16: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "insufficient control flow management":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify the control flow structures, such as conditionals (if-else statements, switch statements), loops (for, while, do-while loops), and function calls.

        analysis_step 3: Analyze conditional statements: Look for cases where the control flow may not follow the expected path, leading to unexpected behavior or security vulnerabilities. Check if all possible conditions are being considered and handled appropriately.

        analysis_step 4: Evaluate loop constructs: Look for cases where the loop conditions are not properly controlled or validated, leading to unexpected iterations or infinite loops.

        analysis_step 5: Review switch statements: Ensure that all possible values are accounted for and that appropriate actions are taken for each case. Look for cases where control flow can be manipulated or bypassed, leading to unintended consequences or security vulnerabilities.

        analysis_step 6: Assess function calls and returns: Look for cases where functions may return unexpected values or where the control flow may not be properly managed after a function call.

        analysis_step 7: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "race condition":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify the control flow structures, such as conditionals (if-else statements, switch statements), loops (for, while, do-while loops), and function calls.

        analysis_step 3: Analyze conditional statements: Look for cases where the control flow may not follow the expected path, leading to unexpected behavior or security vulnerabilities. Check if all possible conditions are being considered and handled appropriately.

        analysis_step 4: Evaluate loop constructs: Look for cases where the loop conditions are not properly controlled or validated, leading to unexpected iterations or infinite loops.

        analysis_step 5: Review switch statements: Ensure that all possible values are accounted for and that appropriate actions are taken for each case. Look for cases where control flow can be manipulated or bypassed, leading to unintended consequences or security vulnerabilities.

        analysis_step 6: Assess function calls and returns: Look for cases where functions may return unexpected values or where the control flow may not be properly managed after a function call.

        analysis_step 7: Identify concurrent code sections: Identify areas of the code where multiple threads or processes are accessing shared resources or performing operations concurrently.

        analysis_step 8: Review the synchronization mechanisms used in the code, such as locks, semaphores, or other concurrency control mechanisms. Check if these mechanisms are properly implemented, acquired, and released.

        analysis_step 9: Identify shared resources, such as variables, objects, or files, that are accessed concurrently by multiple threads or processes. Analyze how these shared resources are accessed and manipulated.

        analysis_step 10: Analyze critical sections of the code, which are sections that involve shared resources and require exclusive access to prevent race conditions. Check if critical sections are properly identified and protected with appropriate synchronization mechanisms. 

        analysis_step 11: Check for thread/process synchronization: Review how threads or processes are synchronized and coordinated in the code. Analyze the use of synchronization primitives like locks or semaphores and ensure they are used consistently and correctly.

        analysis_step 12: Assess timing dependencies: Analyze if the code assumes a specific order or timing of events that may not always hold true in a concurrent environment. Look for cases where the code relies on specific timing assumptions that can be violated, leading to race conditions.

        analysis_step 13: Examine how errors and exceptions are handled in the concurrent sections of the code. Look for cases where error conditions can disrupt the control flow and potentially lead to race conditions.

        analysis_step 14: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "excessive iteration":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify the control flow structures, such as conditionals (if-else statements, switch statements), loops (for, while, do-while loops), and function calls.

        analysis_step 3: Analyze conditional statements: Look for cases where the control flow may not follow the expected path, leading to unexpected behavior or security vulnerabilities. Check if all possible conditions are being considered and handled appropriately.

        analysis_step 4: Evaluate loop constructs: Look for cases where the loop conditions are not properly controlled or validated, leading to unexpected iterations or infinite loops.

        analysis_step 5: Review switch statements: Ensure that all possible values are accounted for and that appropriate actions are taken for each case. Look for cases where control flow can be manipulated or bypassed, leading to unintended consequences or security vulnerabilities.

        analysis_step 6: Assess function calls and returns: Look for cases where functions may return unexpected values or where the control flow may not be properly managed after a function call.

        analysis_step 7: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "incorrect behavior order":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify the control flow structures, such as conditionals (if-else statements, switch statements), loops (for, while, do-while loops), and function calls.

        analysis_step 3: Analyze conditional statements: Look for cases where the control flow may not follow the expected path, leading to unexpected behavior or security vulnerabilities. Check if all possible conditions are being considered and handled appropriately.

        analysis_step 4: Evaluate loop constructs: Look for cases where the loop conditions are not properly controlled or validated, leading to unexpected iterations or infinite loops.

        analysis_step 5: Review switch statements: Ensure that all possible values are accounted for and that appropriate actions are taken for each case. Look for cases where control flow can be manipulated or bypassed, leading to unintended consequences or security vulnerabilities.

        analysis_step 6: Assess function calls and returns: Look for cases where functions may return unexpected values or where the control flow may not be properly managed after a function call.

        analysis_step 7: Identify loops in the code: Pay attention to loops that iterate over a collection, perform repetitive tasks, or have a condition that controls the number of iterations.

        analysis_step 8: Analyze loop termination conditions: Check if the termination conditions are properly defined and ensure that the loop does not continue indefinitely or exceed the intended number of iterations. Look for cases where the termination condition is missing, incorrect, or can be manipulated, leading to excessive or infinite iterations.

        analysis_step 9: Assess loop counter manipulation: Examine how loop counters are manipulated within the code. Look for cases where loop counters are not incremented or decremented correctly, leading to unexpected iteration behavior.

        analysis_step 10: Evaluate loop exit points: Analyze the exit points within the loops, such as break statements or return statements. Check if these exit points are properly controlled and ensure that they are triggered when the desired condition is met. Look for cases where the loop exit points are missing or incorrectly placed, leading to excessive iterations.

        analysis_step 11: Consider nested loops: Analyze nested loops within the code and assess if they can potentially result in excessive iterations. Look for cases where the nesting of loops can lead to a significant increase in the number of iterations

        analysis_step 12: If the code contains recursive functions, evaluate the termination conditions of the recursion. Check if the termination conditions are properly defined and ensure that the recursion does not continue indefinitely. Look for cases where the termination condition is missing, incorrect, or can be manipulated, leading to excessive recursion.

        analysis_step 13: Analyze loop-related data structures: Examine any data structures used to control loop iterations, such as arrays or lists. Check if these data structures are properly initialized, updated, and accessed within the loop. Look for cases where the data structures are not managed correctly, potentially causing excessive iterations.

        analysis_step 14: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "uncontrolled resource consumption":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Look for loops, recursion, or other repetitive patterns that could potentially lead to excessive resource consumption. Check if the code follows efficient resource management practices.

        analysis_step 9: Identify any code sections where resources are allocated without proper checks for limits or constraints. Look for scenarios where the code might allocate resources based on user-controlled input, leading to uncontrolled consumption.

        analysis_step 10: Consider resource limits and quotas: Evaluate if the code enforces any limits or quotas on resource consumption. Check if these limits are properly defined, enforced, and monitored. Verify that the code does not exceed the specified limit.

        analysis_step 11: Analyze any performance optimizations implemented in the code. Ensure that these optimizations do not inadvertently lead to uncontrolled resource consumption. Look for cases where excessive caching, buffering, or parallelism might result in excessive resource usage.

        analysis_step 12: Review external dependencies: If the code relies on external libraries or APIs that involve resource consumption, analyze their documentation and source code for any potential vulnerabilities related to uncontrolled resource consumption.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "out-of-bounds access":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Look for loops, recursion, or other repetitive patterns that could potentially lead to excessive resource consumption. Check if the code follows efficient resource management practices.

        analysis_step 9: Identify any code sections where resources are allocated without proper checks for limits or constraints. Look for scenarios where the code might allocate resources based on user-controlled input, leading to uncontrolled consumption.

        analysis_step 10: Consider resource limits and quotas: Evaluate if the code enforces any limits or quotas on resource consumption. Check if these limits are properly defined, enforced, and monitored. Verify that the code does not exceed the specified limit.

        analysis_step 11: Analyze any performance optimizations implemented in the code. Ensure that these optimizations do not inadvertently lead to uncontrolled resource consumption. Look for cases where excessive caching, buffering, or parallelism might result in excessive resource usage.

        analysis_step 12: Identify data structures and arrays: Identify the data structures and arrays used in the code. Look for instances where these data structures are accessed or manipulated.

        analysis_step 13: Analyze array bounds: Review how arrays are accessed and ensure that proper bounds checking is performed. Look for cases where array indices or pointers are not properly validated, potentially leading to out-of-bounds access.

        analysis_step 14: Assess string operations: If the code involves string operations, evaluate how string lengths are determined and validated. Look for cases where string lengths are not properly checked, leading to buffer overflows or out-of-bounds access.

        analysis_step 15: Analyze loop constructs: Examine loop constructs within the code and assess if there are any potential issues related to out-of-bounds access. Look for cases where loop indices or conditions can lead to accessing elements beyond the bounds of an array or data structure.

        analysis_step 16: Review external dependencies: If the code relies on external libraries or APIs that involve resource consumption, analyze their documentation and source code for any potential vulnerabilities related to uncontrolled resource consumption.

        analysis_step 17: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',

    "unlimited resource allocation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Analyze concurrency issues: If the code involves multi-threading or concurrent execution, consider potential race conditions or synchronization problems related to resource control.

        analysis_step 7: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 8: Look for loops, recursion, or other repetitive patterns that could potentially lead to excessive resource consumption. Check if the code follows efficient resource management practices.

        analysis_step 9: Identify any code sections where resources are allocated without proper checks for limits or constraints. Look for scenarios where the code might allocate resources based on user-controlled input, leading to uncontrolled consumption.

        analysis_step 10: Consider resource limits and quotas: Evaluate if the code enforces any limits or quotas on resource consumption. Check if these limits are properly defined, enforced, and monitored. Verify that the code does not exceed the specified limit.

        analysis_step 11: Analyze any performance optimizations implemented in the code. Ensure that these optimizations do not inadvertently lead to uncontrolled resource consumption. Look for cases where excessive caching, buffering, or parallelism might result in excessive resource usage.

        analysis_step 12: Identify resource allocation calls: Identify the calls to resource allocation functions such as malloc(), calloc(), realloc() in C/C++.

        analysis_step 13: Evaluate input used in allocation: Check if user inputs or external data are used directly to determine the amount of resources to allocate. Look for cases where input validation is missing or insufficient, allowing for potential unlimited resource allocation.

        analysis_step 14: Analyze resource size calculation: Review how the size of resources is calculated before allocation. Look for cases where resource sizes are not properly checked, leading to potential unlimited resource allocation.

        analysis_step 15: Assess loop constructs: Look for cases where loop indices or conditions can lead to allocating resources in an uncontrolled manner.

        analysis_step 16: Check for missing or insufficient resource limits: Identify if there are missing or insufficient limits on the amount of resources that can be allocated. Analyze if these limits are properly enforced to prevent unlimited resource allocation.

        analysis_step 17: Review external dependencies: If the code relies on external libraries or APIs that involve resource consumption, analyze their documentation and source code for any potential vulnerabilities related to uncontrolled resource consumption.

        analysis_step 18: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "pointer issues":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identifying all the places in the source code where pointers are used.

        analysis_step 3: Check for Null Pointer Dereferences: Look for instances where a pointer could potentially be dereferenced before it has been adequately checked for null.

        analysis_step 4: Analyze Pointer Arithmetic: Analyze any sections of code where pointer arithmetic is used. Check for potential out-of-bounds reads or writes which could occur if pointer arithmetic results in a pointer pointing outside the intended memory area.

        analysis_step 5: Review Dynamic Memory Management: Pay particular attention to the dynamic memory management functions such as malloc, realloc, and free. Ensure that there are no memory leaks and dangling pointers.

        analysis_step 6: Inspect for Uninitialized Pointers: Ensure that all pointers are properly initialized before being used.

        analysis_step 7: Check Array-to-Pointer Decays: In C and C++, arrays often "decay" to pointers when passed to functions, which lead to potential out-of-bounds reads or writes if the size of the array is not properly managed.

        analysis_step 8: Review Usage of Function Pointers: Make sure that function pointers are always pointing to a valid function and that they are not being used to execute arbitrary code.

        analysis_step 9: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "null pointer dereference":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identifying all the places in the source code where pointers are used.

        analysis_step 3: Check for Null Pointer Dereferences: Look for instances where a pointer could potentially be dereferenced before it has been adequately checked for null.

        analysis_step 4: Analyze Pointer Arithmetic: Analyze any sections of code where pointer arithmetic is used. Check for potential out-of-bounds reads or writes which could occur if pointer arithmetic results in a pointer pointing outside the intended memory area.

        analysis_step 5: Review Dynamic Memory Management: Pay particular attention to the dynamic memory management functions such as malloc, realloc, and free. Ensure that there are no memory leaks and dangling pointers.

        analysis_step 6: Inspect for Uninitialized Pointers: Ensure that all pointers are properly initialized before being used.

        analysis_step 7: Check Array-to-Pointer Decays: In C and C++, arrays often "decay" to pointers when passed to functions, which lead to potential out-of-bounds reads or writes if the size of the array is not properly managed.

        analysis_step 8: Review Usage of Function Pointers: Make sure that function pointers are always pointing to a valid function and that they are not being used to execute arbitrary code.

        analysis_step 9: Locate all points in the code where pointers are dereferenced.

        analysis_step 10: For each point where a pointer is dereferenced, check if there is a preceding NULL check. A NULL check is a condition that verifies whether a pointer is NULL before it's dereferenced.

        analysis_step 11: Identify Risky Functions: Some functions, like strcpy, strcat, and sprint, are known to be risky when used with pointers. Check if these functions are used in the code and whether they are used with pointers that could be NULL.

        analysis_step 12: Review Functions that Return Pointers: Check if these functions can return NULL and if the returned value is checked for NULL before being dereferenced.

        analysis_step 13: Trace the Pointer Life Cycle: Follow the life cycle of the pointer from its inception to its last use. This can help identify cases where a pointer might be set to NULL in one part of the code and then dereferenced in another part without any NULL checks.

        analysis_step 14: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "pointer allocate/free issue":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identifying all the places in the source code where pointers are used.

        analysis_step 3: Check for Null Pointer Dereferences: Look for instances where a pointer could potentially be dereferenced before it has been adequately checked for null.

        analysis_step 4: Analyze Pointer Arithmetic: Analyze any sections of code where pointer arithmetic is used. Check for potential out-of-bounds reads or writes which could occur if pointer arithmetic results in a pointer pointing outside the intended memory area.

        analysis_step 5: Review Dynamic Memory Management: Pay particular attention to the dynamic memory management functions such as malloc, realloc, and free. Ensure that there are no memory leaks and dangling pointers.

        analysis_step 6: Inspect for Uninitialized Pointers: Ensure that all pointers are properly initialized before being used.

        analysis_step 7: Check Array-to-Pointer Decays: In C and C++, arrays often "decay" to pointers when passed to functions, which lead to potential out-of-bounds reads or writes if the size of the array is not properly managed.

        analysis_step 8: Review Usage of Function Pointers: Make sure that function pointers are always pointing to a valid function and that they are not being used to execute arbitrary code.

        analysis_step 9: Identify Dynamic Memory Allocation and Deallocation.

        analysis_step 10: Review Memory Allocation: For each point where dynamic memory is allocated (e.g., via malloc or calloc), ensure that the amount of memory being allocated is appropriate, and that the return value is being checked.

        analysis_step 11: Check Memory Deallocation: For every memory deallocation (i.e., free), ensure that the pointer being freed was allocated earlier and that it isn't being used after the free operation.

        analysis_step 12: Examine Multiple Deallocation: Watch out for instances where the same memory space is freed more than once (double free).

        analysis_step 13: Inspect Memory Leaks: Look for allocated memory that isn't subsequently deallocated before the pointer goes out of scope or before the program terminates.

        analysis_step 14: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "pointer range limitation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identifying all the places in the source code where pointers are used.

        analysis_step 3: Check for Null Pointer Dereferences: Look for instances where a pointer could potentially be dereferenced before it has been adequately checked for null.

        analysis_step 4: Analyze Pointer Arithmetic: Analyze any sections of code where pointer arithmetic is used. Check for potential out-of-bounds reads or writes which could occur if pointer arithmetic results in a pointer pointing outside the intended memory area.

        analysis_step 5: Review Dynamic Memory Management: Pay particular attention to the dynamic memory management functions such as malloc, realloc, and free. Ensure that there are no memory leaks and dangling pointers.

        analysis_step 6: Inspect for Uninitialized Pointers: Ensure that all pointers are properly initialized before being used.

        analysis_step 7: Check Array-to-Pointer Decays: In C and C++, arrays often "decay" to pointers when passed to functions, which lead to potential out-of-bounds reads or writes if the size of the array is not properly managed.

        analysis_step 8: Review Usage of Function Pointers: Make sure that function pointers are always pointing to a valid function and that they are not being used to execute arbitrary code.

        analysis_step 9: Carefully examine all instances of pointer arithmetic and array indexing. Ensure that pointers are not incremented or decremented beyond the bounds of the allocated memory, and that array indices do not exceed the size of the array.

        analysis_step 10: For every instance where a pointer is incremented, decremented, or an array is indexed, ensure that there are appropriate boundary checks. The code should verify that the pointer or array index is within the allocated range before accessing the memory.

        analysis_step 11: Review Use of Library Functions: Pay special attention to the use of library functions like strcpy, strcat, gets, and sprintf, which do not check for buffer overflow. If these functions are used, ensure that there are explicit checks for buffer overflow.

        analysis_step 12: Inspect for Signedness Issues for example, if an array index or pointer offset is a signed integer, it can lead to buffer overflow when a negative value is used.

        analysis_step 13: Analyze Dynamic Memory Allocations: When dynamic memory is allocated for arrays or where pointers are used, ensure the code correctly calculates the size of the memory to be allocated and that it fits within the intended range. 

        analysis_step 14: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',

    "numerical resource limitation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify numerical resources areas(components) through static analysis.

        analysis_step 3: After the resources are identified, the next step is to review whether the usage of these resources might exceed predefined limits.
        
        analysis_step 4: For each resource allocation and usage, there should be a corresponding check to ensure that the numerical resource limits are not exceeded.  If these checks are missing or are incorrectly implemented, it can lead to this type of vulnerability.

        analysis_step 5: Review Resource Release.

        analysis_step 6: Review on Loops and Recursion.

        analysis_step 7: Check the Multi-threading and Concurrency.

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "wrap-around error":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify numerical resources areas(components) through static analysis.

        analysis_step 3: review whether these resources introduce wrap-around error(CWE-128) vulnerability.
        
        analysis_step 4: For each resource allocation and usage, there should be a corresponding check to ensure that the numerical resource limits are not exceeded.  If these checks are missing or are incorrectly implemented, it can lead to this type of vulnerability.

        analysis_step 5: Identifying Integer Variables and review whether these Variables will introduce the wrap-around error.

        analysis_step 6: Review all arithmetic operations involving these variables. Look for operations such as addition, subtraction, multiplication, and division, especially those where the result of the operation is stored in the integer variable.
        
        analysis_step 7: Check for Limit Checks.

        analysis_step 8: Check for Overflow/Underflow: For each of the identified operations, check if there are appropriate measures in place to prevent integer overflow or underflow. This could involve checks before the operation is performed to ensure that the result will not exceed the limits of the integer type.

        analysis_step 9: Check Type Conversions: Review any type conversions in the code, especially those involving integer types. If a larger integer type is converted to a smaller type without appropriate checks, it can lead to a wrap-around error.

        analysis_step 10: Review Resource Release.

        analysis_step 11: Review on Loops and Recursion.

        analysis_step 12: Check the Multi-threading and Concurrency.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
         
    ''',
    "incorrect integer bit shift":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify numerical resources areas(components) through static analysis.

        analysis_step 3: After the resources are identified, the next step is to review whether the usage of these resources might exceed predefined limits.
        
        analysis_step 4: For each resource allocation and usage, there should be a corresponding check to ensure that the numerical resource limits are not exceeded.  If these checks are missing or are incorrectly implemented, it can lead to this type of vulnerability.

        analysis_step 5: Review Resource Release.

        analysis_step 6: Identify Bit Shift Operations

        analysis_step 7: Review Left Shift Operations which may cause a loss of data if the shift value is too large, or can lead to an overflow if the integer type is signed.

        analysis_step 8: Review Right Shift Operations: For right shift operations, check if they are arithmetic or logical shifts. In arithmetic shifts, the sign bit is preserved which can lead to unexpected results if not handled correctly. For logical shifts, the sign bit is not preserved which can also lead to unexpected results.

        analysis_step 9: Check Shift Values.
    
        analysis_step 10: Review on Loops and Recursion.

        analysis_step 11: Check the Multi-threading and Concurrency.

        analysis_step 12: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "insufficient real number precision":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify numerical resources areas(components) through static analysis.

        analysis_step 3: Identify Real Number Use.
        
        analysis_step 4: Review Precision Handling: Check if the precision used is appropriate for the calculations being performed.

        analysis_step 5: Check Calculation

        analysis_step 6: After the resources are identified, the next step is to review whether the usage of these resources might exceed predefined limits.
        
        analysis_step 7: For each resource allocation and usage, there should be a corresponding check to ensure that the numerical resource limits are not exceeded.  If these checks are missing or are incorrectly implemented, it can lead to this type of vulnerability.

        analysis_step 8: Review Resource Release.

        analysis_step 9: Check Conversion Operations: Pay attention to any type conversions involving real numbers.  Converting from a high-precision type to a lower-precision type can result in precision loss.

        analysis_step 10: Review on Loops and Recursion.

        analysis_step 11: Check the Multi-threading and Concurrency.

        analysis_step 12: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "pointer calculation error":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Evaluate Length Calculation: Next, evaluate the way the length of the string is being calculated. Look for the use of functions such as strlen, sizeof, or manual length calculations. If the calculation does not consider the null-terminating character or doesn't take into account the length of the destination buffer, it may lead to incorrect string length calculation.

        analysis_step 3: Buffer Allocation: Check how memory is allocated for strings. If the size of the buffer allocated is reliant on the outcome of the string length calculation, it could lead to buffer overflows if the calculation is incorrect.

        analysis_step 4: String Operations: Focus on sections of code where strings are passed as arguments to functions, especially if these functions perform operations on the strings that could affect their length.

        analysis_step 5: Boundary Conditions: Check how the code handles boundary conditions, such as the maximum allowable string length. If the boundary conditions are not handled properly, it could lead to vulnerabilities.
    
        analysis_step 6: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''', 
    "incorrect string length calculation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: review the String Operations: Analyze the operations performed on strings after the length calculation. 
        
        analysis_step 3: Check the Buffer Size: Analyze how the size of the buffer, where the string is stored, is calculated. If the size of the buffer is calculated incorrectly, it might lead to buffer overflow or underflow issues.

        analysis_step 4: Review the Encoding: Check if the software correctly handles different types of encoding. Different types of encoding may represent a single character using varying numbers of bytes. Therefore, a misunderstanding about the type of encoding used can lead to an incorrect calculation of the string length.

        analysis_step 5: Examine the Null Terminators: In languages like C and C++, strings are often null-terminated. If string length calculations do not take into account the null terminator, this can lead to incorrect results.

        analysis_step 6: Use of Untrusted Data: Check if untrusted data is used in string length calculations or string operations. If this is the case, the code should validate and sanitize this data before use.  
    
        analysis_step 7: Identify the API Calls: Look for API calls that are used to calculate the length of a string or manipulate strings. These could include functions like strlen(), strncpy(), substring(), indexOf(), etc. in languages like C, C++, Java, etc.

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "off-by-one error":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Focus on Loop Constructs: Off-by-one errors are often found in loops that iterate over arrays or other data structures. Pay particular attention to for, while, and do-while loops. Check whether the loop variables are correctly initialized, incremented and whether the termination condition is correctly defined.

        analysis_step 3: Review array indexes and Boundaries: An important part of the review process should be examining how array indices are managed. Look for instances where the array index may exceed the array's boundary. Remember that arrays in most programming languages are zero-indexed, therefore, a common off-by-one error is to use the array's length as an index.

        analysis_step 4: Buffer Operations: Review any buffer operations, like strcpy, strncpy, memcpy, etc. These operations can often lead to off-by-one errors if not properly controlled. The size of the destination buffer should always be less than or equal to the size of the source buffer minus one (to accommodate the null character in case of strings).

        analysis_step 5: Function and API Calls: Pay attention to any function or API calls that manipulate data structures. Understand their behavior and ensure they are used correctly. Some functions/APIs might have inclusive or exclusive boundaries which, if overlooked, could lead to off-by-one errors.
    
        analysis_step 6: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "division by zero":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify Potentially Vulnerable Operations: The first step is to identify any instances in your codebase where division operations are performed. This is because a division by zero vulnerability occurs when the program divides a number by zero, causing a crash or unpredictable behavior.

        analysis_step 3: Review the Divisor: The second step is to examine the divisor in all division operations. If the divisor can be zero, then there is a potential division by zero vulnerability. It's important to analyze all possible execution paths to ensure that the divisor isn't zero in any case.

        analysis_step 4: Understand Control Flow: Understanding the control flow of the program is essential to identify any conditional statements that may affect the divisor. If there are conditions under which the divisor could be set to zero, these paths in the code need to be closely examined.

        analysis_step 5: Examine Use of Safe Functions API: Safe functions and libraries can help prevent division by zero errors.
    
        analysis_step 6: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "encoding error":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Review Input Handling: Check if the data from all entry points (like user input fields, file uploads, etc.) is sanitized before processing. Look for any cases where the application may execute or interpret the input.

        analysis_step 3: Examine Output Processing: Look for any instances where data is output without proper encoding..

        analysis_step 4: Check for Data Validation: Check if the application validates data at all entry points. This includes checking for the correct data type, length, format, and range.

        analysis_step 5: Scan for Use of Dangerous APIs: Some APIs are known to be vulnerable to encoding errors.

        analysis_step 6: Inspect Encoding Practices: Pay attention to how encoding and decoding are done in the application. Look for any inconsistency in these practices. Any data that is decoded should be encoded again before it is used or outputted.

        analysis_step 7: Review the Use of Regular Expressions: Regular expressions should be reviewed for any improper use that could lead to encoding errors.

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "improper input validation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify all the points where the software accepts input. This could be in the form of command-line arguments, data read from a file, or data received over a network connection, etc.

        analysis_step 3: Check Validation Routines: These routines should check for things like the type, length, format, and range of the input.

        analysis_step 4: Trace Input Data Flow: Check to see if the input data is used in any sensitive operations, such as file operations or SQL queries. If the data is used in these operations without being properly sanitized, this could lead to vulnerabilities such as path traversal or SQL injection.

        analysis_step 5: Check Malicious Input: Test the software with malicious input, such as input that exceeds the expected length or contains special characters. See how the software reacts to this input and if it is able to handle it securely.

        analysis_step 6: Step by step to determine if there are potential vulnerabilities based on the information obtained above,
    ''',
    "improper syntactic validation":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify all the points where the software accepts input. This could be in the form of command-line arguments, data read from a file, or data received over a network connection, etc.

        analysis_step 3: Check Validation Routines: These routines should check for things like the type, length, format, and range of the input.

        analysis_step 4: Trace Input Data Flow: Check to see if the input data is used in any sensitive operations, such as file operations or SQL queries. If the data is used in these operations without being properly sanitized, this could lead to vulnerabilities such as path traversal or SQL injection.

        analysis_step 5: Check Malicious Input: Test the software with malicious input, such as input that exceeds the expected length or contains special characters. See how the software reacts to this input and if it is able to handle it securely.

        analysis_step 6: Check for Bypasses: Look for vulnerabilities that an attacker might exploit to bypass the validation routines. For example, if an application trims white spaces at the end of an input to check its length, an attacker might add extra spaces to pass the validation check.

        analysis_step 7: Inspect Sensitive Operations: If user-supplied data is used in sensitive operations like database queries, file operations, or command execution, make sure it is properly sanitized and parameterized to prevent injection attacks.

        analysis_step 8: Review Use of Security Features: Check if the application uses security features provided by the framework or the language, like prepared statements in SQL or encoding functions in HTML.

        analysis_step 9: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "path traversal":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify all the points where the software accepts input. This could be in the form of command-line arguments, data read from a file, or data received over a network connection, etc.

        analysis_step 3: Check Validation Routines: These routines should check for things like the type, length, format, and range of the input.

        analysis_step 4: Trace Input Data Flow: Check to see if the input data is used in any sensitive operations, such as file operations or SQL queries. If the data is used in these operations without being properly sanitized, this could lead to vulnerabilities such as path traversal or SQL injection.

        analysis_step 5: Check Malicious Input: Test the software with malicious input, such as input that exceeds the expected length or contains special characters. See how the software reacts to this input and if it is able to handle it securely.

        analysis_step 6: Focus on areas where user input is used to construct file names or paths. This could be within web application logic, scripts, or anywhere user-supplied input is read or processed.

        analysis_step 7: Look for all areas where user-supplied input is accepted. This could be form fields, URL parameters, HTTP headers, cookies, or any other input vector. 

        analysis_step 8: Path Traversal vulnerabilities often occur because input validation is insufficient, incorrect, or missing entirely. Look for any routines that should be checking for characters like "../" or ".." but aren't.

        analysis_step 9: Review File Operation Functions: Look at how the application handles file operations like open, read, write, etc. Check for any use of unchecked or unvalidated user input in these operations. This could be a potential vector for Path Traversal attacks.

        analysis_step 10: Look at the overall logic of the application. Is there a reason why user input is being used to construct file paths? Could this logic be altered to reduce or eliminate the risk of Path Traversal?

        analysis_step 11: Check if the application is performing any kind of sanitization on user input. If there are implementations of escape functions for special characters or the application is using any kind of encoding for the user inputs, it can potentially limit the impact of path traversal attacks.

        analysis_step 12: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "injection":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Injection vulnerabilities often target sensitive data. Identify parts of your code where sensitive data is processed. These may include areas where user input is accepted, where files are read or written, and where communication with databases occurs.

        analysis_step 3: Analyze User Input Handling: Specifically, look for instances where input is directly used in a command or query. If user input is not properly sanitized or parameterized, it may leave your application vulnerable to injection.

        analysis_step 4: Look for Dynamic Code Execution: Dynamic execution of code can potentially allow for code injection. Look for instances where your application generates code on the fly and executes it. 

        analysis_step 5: Analyze Database Queries: SQL Injection is a common type of injection vulnerability. Analyze your database queries to ensure they are safe.

        analysis_step 6: Examine File Operations: File operations can be another source of injection vulnerabilities. Look for instances where your application reads from or writes to files based on user input.

        analysis_step 7: Review the Use of External Libraries/Dependencies: External libraries and dependencies can introduce injection vulnerabilities.

        analysis_step 8: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "format string injection":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Injection vulnerabilities often target sensitive data. Identify parts of your code where sensitive data is processed. These may include areas where user input is accepted, where files are read or written, and where communication with databases occurs.

        analysis_step 3: Analyze User Input Handling: Specifically, look for instances where input is directly used in a command or query. If user input is not properly sanitized or parameterized, it may leave your application vulnerable to injection.

        analysis_step 4: Look for Dynamic Code Execution: Dynamic execution of code can potentially allow for code injection. Look for instances where your application generates code on the fly and executes it. 

        analysis_step 5: Analyze Database Queries: SQL Injection is a common type of injection vulnerability. Analyze your database queries to ensure they are safe.

        analysis_step 6: Examine File Operations: File operations can be another source of injection vulnerabilities. Look for instances where your application reads from or writes to files based on user input.

        analysis_step 7: Identify Potential Vulnerable Functions: Format string vulnerabilities typically occur in functions such as printf(), sprintf(), fprintf(), and similar functions that accept a format string and a variable number of arguments.

        analysis_step 8: Check for Uncontrolled Format Strings: The vulnerability occurs when the format string can be controlled by an attacker. Look for instances where user input, file input, or network input can directly influence the format string.

        analysis_step 9: Analyze Argument Handling: The arguments passed to the function can also be a source of vulnerabilities. Check that the number and types of arguments passed to the function match the format string.

        analysis_step 10: Check for the use of dynamic format strings: Check for instances where the format string is constructed dynamically, especially when user input is used in its construction. This is another common cause of format string vulnerabilities.

        analysis_step 11: Review handling of string formatting: Using the wrong format specifier can lead to undefined behavior and potentially exploitable vulnerabilities. Check to see if the correct format specifiers are being used for the given arguments.

        analysis_step 12: Review the Use of External Libraries/Dependencies: External libraries and dependencies can introduce injection vulnerabilities.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "command injection":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Injection vulnerabilities often target sensitive data. Identify parts of your code where sensitive data is processed. These may include areas where user input is accepted, where files are read or written, and where communication with databases occurs.

        analysis_step 3: Analyze User Input Handling: Specifically, look for instances where input is directly used in a command or query. If user input is not properly sanitized or parameterized, it may leave your application vulnerable to injection.

        analysis_step 4: Look for Dynamic Code Execution: Dynamic execution of code can potentially allow for code injection. Look for instances where your application generates code on the fly and executes it. 

        analysis_step 5: Analyze Database Queries: SQL Injection is a common type of injection vulnerability. Analyze your database queries to ensure they are safe.

        analysis_step 6: Examine File Operations: File operations can be another source of injection vulnerabilities. Look for instances where your application reads from or writes to files based on user input.

        analysis_step 7: Identify Areas of User Input: Identify all areas in your code where user inputs are accepted. This can include form data, URL parameters, and data read from files.

        analysis_step 8: Analyze Command Execution Functions: Look for functions that execute system commands or shell commands, such as system(), exec(), popen(). These are potential points for command injection if user input is passed to these functions without proper sanitization.

        analysis_step 9: Check for Input Validation and Sanitization: Check to see if user inputs are properly validated and sanitized before they are used in command execution functions.

        analysis_step 10: Examine String Concatenation and Formatting: Review your code to ensure that user input is not being concatenated or formatted into a command string without proper sanitization.

        analysis_step 11: Review the Use of External Libraries/Dependencies: External libraries and dependencies can introduce injection vulnerabilities.

        analysis_step 12: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "code injection":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Injection vulnerabilities often target sensitive data. Identify parts of your code where sensitive data is processed. These may include areas where user input is accepted, where files are read or written, and where communication with databases occurs.

        analysis_step 3: Analyze User Input Handling: Specifically, look for instances where input is directly used in a command or query. If user input is not properly sanitized or parameterized, it may leave your application vulnerable to injection.

        analysis_step 4: Look for Dynamic Code Execution: Dynamic execution of code can potentially allow for code injection. Look for instances where your application generates code on the fly and executes it. 

        analysis_step 5: Analyze Database Queries: SQL Injection is a common type of injection vulnerability. Analyze your database queries to ensure they are safe.

        analysis_step 6: Examine File Operations: File operations can be another source of injection vulnerabilities. Look for instances where your application reads from or writes to files based on user input.

        analysis_step 7: Analyze User Input Handling: If user input is used in generating and executing code without proper sanitization, your application is likely vulnerable to code injection.

        analysis_step 8: Examine External Command Execution: Code injection can also occur when your application executes system commands. Look for instances where your application generates and executes system commands using user input or other untrusted data.

        analysis_step 9: Check File Operations: If your application writes user input to a file that is later executed as code, it could be vulnerable.

        analysis_step 10: Review Use of Interpreters: If your application uses an interpreter for a programming or scripting language, check how it handles user input. Improper use of interpreters can often lead to code injection vulnerabilities.

        analysis_step 11: Identify Use of Unsafe APIs: Some APIs can introduce code injection vulnerabilities. Identify the use of such APIs in your code and replace them with safer alternatives, if available.

        analysis_step 12: Review the Use of External Libraries/Dependencies: External libraries and dependencies can introduce injection vulnerabilities.

        analysis_step 13: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "inconsistent unverified":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Identify the components that might be affected by this vulnerability. These are typically components that handle user input, such as forms, API endpoints, and data processing routines. Focus on areas of the code where data is received from an external party without any form of verification or data sanitization.

        analysis_step 3: Examine how the data flows through the application. Look at how user-provided data is processed, stored, and outputted. Trace the path of unverified data to see if it is used in any sensitive operations such as database queries, file operations, or any form of command execution.

        analysis_step 4: Check for Input Validation: Look at the code handling user input and check if there's any form of validation or sanitization of the data. If there's none, then that's a potential point of vulnerability.

        analysis_step 5: Inspect Security Controls: Check if there are any access controls or authentication checks that are bypassed or inconsistently applied. Also, check if there are any encryption mechanisms in place for sensitive data.

        analysis_step 6: Look for Insecure Coding Practices: Look for insecure coding practices such as the use of deprecated functions, hard-coded credentials, or any other practices that could lead to security vulnerabilities.

        analysis_step 7: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "improper special elements":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.
        
        analysis_step 2: Collect and understand the requirements and rules related to special elements in the application.

        analysis_step 3: Gain an in-depth understanding of the application's structure, data flow, and behavior. 

        analysis_step 4: Identify the sections of the source code where special elements are processed. These sections typically include interactions with user input, file systems, databases, and network communications.

        analysis_step 5: Check for places where untrusted inputs are not properly sanitized before being processed as special elements. This can lead to vulnerabilities such as command injection, cross-site scripting (XSS), and SQL injection.

        analysis_step 6: Review instances where special elements are validated insufficiently or inaccurately. Ensure that proper validation and handling mechanisms are in place to prevent vulnerabilities.

        analysis_step 7: Look for insecure use of special elements, such as hard-coded credentials or insecure direct object references. Ensure that secure coding practices are followed throughout the application.

        analysis_step 8: Review the code for any usage of outdated or deprecated APIs. These APIs can pose security risks and should be replaced with more secure alternatives.

        analysis_step 9: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "syntax errors":
    '''
        Step 0: Understand grammar: Understand the specific grammar rules of the programming language in use.
        
        Step 1: Parse the code: Begin by parsing the source code, breaking it down into tokens and elements. Identify keywords, operators, variables, and statements.
        
        Step 2: Identify punctuation Errors: Missing or misplaced semicolons at the end of statements; Incorrect use of commas, parentheses, brackets, or braces.
        
        analysis_step 3: Identify identifier errors: Undeclared variables or functions; Incorrect variable names or function names; Redefinition of variables or functions with the same name in the same scope.
        
        analysis_step 4: Identify type errors: Mismatches between variable types and the values assigned to them; Invalid type conversions or casts; Incompatible types in expressions or function arguments.
        
        Step 5: Identify syntax errors in expressions: Incorrect operators or operator precedence; Incorrect use of assignment operators, arithmetic operators, or logical operators; Missing or extra operands in expressions.
        
        Step 6: Identify control flow errors: Missing or misplaced control flow statements (e.g., if, else, while, for, switch); Incorrect use of conditions in control statements;Improperly nested control structures.

        Step 7: Identify function errors: Mismatched function prototypes and definitions; Missing or incorrect function parameters; Incorrect return types or missing return statements in functions.

        Step 8: Identify pointer and memory errors: Dereferencing null or uninitialized pointers; Memory leaks or improper memory management; Array index out of bounds errors.

        Step 9: Identify string and character errors: Improper use of string functions (C++) or character manipulation functions (C); Incorrect string or character literals.

        Step 10: Identify header file errors: Missing or incorrect header file inclusion directives (#include). Name resolution issues related to namespaces.

        Step 11: Identify preprocessor errors: Incorrect use of preprocessor directives (e.g., #define, #ifdef, #ifndef); Conditional compilation issues.

        Step 12: Identify comments and documentation errors: Incorrectly formatted or nested comments; Documentation comments (e.g., Doxygen) that are incomplete or improperly structured.

        Step 13: Identify miscellaneous syntax errors that do not fit into the above categories.

        Step 14: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    ''',
    "unknown":
    '''
        analysis_step0: understanding the code function.
        
        analysis_step1: Analyze the code structure.

        analysis_step2: Identify exploit components.

        analysis_step3: Review the exploit function.
        
        analysis_step4: Determine if there are potential vulnerabilities step by step
    ''',
    "buffer overflow":
    '''
        analysis_step 0: Understand the code function.

        analysis_step 1: Analyze the code logic structure.

        analysis_step 2: Identify resource allocation: Look for code sections where resources such as files, sockets, database connections, or memory are allocated. This can include functions like fopen(), malloc(), socket(), or database connection functions.

        analysis_step 3: Check for resource release: Review the code to ensure that all allocated resources are properly released after use. Look for corresponding calls to fclose(), free(), close(), or database connection release functions.

        analysis_step 4: Handle resource allocation failures: Look for error checking and appropriate error handling mechanisms. Check if the code gracefully handles cases where resource allocation fails and avoids leaving resources in an inconsistent or unrecoverable state.

        analysis_step 5: Look for resource leaks: Identify points in the code where allocated resources are not released properly under all possible control flow paths. Pay particular attention to error handling scenarios and early exit points.

        analysis_step 6: Identify buffer variables: Identify the buffer variables used in the code. These variables are typically arrays or pointers that hold data.

        analysis_step 7: Checking the number of mask format bits involved in the code, an overflow occurs to write the reserved bits, causing the kernel to crash.
        
        analysis_step 8: Consider boundary cases: Test cases where available system resources are limited or when resource allocation exceeds expected limits.

        analysis_step 9: Look for loops, recursion, or other repetitive patterns that could potentially lead to excessive resource consumption. Check if the code follows efficient resource management practices.

        analysis_step 10: Identify any code sections where resources are allocated without proper checks for limits or constraints. Look for scenarios where the code might allocate resources based on user-controlled input, leading to uncontrolled consumption.

        analysis_step 11: Consider resource limits and quotas: Evaluate if the code enforces any limits or quotas on resource consumption. Check if these limits are properly defined, enforced, and monitored. Verify that the code does not exceed the specified limit.
        
        analysis_step 12: Analyze buffer size determination: Review how the size of buffers is determined and whether it is properly validated. Look for cases where buffer sizes are not properly checked, leading to potential buffer overflow vulnerabilities.

        analysis_step 13: Analyze string or memory operations: Examine string or memory operations, such as strcpy, strcat, memcpy, or sprintf, that manipulate or copy data into buffers.

        analysis_step 14: Check for unsafe functions: Identify if the code uses unsafe functions that are prone to buffer overflows, such as gets or scanf. Analyze if these functions are used in a safe and controlled manner or if they should be replaced with safer alternatives.

        analysis_step 15: Review external dependencies: If the code relies on external libraries or APIs that involve resource consumption, analyze their documentation and source code for any potential vulnerabilities related to uncontrolled resource consumption.

        analysis_step 16: Combine the information obtained above, determine if there are potential vulnerabilities step by step.

    ''',
    "auto_prompts":
    '''
        analysis_step0: understanding the code function.
        
        analysis_step1: Analyze the code structure.

        analysis_step2: Identify components may introduce the vulnerbility.

        analysis_step3: Check for unsafe functions that may introduce vulnerabilities.
        
        analysis_step4: Combine the information obtained above, determine if there are potential vulnerabilities step by step.
    '''
}


from LLMmodel.GPT import GPT
from LLMmodel.Qwen import Toyi
from LLMmodel.LLama import Vicuna
from COTTree import *

class Chainofthought():
    def __init__(self, LLM = Toyi(), mode="strict"):
        self.Knowledge_set = Knowledge
        self.LLM = LLM
        self.mode = mode
        
    def _generate_normal_cot(self,result:str):
        filtered_paragraph = []
        paragraphs = result.lower().split('analysis_step')
        for p in paragraphs[1:-1]: filtered_paragraph.append(p.replace("\n", "").replace("\n", "").replace("\n", ""))
        cleanstr= ""
        cleanstrlist = paragraphs[-1].split('\n\n')
        for i in cleanstrlist[:-1]:
            cleanstr+=i
        filtered_paragraph.append(cleanstr.replace("\n", ""))
        return '\n\n'.join(filtered_paragraph)
       
    def _generate_cot(self,result:str):  
        filtered_paragraph = []
        paragraphs = result.split('\n\n')  # 假设文段之间由两个换行符分隔
        if paragraphs and (paragraphs[0].strip().startswith("analysis_step") or paragraphs[0].strip().startswith("Analysis_step")):
            filtered_paragraph.append(paragraphs[0])
        for p in paragraphs[1:]:
            lines = p.split('\n')
            first_line = lines[0].strip()
            if first_line.startswith("analysis_step") or first_line.startswith("Analysis_step") or first_line.startswith("analysis step"):
                filtered_paragraph.append(p)

        return '\n\n'.join(filtered_paragraph)
    
    def _extract_text_between_numbers(self,paragraph):
        import re
        pattern = r"\b(\d+)\b"  # 匹配一个或多个数字的正则表达式模式
        numbers = re.findall(pattern, paragraph)
        extracted_text = []
        
        prev_num = None
        for num in numbers:
            if prev_num is not None:
                start_index = paragraph.index(prev_num) + len(prev_num)
                end_index = paragraph.index(num)
                extracted_text.append(paragraph[start_index:end_index].strip())
            prev_num = num
        
        return extracted_text

    def cot_analysis(self, VulClass, code, confidence)->str:
            try:
                chain = self.Knowledge_set[VulClass]
            except KeyError:
                print(VulClass)
                print("unknown use")
                chain = self.Knowledge_set["auto_prompts"] 
            
            if confidence >= 0.5 :
                if VulClass == "auto_prompts":
                    marks = "potential"
                else:
                    marks = VulClass
                Template = f'''
                    You are now a security expert familiar with Linux OS and CVE/CWE security knowledge.
                    After static tool analysis, it is seriously suspected that following function fragment limited by triple backticks contains {marks} vulnerability
                    ```{code}```
                    Carefully follow the steps below "{chain}" think through whether the {marks} vulnerability actually exists.
                    The review should follow a strict review method.
                    You must add "@@" at the end of your answer paragraph
                '''
            else:
                Template = f'''
                    You are now a security expert familiar with Linux OS and CVE/CWE security knowledge.
                    Please determine whether the following function fragment limited by triple backticks is safe. 
                    ```{code}```
                    strictly follow the steps below "{chain}" think through the question. 
                    You must add "@@" at the end of your answer paragraph
                '''
            answer = self.LLM.get_completion(Template).replace(":\n", ":")
            txt = self._generate_normal_cot(answer)
            pre_cot = self._extract_text_between_numbers(txt)
            cot = []
            for i in pre_cot:
                cot.append(i.replace(": ","").replace(". ",""))
            return cot
    