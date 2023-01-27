package pl.mbrzozowski.string.two;

/**
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
 * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 */
public class ZipZap {

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= i + 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append(str.charAt(i)).append(str.charAt(i + 2));
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
