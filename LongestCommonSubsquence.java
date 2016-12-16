public class LongestCommonSubsquence {
	
	public static void main(String[] argv) {
		char[] X = {'A','G','G','T','A','B'};
		char[] Y = {'G','X','T','X','A','Y','B'};

		int m = X.length;
		int n = Y.length;
		System.out.printf("Length of LCS is %d\n", lcs( X, Y, m, n ) );
	}

	public static int lcs(char[] X, char[] Y, int m, int n)
	{
		if (m == 0 || n == 0)
			return 0;
		if (X[m-1] == Y[n-1])
			return 1 + lcs(X, Y, m-1, n-1);
		else
			return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	}
	public static int max(int a, int b)
	{
		return (a > b)? a : b;
	}
}
