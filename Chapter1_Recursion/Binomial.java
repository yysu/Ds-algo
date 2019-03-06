/**
 * Binomial Function 的定義如下：

 */
public class Binomial {
    public static void main(String[] args) {
        int n = 10;
        int k = 6; 
        System.out.printf("C %d 取 %d : %d", n, k, binomial(n, k));
    }
    
    public static int binomial(int n, int k) {
        if ((n == k) || (k == 0)) return 1;
        else return binomial(n-1, k) + binomial(n-1, k-1);
    } 
}