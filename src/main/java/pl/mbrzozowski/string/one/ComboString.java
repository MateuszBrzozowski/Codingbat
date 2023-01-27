package pl.mbrzozowski.string.one;

/**
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 */
public class ComboString {

    public String comboString(String a, String b) {
        String shortString = "";
        String longString = "";
        if (a.length() < b.length()) {
            shortString = a;
            longString = b;
        } else {
            shortString = b;
            longString = a;
        }
        return shortString + longString + shortString;
    }
}
