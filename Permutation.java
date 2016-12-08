public class Permutation {
    public static void main(String[] argv) {
        int[] array = {1,2,3};
        perm(array, 0, array.length);
    }
    public static void perm(int[] array, int i, int n) {
        if(i == n) {
            for(int index:array) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
        for(int j = i; j < n; j++) {
            //Swap array[i] & array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            //perm()
            perm(array, i+1, n);
            //Swap array[i] & array[j]
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
