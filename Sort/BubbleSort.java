public class BubbleSort {
    public static void main(String[] argv) {
        int[] array = { 20, 3, 4, 7, 15, 6, 2, 100, 1000, 32 };
        System.out.println("排序前:");
        print(array);
        System.out.println();
        bubble(array, array.length);
        System.out.println("排序後:");
        print(array);
    }
    public static void bubble(int[] array, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    } 
    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}