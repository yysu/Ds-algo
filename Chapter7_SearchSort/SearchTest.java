
public class SearchTest {
    public static void main(String[] args) {
        int[] array = { 1, 5, 67, 4, 3, 10};
        System.out.println(linearSearch(array, 67));
        System.out.println(linearSearch(array, 15));
        int[] binarySearchArray = { 1, 5, 6, 43, 536, 1000};
        System.out.println(binarySearch(binarySearchArray, 0, binarySearchArray.length, 43));
        System.out.println(binarySearch(binarySearchArray, 0, binarySearchArray.length, 15));
    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    } 

    public static int binarySearch(int[] arr, int start, int end, int value) {
        int mid = (start+end)/2;
        if (start < end) {
            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) {
                return binarySearch(arr, start, mid, value);
            } else {
                return binarySearch(arr, mid+1, end, value);
            }
        }
        else return -1;
    }
}