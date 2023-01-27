package pl.mbrzozowski.warmup.two;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */
public class StringTimes {

    public String stringTimes(String str, int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 1; i < n; i++) {
            strBuilder.append(str);
        }
        return strBuilder.toString();
    }
}
