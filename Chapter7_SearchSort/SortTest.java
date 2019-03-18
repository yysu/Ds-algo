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

        bubbleSort(unsortedArray);
        printArray(unsortedArray, unsortedArray.length);

        unsortedArray = new int[]{15, 8, 4, 34, 6, 22, 46, 100, 1};

        quickSort(unsortedArray, 0, unsortedArray.length-1);
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

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void quickSort(int[] arr, int m, int n) {
        if (m < n) {
            int pivot = arr[m];
            int i = m;
            int j = n+1;

            while (i < j) {
                do {
                    i++;
                } while (arr[i] < pivot);

                do {
                    j--;
                } while (arr[j] > pivot);

                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[m];
            arr[m] = arr[j];
            arr[j] = temp;
            quickSort(arr, m, j-1);
            quickSort(arr, j+1, n);
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}