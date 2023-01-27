package pl.mbrzozowski.string.one;

/**
 * Given 2 strings, return their concatenation, except omit the first char of each.
 * The strings will be at least length 1.
 */
public class NonStart {

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
