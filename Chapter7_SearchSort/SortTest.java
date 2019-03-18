public class SortTest {
    public static void main(String[] args) {
        int[] unsortedArray = {15, 8, 4, 34, 6, 22, 46, 100, 1};
        printArray(unsortedArray, unsortedArray.length);  
        
        insertionSort(unsortedArray);
        printArray(unsortedArray, unsortedArray.length);

        unsortedArray = new int[]{15, 8, 4, 34, 6, 22, 46, 100, 1};
        
        selectionSort(unsortedArray);
        printArray(unsortedArray, unsortedArray.length);

        unsortedArray = new int[]{15, 8, 4, 34, 6, 22, 46, 100, 1};
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

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}