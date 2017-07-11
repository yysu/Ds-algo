public class Hanoi {
    public static void hanoi(int n, String from, String temp, String to) {
        if (n == 1) {
            System.out.println("move disc " + n + " from " + from + " to " + to);
        } else {
            hanoi(n - 1, from, to, temp);
            System.out.println("Move disc " + n + " from " + from + " to " + to);
            hanoi(n - 1, temp, from, to);
        }
    }
    public static void main(String[] args) {
        hanoi(3, "A", "B", "C");
    }
}
