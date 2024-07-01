import java.util.Arrays;

public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            while (s.charAt(i) == 'R') {
                r++;
                i++;
            }
            while (s.charAt(i) == 'L') {
                l++;
                i++;
            }

        }
        System.out.println(r + " : " + l);
        return 0;
    }

    public static void main(String[] args) {
        SplitAStringInBalancedStrings obj = new SplitAStringInBalancedStrings();
        String s = "RLRRLLRLRL";
        System.out.println(obj.balancedStringSplit(s));
    }
}
