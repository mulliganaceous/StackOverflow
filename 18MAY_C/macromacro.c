#include <stdio.h>
#define HELLOWORLD printf("Hello, World!") // Macro
#define MAIN int main() { HELLOWORLD; return 0; } // Macro containing HELLOWORLD macro
MAIN