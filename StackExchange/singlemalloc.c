#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

const int rows = 1000;
const int cols = 2048;
uint32_t **mal_ptr = malloc(rows*sizeof(uint32_t *));
