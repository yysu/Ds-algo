public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutate(str, 0, str.length());
    }

    public static void permutate(String str, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            System.out.println(str);
        } else {
            for (int i = startIndex; i < endIndex; i++) {
                str = swap(str, startIndex, i);
                permutate(str, startIndex+1, endIndex);
                str = swap(str, startIndex, i);
            }
        }
    }
    
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}