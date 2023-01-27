package pl.mbrzozowski.string.one;

/**
 * Given 2 strings, a and b, return a new string made of the
 * first char of a and the last char of b, so "yo" and "java" yields "ya".
 * If either string is length 0, use '@' for its missing char.
 */
public class LastChars {

    public String lastChars(String a, String b) {
        String result = "";
        if (a.length() > 0) {
            result += a.charAt(0);
        } else {
            result += "@";
        }
        if (b.length() > 0) {
            result += b.substring(b.length() - 1);
        } else {
            result += "@";
        }
        return result;
    }
}
