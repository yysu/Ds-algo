public class Ackerman {
    public static void main(String[] argv) {
        int m = 2, n = 2;
        System.out.println("Ackerman(" + m + "," + n + ") = " +Ackerm(m ,n));
    }
    public static int Ackerm(int m, int n) {
        if(m == 0)
            return n + 1;
        else if(n == 0)
            return Ackerm(m - 1, 1);
        else {
            return Ackerm(m - 1, Ackerm(m , n - 1));
        }

    }
}
