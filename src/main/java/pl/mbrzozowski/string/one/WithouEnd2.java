package pl.mbrzozowski.string.one;

/**
 * Given a string, return a version without both the first and last char of the string.
 * The string may be any length, including 0.
 */
public class WithouEnd2 {

    public String withouEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }
}
