import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
//  TODO not solve 
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[k];
        int count = 1;
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (!hashMap.containsKey(nums[i]))
                    hashMap.put(nums[i], count);
                else
                    hashMap.replace(nums[i], count);

            } else {
                count = 1;
            }
        }
        int[] h = new int[hashMap.size()];
        AtomicInteger i = new AtomicInteger(0);

        hashMap.forEach((key, value) -> {
            h[i.incrementAndGet()] = value;
        });
        System.out.println(hashMap.toString());
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(h));

        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 1, 3, 2 };
        int k = 2;
        TopKFrequentElements obj = new TopKFrequentElements();
        int[] result = obj.topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
