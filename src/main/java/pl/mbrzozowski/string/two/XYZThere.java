package pl.mbrzozowski.string.two;

/**
 * Return true if the given string contains an appearance of "xyz" where the xyz
 * is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 */
public class XYZThere {

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) != '.' && str.substring(i, i + 4).endsWith("xyz")) {
                return true;
            }
        }
        return false;
    }
}
