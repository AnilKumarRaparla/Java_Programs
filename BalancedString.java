import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String input = "({[}])";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char bracket = input.charAt(i);
            
           System.out.print(bracket+" ");
           
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == '}' || bracket == ']' || bracket == ')') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    System.out.println("The string is not balanced.");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
