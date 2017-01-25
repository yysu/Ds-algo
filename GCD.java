
//找最大公因數
public class GCD {
    public static void main(String[] argv) {
        int A = 95, B = 15;
        //Recursive
        System.out.println(A + " 和 " + B + " 之最大公因數為： " + GCD_R(A, B));
        //Imperative
        System.out.println(A + " 和 " + B + " 之最大公因數為： " + GCD_I(A, B));
    }
    //Recursive
    public static int GCD_R(int A, int B) {
        if(A % B == 0) {
            return B;
        } else {
            return GCD_R(B, A % B);
        }
    }
    //Imperative
    public static int GCD_I(int A, int B) {
        while(A != 0 && B != 0) {
            if(A > B) {
                A %= B;
            } else {
                B %= A;
            }
        }
        if(A == 0) {
            return B;
        }
        else {
            return A;
        }
    }
}
