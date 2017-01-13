public class RecurAverage {
    //運用遞回求平均
    //s 為起始位置，從array後面開始遞減
    public static double Recursive(double[] Array, int s , int n) {
        if(n == 0)
            return 0;
        else
            return ((n-1) * Recursive(Array, s-1 ,n-1) + Array[s]) / n;
    }
    //NCCU 103 linearRecursive考題
    //start 為起始位置，從array"前"面開始遞減
    //n 為執行的個數
    public static double recursiveNCCU(double[] data, int start, int n) {
        if(n == 0) {
            return 0;
        }
        else {
            return ((n - 1) * recursiveNCCU(data, start + 1, n - 1) + data[start]) / n;
        }
    }
    public static void main(String[] argv) {
        double[] Array = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(Recursive(Array, Array.length-1, Array.length));


        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(recursiveNCCU(data, 0, Array.length));
    }
}
