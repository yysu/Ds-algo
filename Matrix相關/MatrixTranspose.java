public class MatrixTranspose
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[][] array = { { 1, 2, 3 } , { 4, 5, 6 } , { 7, 8, 9 } };
		System.out.println("轉置前 : ");
		print(array);

		//轉置
		for(int i = 0;i < array.length; i++){
			for(int j = i; j < array[0].length; j++){
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}

		System.out.println("轉置後 : ");
		print(array);
	}
	public static void print(int[][] array) {
		// print 二維矩陣
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
}
