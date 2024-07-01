import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int number=0;
        for (int i = 0; i < nums.length; i++) {
            if (number==nums[i]) {
                number++;
                continue;
            }
            
        }
        return number;
    }

    public static void main(String[] args) {
        int[] num = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(num));
    }
}
