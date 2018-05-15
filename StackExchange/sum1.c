#include<stdio.h>

int sum(int k) {
    if (k < 1) return 0;

    int sum = 0;
    int term = 1;
    int sumn = 0;
    int val = -1;

    while (term <= k) {
        sumn = 1;
        for (int j = 0; j < term; j++) {
            val += 2; sumn *= val;
        }
        sum += sumn;
        term++;
    }
    return sum;
}

int main() {
    for (int k = 0; k < 10; k++)
        printf("%d\n", sum(k));

    return 3;
}