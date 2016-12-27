public class DecimalToBinary {
    public static void main(String[] argv) {
        System.out.print(Change(47));
    }
    public static String Change(int number) {
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
}
