public class RecurAverage {
    //運用遞回求平均
    public static double Recursive(double[] Array,int Start ,int n) {
        if(n < 1)
            return 0;
        else
            return ((n-1) * Recursive(Array,s-1 ,n-1) + Array[s]) / n;
    }
    public static void main(String[] argv) {
        double[] Array = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(Recursive(Array, Array.length-1, Array.length));
    }
}
