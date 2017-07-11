public class Factorial {
    public static void main(String[] argv) {
        int n = 5;
        //Imperative版
        System.out.println(n + "! = " + factorial(n));
        //Recursive版
        System.out.println(n + "! = " + factorial_Re(n));
    }
    public static int factorial(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    public static int factorial_Re(int n) {
        if(n <= 0)
            return 1;
        else {
            return n * factorial_Re(n - 1);
        }
    }
}
