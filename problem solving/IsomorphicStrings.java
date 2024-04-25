import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        /*
         * We need to store keys and values.
         * If we have more than one character, each character must have the same
         * value in this character.
         * So, we will create a loop and a map.
         * In the loop, we iterate over each character and store s[index] as the key
         * and t[index] as the value.
         * Then, in two loops, we will check if all keys have the same value. If this
         * is not true, return false. Otherwise, return true.
         * 
         */
        HashMap<Character, Character> map = new HashMap<>(); // Create a new HashMap to store character mappings
        if (s.length() == t.length()) { // Check if the lengths of strings s and t are equal
            for (int i = 0; i < s.length(); i++) { // Iterate over the characters of string s
                // if (!map.isEmpty()) {
                // Check if the map is not empty
                if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                    // If the map contains the character at index i of string s and the
                    // corresponding mapped character is not equal to the character at index i of
                    // string t
                    if (map.containsValue(t.charAt(i))) { // If the map already contains the character at index i of
                                                          // string t as a mapped value
                        return false; // Return false, as the mapping is not isomorphic
                    }
                    return false; // Return false, as the mapping is not isomorphic
                }
                if (map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))) {
                    // If the map contains the character at index i of string t as a mapped value
                    // and does not contain the character at index i of string s as a key
                    return false; // Return false, as the mapping is not isomorphic
                    // }
                }
                map.put(s.charAt(i), t.charAt(i)); // Add the character at index i of string s as a key and the
                                                   // character at index i of string t as a value to the map
            }
        } else {
            return false; // Return false, as the lengths of strings s and t are not equal
        }

        return true; // Return true, as the mapping is isomorphic

    }

    public static void main(String[] args) {
        String s = "add", t = "eog";
        IsomorphicStrings iStrings = new IsomorphicStrings();
        System.out.println(iStrings.isIsomorphic(s, t));
    }
}
