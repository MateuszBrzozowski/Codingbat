package pl.mbrzozowski.string.one;

/**
 * Given a string, return a string length 1 from its front, unless front is false,
 * in which case return a string length 1 from its back. The string will be non-empty.
 */
public class TheEnd {

    public String theEnd(String str, boolean front) {
        if (front && str.length() > 1) {
            return String.valueOf(str.charAt(0));
        } else if (!front && str.length() > 1) {
            return String.valueOf(str.charAt(str.length() - 1));
        } else {
            return str;
        }
    }
}
