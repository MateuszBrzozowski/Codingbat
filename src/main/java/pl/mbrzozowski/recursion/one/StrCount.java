package pl.mbrzozowski.recursion.one;

/**
 * Given a string and a non-empty substring sub, compute recursively the number
 * of times that sub appears in the string, without the sub strings overlapping.
 */
public class StrCount {

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }
}
