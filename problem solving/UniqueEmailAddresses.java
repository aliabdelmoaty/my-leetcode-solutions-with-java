import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                StringBuilder stringBuilder = new StringBuilder();
                if (emails[i].charAt(j) != '+') {
                    if (emails[i].charAt(j) != '.') {
                        stringBuilder.append(emails[i].charAt(j));
                    }
                }  if (emails[i].charAt(j) == '@') {
                    break;
                }
                System.out.print(stringBuilder);

            }
        }
        return 2;
    }

    public static void main(String[] args) {
        UniqueEmailAddresses uAddresses = new UniqueEmailAddresses();
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        uAddresses.numUniqueEmails(emails);
    }
}
