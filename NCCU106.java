public class NCCU106 {
    public static void main(String[] argv) {
        long n = 123456789;
        System.out.println(g(n));
    }
    public static int g(long n) {
        int num = 0;
        String str = String.valueOf(n);
        while(str.length() > 1) {
            for(int i = 0; i < str.length(); i++) {
                num += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if(num > 10) {
                str = String.valueOf(num);
                num = 0;
            } else {
                break;
            }
        }
        return num;
    }
}
