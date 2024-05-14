import java.util.Arrays;

public class KthSmallestPrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] result = new int[2];
        Arrays.sort(arr);
        double min = (double) arr[0] / (double) arr[arr.length - 1];
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                double a = arr[i];
                double b = arr[j];
                double r = a / b;

                System.out.println(r);
                if (min >= r) {
                    min = r;
                    result[0] = arr[i];
                    result[1] = arr[j];

                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        KthSmallestPrimeFraction kFraction = new KthSmallestPrimeFraction();
        int[] arr = { 1, 2, 3, 5 };
        int k = 3;
        System.out.println(kFraction.kthSmallestPrimeFraction(arr, k));
    }
}
