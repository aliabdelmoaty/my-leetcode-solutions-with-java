public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        int last = strings.length - 1;
        return strings[last].length();
    }

    
    public static void main(String[] args) {
        LengthOfLastWord lastWord = new LengthOfLastWord();
        System.out.println(lastWord.lengthOfLastWord("Hello World"));
    }
}


