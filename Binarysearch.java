public class Binarysearch {
    //Iteractive版本
    public static void main(String[] argv) {
        int[] array = { 1, 2, 3, 4, 5 };
        int key = 4;
        if(Binsearch(array, key, array.length) != -1) {
            System.out.println("找到" + key + "在 : " + Binsearch(array, key, array.length));
        } else {
            System.out.println("找不到");
        }
    }
    public static int Binsearch (int[] array, int key, int n) {
        int m,l = 0, u = n - 1;
        while(l <= u) {
            m = (l + u) / 2;
            if(key > array[m]) {
                l = m + 1;
            } else if(key < array[m]) {
                u = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
