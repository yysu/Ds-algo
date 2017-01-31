#include <iostream>
using namespace std;
void perm(char *arr, int i ,int n);
void Swap (char &a,char &b);
int main() {
	// your code goes here
	char arr[3] = {'a','b','c'};
	perm(arr, 0, 3);
	return 0;
}
void perm(char *arr, int index ,int n) {
	if(index == n) {
		for(int i = 0; i < n; i++)
			cout<<arr[i]<<" ";
		cout<<endl;
	} else {
		for(int j = index; j < n; j++) {
			Swap(arr[j], arr[index]);
			perm(arr, index + 1, n);
			Swap(arr[j], arr[index]);
		}
	}
}
void Swap (char &a,char &b) {
	char temp = a;
	a = b;
	b = temp;
}
