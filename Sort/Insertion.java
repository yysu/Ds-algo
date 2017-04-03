public class Insertion {
    public static void main(String[] argv) {
        int[] array = { -10000000, 26,5,37,1,61,11,59,15,48,19};
        //排序前
        System.out.println("Before sort");
        print(array);
        System.out.println();

        Insort(array, array.length);
        //排序後
        System.out.println("After sort");
        print(array);
    }
    public static void Insert(int[] array, int r, int index) {
        while(r < array[index]) {
            array[index + 1] = array[index];
            index--;
        }
        array[index + 1] = r;
        print(array);
        System.out.println();

    }
    public static void Insort(int[] array, int n) {
        for(int i = 2;i < n; i++) {
            Insert(array, array[i], i - 1);
        }
    }
    //print
    public static void print(int[] array) {
        for(int i = 1;i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    } 
}