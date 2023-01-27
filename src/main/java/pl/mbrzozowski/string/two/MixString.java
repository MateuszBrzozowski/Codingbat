package pl.mbrzozowski.string.two;

/**
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
 * the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 */
public class MixString {

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }
}
