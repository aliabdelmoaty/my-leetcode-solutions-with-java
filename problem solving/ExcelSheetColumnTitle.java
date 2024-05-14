public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        String result = "";
        String[] characters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        int o = 0;
        int r = columnNumber;

        if (columnNumber < 27) {
            result = characters[columnNumber - 1];
        } else if (columnNumber < 703) {
            int i = columnNumber / 26;
            if ((columnNumber % 26) - 1 > 0) {
                result = characters[i - 1] + characters[(columnNumber % 26) - 1];
            } else {
                result = characters[i - 1] + characters[i - 1];
            }
        } else {
            while (r >= 26) {
                r = r / 26;
                result += characters[(o % 26) - 1];
                System.out.println(result);
            }
        }
        System.out.println(r + " o: " + o);
        return result;
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        System.out.println(e.convertToTitle(2147483647));
    }
}
