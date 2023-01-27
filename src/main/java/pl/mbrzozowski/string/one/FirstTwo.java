package pl.mbrzozowski.string.one;

/**
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
 * yields the empty string "". Note that str.length() returns the length of a string.
 */
public class FirstTwo {

    public String firstTwo(String str) {
        String result = "";
        if (str.length() >= 2) {
            result = str.substring(0, 2);
        } else {
            result = str;
        }
        return result;
    }
}
