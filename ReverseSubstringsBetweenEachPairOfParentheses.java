import java.util.Arrays;
import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.add(String.valueOf(s.charAt(i)));
        }
        StringBuilder string = new StringBuilder();
        for (int j = 0; j < stack.size(); j++) {
            if (stack.get(j) == ")") {
                int u = j;
                while (u > 0) {
                    if (stack.get(j) == "(") {
                        break;
                    }
                    u--;
                    string = string.append(stack.get(u));

                }

            }
        }
        return "";
    }

    public static void main(String[] args) {
        ReverseSubstringsBetweenEachPairOfParentheses rsbep = new ReverseSubstringsBetweenEachPairOfParentheses();
        String s = "(ed(et(oc))el)";
        System.out.println(rsbep.reverseParentheses(s));
    }

}
