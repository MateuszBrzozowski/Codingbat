package pl.mbrzozowski.string.two;

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 */
public class DoubleChar {

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }
        return result.toString();
    }
}
