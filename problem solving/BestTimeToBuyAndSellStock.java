import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num=0;  num<nums.length;num++) {
            result ^= num;
        }
        return result;

    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bStock = new BestTimeToBuyAndSellStock();
        int[] m = { 1, 1, 5 };
        System.out.println(bStock.singleNumber(m));
    }
}
