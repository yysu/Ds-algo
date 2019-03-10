import java.util.Stack;
import java.util.HashMap;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "(5*6)+6";
        Stack<Character> stack = new Stack<>();
        stack.push(' ');

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (Character.isDigit(temp)) {
                System.out.print(temp);
            } else if (temp == ')') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            } else {
                // for no stack empty error
                if (stack.isEmpty()) {
                    stack.push(' ');
                }
                // ========================
                switch (compare(temp, stack.peek())) {
                    case ">":
                        stack.push(temp);
                        break;
                    case "<=":
                        while (!stack.isEmpty()) {
                            if (compare(temp, stack.peek()).equals("<=")) {
                                System.out.print(stack.pop());
                            }
                        }
                        stack.push(temp);
                        break;
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static String compare(Character char1, Character char2) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(' ', Integer.MIN_VALUE);
        map.put('(', -1);
        map.put('+', 0);
        map.put('*', 1);
        map.put(')', Integer.MAX_VALUE);
        if (map.get(char1) > map.get(char2)) {
            return ">";
        } 
        return "<=";
    }
}