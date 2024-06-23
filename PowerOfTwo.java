public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

        for (int i = 0; i < 32; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
        }
        return false;
    }

    public boolean isPowerOfTwo0(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public boolean isPowerOfTwo1(int n) {
        if (n <= 0)
            return false;

        int cont = Integer.bitCount(n);
        return cont == 1;
    }

    public boolean isPowerOfTwo3(int n) {
        if (n == 0)
            return false;

        while (n > 0) {
            if (n == 1)
                return true;
            if (n % 2 != 0) {
                break;
            } else {
                n = n / 2;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(1));
        System.out.println(powerOfTwo.isPowerOfTwo(16));
        System.out.println(powerOfTwo.isPowerOfTwo(10));
    }
}
