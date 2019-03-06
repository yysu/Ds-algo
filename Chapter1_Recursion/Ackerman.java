/**
 * Ackerman Function 的定義如下：
 * n+1, m=0
 * A(m, n) = A(m-1, 1), m>0, n=0
 * A(m-1, A(m,n-1)), m>0, n>0
 */
public class Ackerman {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;

        int ans = ackerman(m, n);
        System.out.printf("m=%d, n=%d, Ans = %d", m, n, ans);
    }

    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n+1;
        } else if ((m > 0) && (n == 0)) {
            return ackerman(m-1, 1);
        } else if ((m > 0) && (n > 0)) {
            return ackerman(m-1, ackerman(m, n-1));
        }
        return 0;
    }
}