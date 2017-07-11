#include <stdio.h>

int main(void) {
	// your code goes here
	char str1[3] = {'a','b','c'};
	char str2[3] = {'a','b','c'};
	int len1 = sizeof(str1)/sizeof(char);
	int len2 = sizeof(str2)/sizeof(char);
 

	char output[len1+len2];

	for(int i =0; i< len1; i++)
		output[i] = str1[i];

	int index = 0;

	for(int i = len1; i< len1 + len2; i++)
		output[i] = str2[index++];

	for(int i =0; i <len1+len2; i++)
		printf("%c", output[i]);

	return 0;
}
