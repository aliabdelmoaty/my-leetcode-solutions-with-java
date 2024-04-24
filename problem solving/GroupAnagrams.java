
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    // TODO : Time limit exceeded but correct output
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> itemAnagrams = new ArrayList<>();
            HashMap<String, List<String>> mapAnagrams = new HashMap<>();
            char[] iChar = strs[i].toCharArray();
            Arrays.sort(iChar);
            for (int j = 0; j < strs.length; j++) {
                char[] jChar = strs[j].toCharArray();
                Arrays.sort(jChar);

                if (jChar.length == iChar.length) {
                    int count = 0;

                    for (int a = 0; a < iChar.length; a++) {
                        if (jChar[a] == iChar[a]) {
                            count++;
                        }
                    }
                    if (count == iChar.length && count == jChar.length) {
                        if (itemAnagrams.contains("")) {
                            itemAnagrams.add(strs[j]);
                        } else {
                            if (itemAnagrams.contains(strs[j]) == false) {
                                itemAnagrams.add(strs[j]);
                            }
                        }

                    }
                }

            }
            itemAnagrams.sort(null);
            if (anagrams.contains(itemAnagrams) == false) {
                anagrams.add(itemAnagrams);
            }
        }
        return anagrams;

    }

    //
    // TODO: Implement the groupAnagrams2 method to group anagrams in the given
    
    // array of strings
    // This code defines a method called groupAnagrams2 that takes an array of
    // strings as input and returns a list of lists of strings.
    // The method uses a HashMap to group anagrams together.
    // It iterates over each string in the input array and performs the following
    // steps:
    // 1. Converts the string to a character array.
    // 2. Sorts the character array in ascending order.
    // 3. Converts the sorted character array back to a string.
    // 4. Checks if the sorted string exists as a key in the anagramMap HashMap.
    // - If it doesn't exist, it adds a new entry to the HashMap with the sorted
    // string as the key and an empty ArrayList as the value.
    // 5. Adds the original string to the ArrayList corresponding to the sorted
    // string key in the HashMap.
    // Finally, it returns a new ArrayList containing all the values (lists of
    // strings) from the anagramMap HashMap.
    public List<List<String>> groupAnagrams2(String[] strs) {
        // Create a map to store anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate over each string in the input array
        for (String string : strs) {
            // Convert the string to a character array
            char[] jChar = string.toCharArray();

            // Sort the characters in the array
            Arrays.sort(jChar);

            // Convert the sorted character array back to a string
            String strSort = new String(jChar);

            // Check if the sorted string is already a key in the map
            if (!anagramMap.containsKey(strSort)) {
                // If not, create a new empty list as the value for the key
                anagramMap.put(strSort, new ArrayList<>());
            }

            // Add the original string to the list of anagrams for the sorted string
            anagramMap.get(strSort).add(string);
        }

        // Return a list of all the values in the map (which are lists of anagrams)
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {

        GroupAnagrams gAnagrams = new GroupAnagrams();
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(gAnagrams.groupAnagrams2(str));
    }
}
