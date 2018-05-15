#include <stdio.h>

int main() {
struct sample
{
    int a;
    char b;
    char d;
};

struct sample obj;
struct sample *ptr;

printf("%d", sizeof(*ptr));
}
