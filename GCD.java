
//找最大公因數
public class GCD {
    public static void main(String[] argv) {
        int A = 95, B = 15;
        //Recursive
        System.out.print(A + " 和 " + B + " 之最大公因數為： " + GCD_R(A, B));
    }
    public static int GCD_R(int A, int B) {
        if(A % B == 0) {
            return B;
        } else {
            return GCD_R(B, A % B);
        }
    }
}
