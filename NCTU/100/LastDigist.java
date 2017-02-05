import java.lang.StringBuilder;
import java.util.Scanner;

public class LastDigist {
    // 交大100年題目
    public static void main(String[] argv){
        System.out.println("交大資管 100年 第8題 ");
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入number X : ");
        int ans = 0, n = input.nextInt(), temp;
        StringBuilder ansStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            temp = 1;
            for(int j = 1; j <= i;j++)
                temp *= i;
            ans += temp;
            ansStr.append(ans);
            tempStr.append(ansStr.substring(ansStr.length()-1));
            ans = Integer.parseInt(tempStr.toString());
            //清空
            ansStr.setLength(0);
            tempStr.setLength(0);
        }
        System.out.print(ans);

    }
}
