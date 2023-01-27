package pl.mbrzozowski.recursion.one;

/**
 * Given a string and a non-empty substring sub, compute recursively if at least n copies
 * of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
 */
public class StrCopies {

    public boolean strCopies(String str, String sub, int n) {
        if (str.length() < sub.length()) {
            return false;
        }
        if (n < 1 || (str.startsWith(sub) && n <= 1)) {
            return true;
        } else if (str.startsWith(sub) && n > 1) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);
    }
}
