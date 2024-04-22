import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] tArray = t.toCharArray();
            char[] sArray = s.toCharArray();
            int count = 0;
            Arrays.sort(tArray);
            Arrays.sort(sArray);

            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i] == tArray[i]) {
                    count++;
                }
            }
            return count == sArray.length;
            //  this is also a solution but it is not efficient
            // HashSet<Character> hashSet = new HashSet<>();
            // for (int i = 0; i < s.length(); i++) {
            // hashSet.add(s.charAt(i));
            // for (int j = 0; j < t.length(); j++) {
            // if (hashSet.contains(t.charAt(j))) {
            // hashSet.remove(t.charAt(j));
            // }
            // }
            // }
            // return hashSet.isEmpty();
            // ------------------------------------------------
            // int count = 0;
            // char[] tArray = t.toCharArray();
            // for (int i = 0; i < s.length(); i++) {
            // for (int j = 0; j < t.length(); j++) {
            // if (s.charAt(i) == tArray[j]) {
            // count++;
            // tArray[j] = ' ';
            // break;
            // }
            // }
            // }
            // return count == s.length();

        }

    }
    // we can do this 
    public boolean isAnagram0(String s, String t) {
        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();

        Arrays.sort(tArray);
        Arrays.sort(sArray);

        return Arrays.equals(tArray, sArray);
    }
    
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s = "aacc",
                t = "ccac";
        System.out.println(anagram.isAnagram(s, t));
    }
}
