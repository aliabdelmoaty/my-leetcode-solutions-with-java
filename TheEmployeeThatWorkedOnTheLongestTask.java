
public class TheEmployeeThatWorkedOnTheLongestTask {
    public int hardestWorker(int n, int[][] logs) {
        int max = 0;
        int logTime = 0;
        int pre = 0;
        for (int i = 0; i < logs.length; i++) {
            int result = logs[i][1] - pre;
            pre = logs[i][1];
            if (result > logTime) {
                logTime = result;
                max = logs[i][0];
            }
            if (result == logTime && max > logs[i][0]) {
                logTime = result;
                max = logs[i][0];

            }

        }
        return max;
    }

    public static void main(String[] args) {
        TheEmployeeThatWorkedOnTheLongestTask obj = new TheEmployeeThatWorkedOnTheLongestTask();
        int n = 3;
        int[][] logs = {

                { 36, 3 },
                { 1, 5 },
                { 12, 8 },
                { 25, 9 },
                { 53, 11 },
                { 29, 12 },
                { 52, 14 }

        };

        System.out.println(obj.hardestWorker(n, logs));
    }
}
