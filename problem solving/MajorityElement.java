import java.util.HashMap;
import java.util.LinkedList;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int e = nums[0];

        HashMap<Integer, LinkedList<Integer>> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(nums[i])) {
                hMap.get(nums[i]).add(nums[i]);
            } else {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(nums[i]);
                hMap.put(nums[i], list);
            }

        }
        int maxSize = 0;

        for (LinkedList<Integer> list : hMap.values()) {
            if (list.size() > maxSize) {
                maxSize = list.size();
                e = list.getFirst();
            }
        }

        return e;

    }

    public static void main(String[] args) {
        int[] nums = { 6, 6, 6, 7, 7 };
        MajorityElement mElement = new MajorityElement();
        System.out.println(mElement.majorityElement(nums));
    }
}
