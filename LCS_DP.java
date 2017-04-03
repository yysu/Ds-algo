public class LCS_DP {
    public static void main(String[] argv) {
        int[] s1 = {0, 2, 5, 7, 9, 3, 1, 2};
        int[] s2 = {0, 3, 5, 3, 2, 8};

        int[][] array = new int[s1.length][s2.length];
        /*  DP規則

            LCS(s1, s2) =
            { max( LCS(sub1, s2), LCS(s1, sub2) ) , when e1 != e2
            { LCS(sub1, sub2) + e1                , when e1 == e2
        */

        for(int i = 1; i < s1.length ; i++) {
            for(int j = 1; j < s2.length ; j++) {
                if (s1[i] == s2[j])
                    // +1是因為e1的長度為1
                    array[i][j] = array[i-1][j-1] + 1;
                else
                    array[i][j] = Math.max(array[i-1][j], array[i][j-1]);

            }
        }
        System.out.println("LCS的長度是" + array[s1.length - 1][s2.length - 1]);
        System.out.println();

        //印出矩陣
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
