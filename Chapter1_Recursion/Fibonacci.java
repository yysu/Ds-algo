public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("n = %d, Fibonacci(n) = %d", n, recursive(n));
    }
    public static int recursive(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return recursive(n-1) + recursive(n-2);
    }
}