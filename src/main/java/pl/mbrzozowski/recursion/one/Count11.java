package pl.mbrzozowski.recursion.one;

/**
 * Given a string, compute recursively (no loops) the number of "11" substrings in the string.
 * The "11" substrings should not overlap.
 */
public class Count11 {

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
}
