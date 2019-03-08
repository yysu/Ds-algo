public class Hanoi {
    public static void main(String[] args) {
        hanoi(3, "A", "B", "C");
    }
    public static void hanoi(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.printf("Move %d from %s to %s, temp = %s \n", n, a, c, b);
        } else {
            hanoi(n-1, a, c, b);
            System.out.printf("Move %d from %s to %s, temp = %s \n", n, a, c, b);
            hanoi(n-1, b, a, c);
        }
    } 
}