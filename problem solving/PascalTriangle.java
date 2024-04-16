import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) { 
            List<Integer> rows = new ArrayList<>();

            for (int j = 0; j <= result.get(i - 1).size(); j++) {
                if (j == 0 || j == result.get(i - 1).size()) {
                    rows.add(1);

                } else {
                    rows.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }

            }
            result.add(rows);
        }

        return result;

    }

    public static void main(String[] args) {
        PascalTriangle pTriangle = new PascalTriangle();
        pTriangle.generate(6);
    }
}