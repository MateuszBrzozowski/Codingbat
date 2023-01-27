package pl.mbrzozowski.recursion.one;

/**
 * Given a string and a non-empty substring sub, compute recursively the largest substring
 * which starts and ends with sub and return its length.
 */
public class StrDist {

    public int strDist(String str, String sub) {
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        } else if (str.startsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else if (str.length() < 2) {
            return 0;
        }
        return strDist(str.substring(1, str.length() - 1), sub);
    }
}
