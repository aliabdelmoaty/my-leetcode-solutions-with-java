import java.util.HashSet;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        /*
   if (nums.length <= 100000 ) {
            for (int i = 0; i < nums.length; i++) {
                if (-1000000000 <= nums[i] && nums[i] <= 1000000000) {
                    for (int j = 0; j < nums.length; j++) {
                        if (j == i) {
                            continue;
                        }
                        if (nums[j] == nums[i]) {
                            return true;
                        }
                    }
                }
            
            }
        }
        
        return false;

    }
*/

        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;

            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        contains_duplicate ad = new contains_duplicate();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println(ad.containsDuplicate(nums));
    }
}
