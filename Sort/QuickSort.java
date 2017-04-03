public class QuickSort {
    public static void main(String[] argv) {
        int[] array = { 20, 3, 4, 7, 15, 6, 2, 100, 1000, 32 };
        System.out.println("排序前:");
        print(array);
        System.out.println();
        quick(array, 0, array.length - 1);
        System.out.println("排序後:");
        print(array);
    }
    public static void quick(int[] array, int L, int U) {
        if(L < U) {
            int pivot = array[L];
            int i = L;
            int j = U + 1;
            while(i < j) {
                do {
                    i++;
                } while(pivot > array[i]);
                do {
                    j--;
                } while(pivot < array[j]);

                if(i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[L];
            array[L] = array[j];
            array[j] = temp;
            quick(array, L , j-1);
            quick(array, j + 1, U);
        }
    }
    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
