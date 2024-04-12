public class SumBinary {
    /*
     * 0 + 0 = 0
     * 0 + 1 = 1
     * 1 + 1 = 0 , 1
     * 1 + 1 + 1 = 1 , 1
     * 
     */
    public String addBinary(String a, String b) {
        String result = "";
        int min = Math.min(a.length(), b.length());
        int carry = 0;
        System.out.println(a.length() + " : " + b.length());
        for (int i = 0; i < min; i++) {
            System.out.println(i);
            result += (a.charAt(i) ^ b.charAt(i)) != 0 ? "0" : "1";
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry == 1) {

                    result = result + "1";
                    carry = 0;
                } else {
                    result = result + "0";
                }
            } else if ((a.charAt(i) == '0' && b.charAt(i) == '1') || (a.charAt(i) == '1' && b.charAt(i) == '0')) {
                if (carry == 1) {
                    if (i == a.length() - 1 || i == b.length() - 1) {
                        result = result + "01";
                    } else {
                        result = result + "0";
                        carry = 1;
                    }

                } else {
                    result = result + "1";
                }

            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == 1) {
                    if (i == a.length() - 1 || i == b.length() - 1) {
                        result = result + "11";
                    } else {
                        result = result + "1";
                        carry = 1;
                    }

                } else {
                    if (i == a.length() - 1 || i == b.length() - 1) {
                        result = result + "01";
                    } else {
                        result = result + "0";
                        carry = 1;
                    }

                }

            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        SumBinary sumBinary = new SumBinary();
        sumBinary.addBinary("11", "1");
    }
}
