public class BinaryRecursiveArray {
   public static int binaryRecursiveSum( int[] data, int low, int high )
   {
      if( low > high )
        return 0;
      else if( low == high )
        return data[low];
      else
      {
        int mid = (low + high) / 2;
        return binaryRecursiveSum(data, low, mid) + binaryRecursiveSum(data, mid+1, high);
      }
   }
   public static int binaryRecursiveMul( int[] data, int low , int high)
   {
       if( low > high )
        return 1;
       else if (low == high)
           return data[low];
       else {
            int mid = (low + high) / 2;
            return binaryRecursiveMul(data, low, mid) * binaryRecursiveMul(data, mid+1, high);
       }
   }
   public static void main(String[] args) {

       int[] data =  {1,2,3,4,5};

       int sumResult = binaryRecursiveSum(data, 0, data.length-1);
       int mulResult = binaryRecursiveMul(data, 0, data.length-1);
       System.out.println("Array 總和：" + sumResult);
       System.out.println("Array 總積：" + mulResult);
   }

}
