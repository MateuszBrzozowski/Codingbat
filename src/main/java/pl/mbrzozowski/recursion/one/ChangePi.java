package pl.mbrzozowski.recursion.one;

/**
 * Given a string, compute recursively (no loops) a new string where
 * all appearances of "pi" have been replaced by "3.14".
 */
public class ChangePi {

    public String changePi(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("pix")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }
}
