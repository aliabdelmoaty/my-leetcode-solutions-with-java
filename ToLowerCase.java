public class ToLowerCase {
    public String toLowerCase0(String s){
        return s.toLowerCase();
    }
    public String toLowerCase1(String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }
    public String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            int upper = s.charAt(i);
            if (upper > 64 && upper < 91) {
                upper = upper + 32;
                char lower = (char) upper;
                s = s.replace(s.charAt(i), lower);
            }
        }

        return s;
    }


    public static void main(String[] args) {

        ToLowerCase obj = new ToLowerCase();
        String s = "Hello@[]";
        System.out.println(obj.toLowerCase(s));
    }
}
