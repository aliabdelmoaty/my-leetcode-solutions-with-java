public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int r = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                r++;
            }

        }
        return r;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        NumberOfCommonFactors obj = new NumberOfCommonFactors();
        System.out.println(obj.commonFactors(a, b));

    }
}
