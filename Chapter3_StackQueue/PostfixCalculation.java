import java.util.Stack;

public class PostfixCalculation {
    public static void main(String[] args) {
        // 23*6+
        String postfix = "23*6+";
        Stack<Character> stack = new Stack<>();
        stack.push(postfix.charAt(0));

        for (int i = 0; i < postfix.length(); i++) {
            char temp = postfix.charAt(i);

            if (Character.isDigit(temp)) {
                stack.push(temp);
            } else {
                // pop 適當數目的運算元
                // 執行計算
                // push回stack
            }
        }

        stack.pop(); //運算結果
    }
}