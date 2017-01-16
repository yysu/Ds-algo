public class CountingSort {
    public static void main(String[] argv) {
        int[] array = { 1,4,1,2,7,5,2 };
        int[] Count = new int[10];
        int[] Sort = new int[array.length];

        //Counting sort start
        //統計結果
        for (int i = 0; i < array.length; i++) {
            Count[array[i]]++;
        }
        print(Count, array.length);

        //算每個數字起始位置
        for(int i = 0; i < 9; i++) {
            Count[i + 1] += Count[i];
        }
        print(Count, 10);

        //填入數字
        for (int i = 0; i < array.length; i++) {
            int temp = Count[array[i]] - 1;
            Sort[temp] = array[i]; 
            Count[array[i]]--;
        }
        print(Sort, Sort.length);

    }
    public static void print(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
