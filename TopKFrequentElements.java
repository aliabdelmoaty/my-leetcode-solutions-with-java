public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        TopKFrequentElements obj = new TopKFrequentElements();
        int[] result = obj.topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }   
}
