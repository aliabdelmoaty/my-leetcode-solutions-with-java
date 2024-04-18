

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElement rElement = new RemoveElement();
        int[] nums = { 3, 2, 2, 3 };
        int val = 2;
        rElement.removeElement(nums, val);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

}
