public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        /*
         * We need to store keys and values.
         * If we have more than one character, each character must have the same
         * value in this character.
         * So, we will create a loop and a map.
         * In the loop, we iterate over each character and store s[index] as the key
         * and t[index] as the value.
         *  Then, in two loops, we will check if all keys have the same value. If this
         * is not true, return false. Otherwise, return true.
         * 
         */
        

        return false;

    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        IsomorphicStrings iStrings = new IsomorphicStrings();
        System.out.println(iStrings.isIsomorphic(s, t));
    }
}
