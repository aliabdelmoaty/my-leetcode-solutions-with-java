public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String t = s.substring(0, 1);

        // for (int i = 0; i <= s.length() - 1; i++) {
            // for(int i=0;i)
        return true;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern rPattern = new RepeatedSubstringPattern();
        System.out.println(rPattern.repeatedSubstringPattern("abcabcabcabc"));
    }

}
