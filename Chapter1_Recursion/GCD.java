public class GCD {
    public static void main(String[] args) {
        int m = 128;
        int n = 48;
        System.out.printf("m = %d, n = %d, GCD(%d, %d) = %d", m, n, m, n, recursive(m, n));
    }
    public static int recursive(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return recursive(n, m % n);
        }
    }
}