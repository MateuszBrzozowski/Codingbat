package pl.mbrzozowski.string.one;

/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged. This is a little harder than it looks.
 */
public class WithoutX2 {

    public String withoutX2(String str) {
        if (str.length() >= 2 && str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2);
        }
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        return str;
    }
}
