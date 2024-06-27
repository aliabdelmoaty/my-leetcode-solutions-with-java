import java.util.Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int[] results = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int p = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                p = p + accounts[i][j];
            }
            results[i] = p;
        }
        Arrays.sort(results);
        return results[results.length - 1];

    }

    public static void main(String[] args) {
        RichestCustomerWealth obj = new RichestCustomerWealth();
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println(obj.maximumWealth(accounts));
    }
}
