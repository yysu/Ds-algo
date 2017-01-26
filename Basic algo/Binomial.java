public class Binomial {
    public static void main(String[] argv) {
        int m = 4, n = 2;
        //recursive版
        System.out.println("C" + m + "取" + n + " : " + C_RE(m, n));
        //Imperative版
        System.out.println("C" + m + "取" + n + " : " + C(m, n));
    }
    public static int C_RE(int m, int n) {
        int n_fac = 1, m_fac = 1, m_n_fac = 1;
        for(int i = 1; i <= m; i++) {
            m_fac *= i;
        }
        for(int i = 1; i <= n; i++) {
            n_fac *= i;
        }
        for(int i = 1; i <= m - n; i++) {
            m_n_fac *= i;
        }
        return m_fac / (m_n_fac * n_fac);
    }
    public static int C(int m, int n) {
        if(m == n ||  n == 0)
            return 1;
        else
            return C(m - 1, n - 1) + C(m - 1, n);
    }
}
