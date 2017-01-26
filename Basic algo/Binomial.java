public class Binomial {
    public static void main(String[] argv) {
        int m = 4, n = 2;
        System.out.println("C" + m + "取" + n + " : " + C(m, n));
    }
    public static int C(int m, int n) {
        if(m == n ||  n == 0)
            return 1;
        else
            return C(m - 1, n - 1) + C(m - 1, n);
    }
}
