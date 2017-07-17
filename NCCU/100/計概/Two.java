public class Two {
    public static void main(String[] argv) {
        //array A
        int[] A = {1, 2, 3, 4, 5, 6};
        System.out.println(IterativeSum(A, 0, A.length));
        System.out.println(BinarySum(A, 0, A.length));

    }
    // 1.1
    public static int IterativeSum(int[] A, int i, int n) {
        int sum = 0;
        for (int index = i; index < i + n; index++) {
            sum += A[index];
        }
        return sum;
    }
    // 1.2
    public static int BinarySum(int[] A, int i, int n) {
        if(n == 1) {
            return A[i];
        }
        else if (n == 2) {
            return A[i] + A[i + 1];
        }
        else {
            int left, right;
            if( n % 2 == 0) {
                //陣列是偶數個的處理
                left = BinarySum(A, i, n/2);
                right = BinarySum(A, i + n/2, n/2);
                return left + right;
            }
            else {
                //陣列是奇數個的處理
                left = BinarySum(A, i, n/2);
                right = BinarySum(A, i + n/2 , n/2 + 1);
                return left + right;
            }
        }
    }
}
