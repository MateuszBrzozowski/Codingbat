package pl.mbrzozowski.recursion.one;

/**
 * Given a string, compute recursively a new string where all the lowercase 'x' chars
 * have been moved to the end of the string.
 */
public class EndX {

    public String endX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.startsWith("x")) {
            return endX(str.substring(1)) + "x";
        }
        return str.charAt(0) + endX(str.substring(1));
    }
}
