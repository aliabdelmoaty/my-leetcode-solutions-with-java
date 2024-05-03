import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(-nums[i])) {
                System.out.println(nums[i]);
                return nums[i];
            }
        }
        return -1;
    }

    public int findMaxK2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

        }
        for (int j = 0; j < nums.length; j++) {
            if (max < nums[j]) {
                if (set.contains((-nums[j]))) {
                    max = nums[j];

                }
            }
        }
        System.out.println(max);

        return max;
    }

    public static void main(String[] args) {
        LargestPositiveIntegerThatExistsWithItsNegative lNegative = new LargestPositiveIntegerThatExistsWithItsNegative();
        int[] nums = { -1, 2, -3, 3 };
        System.out.println(lNegative.findMaxK2(nums));
    }
}
