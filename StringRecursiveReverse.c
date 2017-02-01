#include <stdio.h>
void reverse(char *str) {
	if(*str) {
		reverse(str+1);
		printf("%c", *str);
	}
}
int main(void) {
	// your code goes here
	char a[]= "Geeks for geek";
	reverse(a);
	return 0;
}
