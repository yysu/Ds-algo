public class Fibonacci {
    public static void main(String[] argv) {
        int n = 5;
        //Dynamic Programming版本
        System.out.println("費氏數列 F(" + n + ") = " + Fibo_DP(n));
        //Recursive版本
        System.out.println("費氏數列 F(" + n + ") = " + Fibo_Re(n));
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
