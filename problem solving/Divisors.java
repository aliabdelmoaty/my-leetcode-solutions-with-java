import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        for (int i = 1; i <= numbers; i++) {
            if (numbers % i == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
