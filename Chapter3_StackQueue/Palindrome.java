import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String rightParentheses = "()(())()";
        String rightParentheses1 = "((((((((((((()))))))))))))";
        String wrongParentheses = "()((())()";
        String wrongParentheses1 = "(((((((((";
        
        System.out.println(testStackSolution(rightParentheses));
        System.out.println(testStackSolution(rightParentheses1));
        System.out.println(testStackSolution(wrongParentheses));
        System.out.println(testStackSolution(wrongParentheses1));

        String rightStringPalindrome = "abcdcba";
        String rightStringPalindrome1 = "abccba";
        String wrongStringPalindrome = "abadcba";
        String wrongStringPalindrome1 = "abada";

        System.out.println(testStringStack(rightStringPalindrome));
        System.out.println(testStringStack(rightStringPalindrome1));
        System.out.println(testStringStack(wrongStringPalindrome));
        System.out.println(testStringStack(wrongStringPalindrome1));
    }
    public static boolean testStackSolution(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean testStringStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length()/2; i++) {
            stack.push(str.charAt(i));
        }

        int mid = (str.length()%2 == 0) ? str.length()/2 : str.length()/2+1;

        for (int i = mid; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}