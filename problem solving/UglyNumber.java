public class UglyNumber {
    public boolean isUgly(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0) {
            return false;
        }
        int[] primes = { 2, 3, 5 };
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        int n = 300;
        System.out.println(uglyNumber.isUgly(n));
    }

}
