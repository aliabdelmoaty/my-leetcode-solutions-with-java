import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfVowelStringsInRange {
    public int vowelStrings0(String[] words, int left, int right) {

        int result = 0;
        for (int i = left; i <= right; i++) {
            if (words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i'
                    || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u') {
                if (words[i].charAt(words[i].length() - 1) == 'a' || words[i].charAt(words[i].length() - 1) == 'e'
                        || words[i].charAt(words[i].length() - 1) == 'i'
                        || words[i].charAt(words[i].length() - 1) == 'o'
                        || words[i].charAt(words[i].length() - 1) == 'u') {
                    result++;
                }
            }
        }
        return result;
    }

    public int vowelStrings(String[] words, int left, int right) {
        int result = 0;
        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for (int i = left; i <= right; i++) {
            if (vowel.contains(words[i].charAt(0)) &&
                    vowel.contains(words[i].charAt(words[i].length() - 1))) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountTheNumberOfVowelStringsInRange countTheNumberOfVowelStringsInRange = new CountTheNumberOfVowelStringsInRange();
        String[] words = { "hey", "aeo", "mu", "ooo", "artro" };
        int left = 1;
        int right = 4;
        System.out.println(countTheNumberOfVowelStringsInRange.vowelStrings(words, left, right));

    }
}
