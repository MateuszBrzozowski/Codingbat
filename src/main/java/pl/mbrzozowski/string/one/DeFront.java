package pl.mbrzozowski.string.one;

/**
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.
 */
public class DeFront {

    public String deFront(String str) {
        if (str.startsWith("ab")) {
            return str;
        } else if (str.length() >= 2 && str.charAt(1) == 'b') {
            return str.substring(1);
        } else if (str.length() >= 2 && str.startsWith("a")) {
            return str.charAt(0) + str.substring(2);
        } else if (str.length() >= 2) {
            return str.substring(2);
        } else {
            return str;
        }
    }
}
