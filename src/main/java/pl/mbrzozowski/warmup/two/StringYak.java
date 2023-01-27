package pl.mbrzozowski.warmup.two;

/**
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
 * but the "a" can be any char. The "yak" strings will not overlap.
 */
public class StringYak {

    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (stringYakCheck(str.substring(i))) {
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    private boolean stringYakCheck(String substring) {
        if (substring.length() >= 3) {
            return substring.charAt(0) == 'y' && substring.charAt(2) == 'k';
        } else {
            return false;
        }
    }
}
