import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] == nums[j + 1]) {
                    nums[j] = 101 + i;
                    count++;
                }
            }
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(Arrays.copyOf(nums, count - 1)));

        System.out.println(Arrays.toString(nums));
        return nums.length - count;
    }
    
    public int removeDuplicates2(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public int removeDuplicates4(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(rArray.removeDuplicates(nums));
    }
}
