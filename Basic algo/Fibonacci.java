public class Fibonacci {
    public static void main(String[] argv) {
        int n = 6;
        //Dynamic Programming版本
        System.out.println("費氏數列 F(" + n + ") = " + Fibo_DP(n));
        //Recursive版本
        System.out.println("費氏數列 F(" + n + ") = " + Fibo_Re(n));
        //Imperative版本
        System.out.println("費氏數列 F(" + n + ") = " + Fibo_Im(n));
    }
    public static int Fibo_Im(int n) {
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static int Fibo_Re(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else {
            return Fibo_Re(n - 1) + Fibo_Re(n - 2);
        }
    }
    public static int Fibo_DP(int n) {
        int[] F = new int[n + 1];
        F[0] = 0;
        F[1] = 1;
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            for(int i = 2; i <= n; i++) {
                F[i] += F[i - 1] + F[i - 2];
            }
        }
        return F[n];
    }
}
