public class BinaryAverageRecursion {
    public static void main(String[] argv) {
        double[] A = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        System.out.println(BinaryAvg(A, 0, 5));

        //NCCU 100年
        int[] Array = { 1, 2, 3, 4, 5 };
        System.out.println(BinarySum(Array, 0, 5));
    }
    public static double BinaryAvg(double[] A, int start, int n) {
        if(n == 1) {
            return A[start];
        }
        else if (n == 2) {
            return (A[start] + A[start + 1]) / 2;
        }
        else {
            double left, right;
            if( n % 2 == 0) {
                //陣列是偶數個的處理
                left = BinaryAvg(A, start, n/2);
                right = BinaryAvg(A, start + n/2, n/2);
                return (left * (n/2) + right * (n/2)) / n;
            }
            else {
                //陣列是奇數個的處理
                left = BinaryAvg(A, start, n/2);
                right = BinaryAvg(A, start + n/2 , n/2 + 1);
                return (left * (n/2) + right * (n/2 + 1)) / n;
            }

        }
    }
    public static int BinarySum(int[] Array, int i, int n) {
        if(n == 1) {
            return Array[i];
        }
        else if (n == 2) {
            return Array[i] + Array[i + 1];
        }
        else {
            int left, right;
            if( n % 2 == 0) {
                //陣列是偶數個的處理
                left = BinarySum(Array, i, n/2);
                right = BinarySum(Array, i + n/2, n/2);
                return left + right;
            }
            else {
                //陣列是奇數個的處理
                left = BinarySum(Array, i, n/2);
                right = BinarySum(Array, i + n/2 , n/2 + 1);
                return left + right;
            }

        }
    }
}
