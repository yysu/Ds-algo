public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("n = %d, Factorial = %d", n, recursive(n));
    }
    public static int recursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursive(n-1);
    }
}