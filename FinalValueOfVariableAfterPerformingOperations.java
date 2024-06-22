public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String string : operations) {
            if (string.contains("++")) {
                x = x + 1;
            }
            if (string.contains("--")) {
                x = x - 1;
            }
        }
        return x;

    }

    public static void main(String[] args) {
        FinalValueOfVariableAfterPerformingOperations finalValueOfVariableAfterPerformingOperations = new FinalValueOfVariableAfterPerformingOperations();
        String[] operations = { "X++", "++X", "--X", "X--" };
        System.out.println(finalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations));

    }
}
