package pl.mbrzozowski.string.one;

/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char,
 * then omit one of the chars, so "abc" and "cat" yields "abcat".
 */
public class ConCat {

    public String conCat(String a, String b) {
        if (b.length() > 0 && a.endsWith(b.substring(0, 1))) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }
}
