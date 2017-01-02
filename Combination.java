import java.util.*;
public class Combination {
    //中央102考題11
    public static void main(String argv[]) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        sum = C(n, m);
        System.out.println("The result is " + sum);
    }
    public static int C(int n, int m) {
        if(m == 0 || n == m)
            return 1;
        else
            return C(n - 1, m) + C (n - 1, m - 1);

    }
}
