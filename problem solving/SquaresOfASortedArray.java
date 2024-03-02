import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = (int) Math.pow((double) nums[i], 2.0);
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray sASortedArray = new SquaresOfASortedArray();
        int[] nums = { -7, -3, 2, 3, 11 };
        sASortedArray.sortedSquares(nums);
    }
}
