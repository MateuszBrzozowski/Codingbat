package pl.mbrzozowski.string.two;

/**
 * Given a string, consider the prefix string made of the first N chars of the string.
 * Does that prefix string appear somewhere else in the string?
 * Assume that the string is not empty and that N is in the range 1..str.length().
 */
public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
        char charAtIndex = str.charAt(n - 1);
        for (int i = 0; i < str.length(); i++) {
            if (i != n - 1 && str.charAt(i) == charAtIndex) {
                return true;
            }
        }
        return false;
    }
}
