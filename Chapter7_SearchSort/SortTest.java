public class SortTest {
    public static void main(String[] args) {
        int[] unsortedArray = {15, 8, 4, 34, 6, 22, 46, 100, 1};
        printArray(unsortedArray, unsortedArray.length);  
        insertionSort(unsortedArray);
        printArray(unsortedArray, unsortedArray.length);  
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}