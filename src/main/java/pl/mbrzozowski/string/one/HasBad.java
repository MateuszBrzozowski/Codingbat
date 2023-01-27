package pl.mbrzozowski.string.one;

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
 * Note: use .equals() to compare 2 strings.
 */
public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() > 3 && (str.startsWith("bad") || str.substring(1, 4).equals("bad"))) {
            return true;
        } else if (str.length() == 3) {
            return str.contains("bad");
        } else {
            return false;
        }
    }
}
