public class SelectionSort {
    public static void main(String[] argv) {
        int[] array = { 26, 5, 37, 1, 61, 11, 59, 15, 48, 19 };
        System.out.println("排序前:");
        print(array);
        System.out.println();
        Selection(array, array.length);
        System.out.println("排序後:");
        print(array);
    }
    public static void Selection(int[] array, int n) {
        int min;
        for(int i = 0; i < n - 1; i++) {
            min = i;
            for(int j =  i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            System.out.print("第" + (i+1) + "回合結果");
            print(array);
            System.out.println();
        }
    }
    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
