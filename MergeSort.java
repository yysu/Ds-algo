public class MergeSort
{
    static int count = 1;
    public static void MergetoOne(int [] L, int [] R, int [] A)
    {
        //Please implement this function yourself
        int left = 0, right = 0, index = 0;
        while(left < L.length && right < R.length) {
            if(L[left] < R[right]) {
                A[index] = L[left];
                index++;
                left++;
            } else {
                A[index] = R[right];
                index++;
                right++;
            }
        }
        while (left < L.length) {
            A[index] = L[left];
            index++;
            left++;
        }
        while (right < R.length) {
            A[index] = R[right];
            index++;
            right++;
        }
    }
    public static void MergeSort(int [] A)
    {
        int n = A.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int [] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = A[i];
        for (int i = mid; i < n; i++)
            right[i-mid] = A[i];

        MergeSort(left);
        MergeSort(right);
        MergetoOne(left, right, A);
        System.out.println("sort count = " + count++ + " ");
        for (int i = 0; i < A.length; i++)
            System.out.print(" " + A[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] data = new int[] { 2, 4, 1, 6, 8, 5, 3, 7 };
        System.out.println("排序前:");
        for (int i = 0; i < data.length; i++)
            System.out.print(" " + data[i] + " ");
        System.out.println();
        //
        MergeSort(data);
        //
        System.out.println("排序後:");
        for (int i = 0; i < data.length; i++)
            System.out.print(" " + data[i] + " ");
    }
}
