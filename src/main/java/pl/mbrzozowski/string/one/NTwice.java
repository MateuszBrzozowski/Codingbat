package pl.mbrzozowski.string.one;

/**
 * Given a string and an int n, return a string made of the first and last n chars from the string.
 * The string length will be at least n.
 */
public class NTwice {

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
