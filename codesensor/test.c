#include <stdio.h>
#include <string.h>

int text() {
    // 字符串复制
    char str1[20] = "Hello";
    char str2[20];
    strcpy(str2, str1);
    printf("str2: %s\n", str2);

    // 字符串连接
    char str3[20] = " World";
    strcat(str1, str3);
    printf("str1: %s\n", str1);

    // 内存更改
    char arr1[] = "123456";
    char arr2[] = "abcdef";
    memcpy(arr1, arr2, 4);
    printf("arr1: %s\n", arr1);

    // 格式化字符串输出
    char buffer[50];
    int num = 123;
    sprintf(buffer, "The number is %d", num);
    printf("%s\n", buffer);

    // 无格式字符串输入
    char input[50];
    printf("Enter a string: ");
    fgets(input, 50, stdin);
    printf("You entered: %s", input);

    // 格式化字符串输入
    char name[20];
    int age;
    printf("Enter your name and age: ");
    scanf("%s %d", name, &age);
    printf("Name: %s, Age: %d\n", name, age);

    // 数组元素写入
    int arr3[5] = {1, 2, 3, 4, 5};
    arr3[2] = 10;
    printf("arr3[2]: %d\n", arr3[2]);

    return 0;
}