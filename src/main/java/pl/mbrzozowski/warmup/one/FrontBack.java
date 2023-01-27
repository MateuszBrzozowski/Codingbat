package pl.mbrzozowski.warmup.one;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 */
public class FrontBack {

    public String frontBack(String str) {
        if (!str.isEmpty()) {
            if (str.length() > 1) {
                return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            } else {
                return str;
            }
        }
        return "";
    }
}
