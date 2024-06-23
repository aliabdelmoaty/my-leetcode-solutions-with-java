import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BaseballGame {
    public int calPoints0(String[] operations) {
        int result = 0;
        int o = 0;
        int[] num = new int[operations.length];
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                    int u = num[o - 1] + num[o - 2];
                    num[o] = u;
                    result = result + u;
                    o++;
                    System.out.println(Arrays.toString(num) + " :+ : " + result);

                    break;
                case "D":
                    int p = num[o - 1];
                    p = p * 2;
                    num[o] = p;
                    o++;
                    result = result + p;
                    System.out.println(Arrays.toString(num) + " :d : " + result);

                    break;
                case "C":
                    result = result - num[o - 1];
                    num[o - 1] = 0;
                    o--;
                    System.out.println(Arrays.toString(num) + " :c : " + result);
                    break;
                default:
                    int y = Integer.parseInt(operations[i]);
                    num[o] = y;
                    result = result + y;
                    o++;
                    System.out.println(Arrays.toString(num) + " :def : " + result);

            }
        }
        return result;

    }

    public int calPoints(String[] operations) {
        int result = 0;
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                    int t = ((LinkedList<Integer>) qu).pollLast();
                    int o = ((LinkedList<Integer>) qu).pollLast();
                    int q = t + o;
                    qu.add(o);
                    qu.add(t);
                    qu.add(q);
                    break;
                case "D":
                    ((LinkedList<Integer>) qu).getLast();
                    int doubleRecord = ((LinkedList<Integer>) qu).getLast();
                    doubleRecord = 2 * doubleRecord;
                    qu.add(doubleRecord);
                    System.out.println(qu + " :d");
                    break;

                case "C":
                    ((LinkedList<Integer>) qu).pollLast();
                    System.out.println(qu + " :c");
                    break;
                default:
                    qu.add(Integer.parseInt(operations[i]));
                    System.out.println(qu + " :def");

            }
        }
        while (!qu.isEmpty()) {
            Integer removedRear = ((LinkedList<Integer>) qu).pollLast();
            result = result + removedRear;
        }
        return result;
    }

    public static void main(String[] args) {
        BaseballGame bg = new BaseballGame();
        String[] operations = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println(bg.calPoints0(operations));

    }
}
