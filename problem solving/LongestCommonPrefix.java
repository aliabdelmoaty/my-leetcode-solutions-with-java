public class LongestCommonPrefix {
    // public String longestCommonPrefix(String[] strs) {
    // int c = 1;
    // for (int i = 0; i < strs.length; i++) {
    // for (int j = 0; j < strs[i].length(); j++) {
    // for (int b = 0; b < strs.length; b++) {
    // if (strs[i].substring(0, 1).equals(strs[b].substring(0, 1))) {
    // c++;
    // System.out.println("c++" + c);
    // } else {
    // c = c - 1;
    // System.out.println("c--" + c);

    // }
    // }

    // }

    // }
    // return "AA";
    // }
    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(first)) {
                first = first.substring(0, first.length() - 1);
            }

        }
        System.out.println(first);
        if (first.length() > 0) {
            return first;
        } else {
            first = "";
        }
        return first;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] str = { "dog", "racecar", "car" };
        longestCommonPrefix.longestCommonPrefix(str);
    }
}
