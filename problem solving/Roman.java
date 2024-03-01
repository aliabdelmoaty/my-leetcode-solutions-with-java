
/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
import java.util.*;

public class Roman {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (value > prevValue) {
                result += value - 2 * prevValue;
            } else {
                result += value;
            }
            prevValue = value;
        }
       
        return result;
    }

    public static void main(String[] args) {
        Roman roman = new Roman();
        System.out.println(roman.romanToInt("MCMXCIV")); // Output: 1994
    }
}

// public class Roman {
// public int romanToInt(String s) {
// Map<Character, Integer> map = new HashMap<Character, Integer>();
// map.put('I', 1);
// map.put('V', 5);
// map.put('X', 10);
// map.put('L', 50);
// map.put('C', 100);
// map.put('D', 500);
// map.put('M', 1000);
// int result = 0;
// int beforeNum = 0;

// for (Map.Entry<Character, Integer> entry : map.entrySet()) {
// for (int i = 0; i < s.length(); i++) {
// if ((entry.getKey().equals(s.charAt(i))) == true) {
// if (beforeNum != 0 && entry.getValue() > beforeNum) {

// result += entry.getValue() - 2 * beforeNum;

// System.out.println("result-: " + result);

// }
// else {
// result += entry.getValue();
// }
// beforeNum = entry.getValue();
// System.out.println("beforeNum:" + beforeNum);
// System.out.println("current:" + entry.getValue());

// }
// }

// }

// return result;
// }

// public static void main(String[] args) {
// Roman roman = new Roman();
// System.out.println(roman.romanToInt("MCMXCIV"));
// }
// }
