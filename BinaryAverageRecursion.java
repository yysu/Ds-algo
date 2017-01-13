public class BinaryAverageRecursion {
    public static void main(String[] argv) {
        double[] A = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        System.out.print(BinaryAvg(A, 0, 5));
    }
    public static double BinaryAvg(double[] A, int start, int n) {
        if(n == 1) {
            return A[start];
        }
        else if (n == 2) {
            return (A[start] + A[start + 1]) /2;
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
}
