
public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        for (Character character : word.toCharArray()) {
            i++;
            if (character.equals(ch)) {
                StringBuilder sBuilder = new StringBuilder(word.substring(0, i));
                String string = sBuilder.reverse().toString();
                word = string + word.substring(i, word.length());
                break;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        ReversePrefixOfWord r = new ReversePrefixOfWord();
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(r.reversePrefix(word, ch));
    }

}