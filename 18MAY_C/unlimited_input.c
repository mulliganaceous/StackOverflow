#include <stdio.h>
#define SIZE 11

int main() {
	char input[SIZE];
	while(1){
		scanf("%s", input);
		printf("Address: %p, String: %s\n\n", input, input);
	}
	return 0;
}