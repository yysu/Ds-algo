#include <stdio.h>

/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
int lcs( char *X, char *Y, int m, int n )
{
    if (m == 0 || n == 0)
	    return 0;
	if(X[m-1] == Y[n-1])
	    return 1 + lcs(X, Y, m-1, n-1);
	else
	    return (lcs(X, Y, m, n-1) > lcs(X, Y, m-1, n)) ? lcs(X, Y, m, n-1):lcs(X, Y, m-1, n);
	}
int main(void) {
	char X[3] = {'A','A','B'};
	char Y[2] = {'A','B'};
	printf("%d",lcs(&X,&Y,3,2));

	return 0;
}
