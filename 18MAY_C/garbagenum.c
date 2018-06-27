#include <stdio.h>

int main() {
        int x; 
    // A number of bytes (in this case, sizeof(int), usually 4 B) already allocated
    // starting at a memory location &x.

    printf("Value at address %p: %d", &x, x); 
    // Value at &x may be any int, which is unpredictable
}