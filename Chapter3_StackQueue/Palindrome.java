import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String rightParentheses = "()(())()";
        String wrongParentheses = "()((())()";
        String wrongParentheses1 = "(((((((((";
        String rightParentheses1 = "((((((((((((()))))))))))))";
        System.out.println(testStackSolution(rightParentheses));
        System.out.println(testStackSolution(rightParentheses1));
        System.out.println(testStackSolution(wrongParentheses));
        System.out.println(testStackSolution(wrongParentheses1));
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
}