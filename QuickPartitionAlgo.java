public class QuickPartitionAlgo {
    public static void main(String[] argv) {
        int []A = { 9, 4, 2, 3, 6, 5, 7 };
        //排序前
        print(A);
        QuickSort(A, 0, A.length - 1);
        //排序後
        print(A);
    }
    public static void QuickSort(int[] A, int p, int r) {
        if(p < r) {
            int q = Partition(A, p, r);
            QuickSort(A, p, q - 1);
            QuickSort(A, q + 1, r);
        }
    }
    public static int Partition(int[] A, int p, int r) {
        int pk = A[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if(A[j] <= pk) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                //Swap(A[i], A[j]);
            }
        }
        int temp = A[r];
        A[r] = A[i + 1];
        A[i + 1] = temp;
        //Swap(A[r], A[i + 1]);
        return i + 1;
    }
    public static void print(int[] A) {
        for (int index : A)
            System.out.print(index + " ");
        System.out.println();
    }
    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
