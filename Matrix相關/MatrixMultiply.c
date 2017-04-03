#include <stdio.h>
#define m 3

int main() {
    int A[m][m] = {{1,2,3},{1,2,3},{1,2,3}};
    int B[m][m] = {{1,2,3},{1,2,3},{1,2,3}};
    int C[m][m];
    int i, j, k;

    for (i = 0; i < m; i++) {
        for (j = 0; j < m; j++) {
            C[i][j] = 0; /*ªì©l¤Æ°}¦CC */
            for(k = 0; k < m; k++) {
                C[i][j] = C[i][j] + A[i][k] * B[k][j]; /*°}¦CA­¼¤W°}¦CB,¦s¤J°}¦CC */
            }
            printf("%d ", C[i][j]); /*¿é¥X°}¦CC */
        }
        printf("\n");
    }
}
