import java.util.Arrays;

public class CompareVersionNumbers {
    public int compareVersion1(String version1, String version2) {
        String[] splitV1 = version1.split("\\.");
        String[] splitV2 = version2.split("\\.");
        int max = Math.max(splitV1.length, splitV2.length);
        for (int i = 0; i < max; i++) {
            int v1 = i < splitV1.length ? Integer.parseInt(splitV1[i]) : 0;
            int v2 = i < splitV2.length ? Integer.parseInt(splitV2[i]) : 0;
            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }
    public int compareVersion(String version1, String version2) {
        String[] splitV1 = version1.split("\\.");
        String[] splitV2 = version2.split("\\.");
        int result = 0;
        if (!version2.contains("\\.")) {
            version2 = version2 + ".";
        }
        if (!version1.contains("\\.")) {
            version1 = version1 + ".";
        }
        int max = Math.max(splitV1.length, splitV2.length);
        for (int i = 0; i < max; i++) {
            if (splitV1.length > i && splitV2.length > i) {
                if (Integer.parseInt(splitV1[i]) > Integer.parseInt(splitV2[i])) {
                    return 1;
                } else if (Integer.parseInt(splitV1[i]) < Integer.parseInt(splitV2[i])) {
                    return -1;
                }
            } else if (splitV1.length > i) {
                if (Integer.parseInt(splitV1[i]) > 0) {
                    result = 1;
                }
            } else if (splitV2.length > i) {
                if (Integer.parseInt(splitV2[i]) > 0) {
                    result = -1;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String version1 = "1.0.1", version2 = "1";
        CompareVersionNumbers cNumbers = new CompareVersionNumbers();
        System.out.println(cNumbers.compareVersion(version1, version2));
    }
}
