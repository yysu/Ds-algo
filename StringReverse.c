#include <stdio.h>
#include <string.h>

void reverse(char* str, int n) {
	if(n < 0) {
	} else {
		printf("%c", str[n]);
		n--;
		reverse(str,n);
	}
}
int main() {
	// your code goes here
	char str[6] ="string";
	int n = strlen(str);
	reverse(str, n-1);
	return 0;
}
