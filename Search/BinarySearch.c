#include <stdio.h>
#include <stdlib.h>
int Binsearch (int data[], int l, int u, int key);

int main(void) {
	// your code goes here
	int data[5] = {1,2,3,4,5};
	printf("%d", Binsearch(data, 0, 5, 4));

	return 0;
}
int Binsearch (int data[], int l, int u, int key) {
	if(l <= u) {
		int m = (l + u) / 2;
		if ( data[m] > key ) {
			return Binsearch(data, l, m-1, key);
		} else if (data[m] < key) {
			return Binsearch(data, m+1, u, key);
		} else {
			return m;
		}
	} else {
		return -1;
	}
}
