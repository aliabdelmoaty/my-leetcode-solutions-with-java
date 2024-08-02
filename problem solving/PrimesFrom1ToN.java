import java.util.Scanner;
 
public class PrimesFrom1ToN {
    public String Primes(int n) {
        String result = "";
        if (n < 2) {
            return "";
        }
        for (int i = 2; i <= n; i++) {
            int j;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break; // Not a prime, exit the loop
                }
            }
            if (j * j > i) { // If the loop completed without breaking, `i` is prime
                result = result + i + " ";
            }
        }
        return result.trim();
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        PrimesFrom1ToN sArray = new PrimesFrom1ToN();
        System.out.println(sArray.Primes(numbers));
        input.close();
    }
}