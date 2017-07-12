public class Eight {
    public static void main(String[] argv) {
        // 假設連續整數範圍3-9
        int[] array = {3, 6, 9, 7, 8, 4};
        System.out.print(solution(array, array.length));
    }
    // space complexity O(1)的方法
    public static int solution(int[] array, int n) {
        // 宣告一個整數Sum來去存陣列裡面所有數字相加的結果，過程中找出最大及最小值
        // 最後由(最大+最小)*(連續整數個數)/2 - Sum 即為答案
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int ans = (max + min) * (n + 1) / 2 - sum;
        return ans;
    }
}
