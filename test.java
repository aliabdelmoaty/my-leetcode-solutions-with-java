import java.util.Scanner;

// public class sortArray {
//     public String Primes(int n) {
//         String reString = "2 3";
//         for (int i = 2; i <= n; i++) {
//             if (i % 2 != 0 && i / i == 1 && i / 1 == i && i % 3 != 0) {
//                 reString = reString + " " + i;
//             }
//         }
//         return reString;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int numbers = input.nextInt();

//         sortArray sArray = new sortArray();
//         sArray.Primes(numbers);
//         input.close();
//     }

// }

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String reString = "2 3";
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0 && i / i == 1 && i / 1 == i && i % 3 != 0) {
                reString = reString + " " + i;
            }
        }
        System.out.println(reString);
        input.close();
    }
}