import java.util.*;

public class DecimalToOther {
    public static void main(String[] argv) {
        //10進位轉2進位
        //忘了哪間學校
        System.out.println(decimalToBinary(47));
        //10進位轉8進位
        //中央103資結
        System.out.println(decimalToOctal(68));
    }
    public static String decimalToBinary(int number) {
        String result = "";
        while(number != 0) {
            result += number % 2;
            number /= 2;
        }
        //算完要再反轉
        return Reverse(result);
    }
    public static String Reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    //運用Stack做反轉[中央103]
    public static String decimalToOctal(int number) {
        String result = "";
        Stack<Integer> S = new Stack<Integer>();
        while(number != 0) {
            S.push(number % 8);
            number /= 8;
        }
        while(!S.isEmpty()) {
            result += S.pop();
        }
        return result;
    }
}
