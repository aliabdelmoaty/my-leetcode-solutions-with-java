/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'. */

public class ValidParentheses {

    public boolean isValid(String s) {
        int openCheckInt = 1;
        int closeCheckInt = 1;
        String[] open = { "(", "[", "{" };
        String[] close = { ")", "]", "}" };
        String[] pareStrings = { "()", "[]", "{}" };
        if (s.length() % 2 == 0) {
            if (s.length() == 4 || s.length() == 6) {
                for (int i = 0; i < s.length(); i++) {
                    for (int h = 0; h < open.length; h++) {
                        if (s.substring(i, i + 1).equals(open[h]) && (i <= 3 || i <= 2)) {
                            openCheckInt++;
                        }
                    }
                    for (int h = 0; h < close.length; h++) {

                        if (s.substring(i, i + 1).equals(close[h]) && (i > 3 || i > 2)) {
                            closeCheckInt++;
                        }
                    }
                }

                if (closeCheckInt == openCheckInt) {
                    return true;
                }
            }

            for (int i = 0; i < pareStrings.length; i++) {
                if (s == pareStrings[i]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("({[})]"));
    }
}
 