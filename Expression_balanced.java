/*
    For a given a string expression containing only round brackets or parentheses, 
    check if they are balanced or not. Brackets are said to be balanced if the bracket 
    which opens last, closes first.  
*/

import java.util.Stack;

public class Expression_balanced {
    public static boolean isBalanced(String exp) {
        if (exp == null || exp.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }

                Character top = stack.pop();

                if ((top == '(' && c != ')') || (top == '{' && c != '}')
                        || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String exp = "{()}[{}]";

        if (isBalanced(exp)) {
            System.out.println("The expression is balanced");
        } else {
            System.out.println("The expression is not balanced");
        }
    }
}
