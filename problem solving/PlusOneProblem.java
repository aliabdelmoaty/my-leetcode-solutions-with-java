// import java.math.BigInteger;

// public class PlusOneProblem {

//     public int[] plusOne(int[] digits) {
//         String result = "";

//         for (int i = 0; i < digits.length; i++) {
//             if ((digits[digits.length - 1]) == 9) {
//                 result = result + digits[i];

//             } else {
//                 if (i == (digits.length - 1)) {
//                     int y = digits[i];
//                     y = y + 1;
//                     result = result + y;
//                 } else {
//                     result = result + digits[i];
//                 }
//             }
//         }
//         if ((digits[digits.length - 1]) == 9) {
//             BigInteger a = new BigInteger(result);
//             result = String.valueOf(a.add(BigInteger.ONE));
//         }

//         int[] digit = new int[result.length()];
//         System.out.println("result: " + result);
//         for (int i = 0; i < result.length(); i++) {
//             digit[i] = Integer.parseInt(result.substring(i, i + 1));
//         }

//         return digit;
//     }

//     public static void main(String[] args) {
//         PlusOneProblem plusOneProblem = new PlusOneProblem();
//         int[] digits = { 5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9 };
//         plusOneProblem.plusOne(digits);
//     }
// }

import java.math.BigInteger;

class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        String result = "";

        for (int i = 0; i < digits.length; i++) {
            result = result + digits[i];
        }
        BigInteger a = new BigInteger(result);
        result = String.valueOf(a.add(BigInteger.ONE));

        int[] digit = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            digit[i] = Integer.parseInt(result.substring(i, i + 1));
        }

        return digit;
    }

}
