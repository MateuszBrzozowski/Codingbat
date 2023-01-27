package pl.mbrzozowski.string.two;

/**
 * Return a version of the given string, where for every star (*) in the string the star and
 * the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 */
public class StarOut {

    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                i++;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                i += 2;
            } else {
                if (i == 0 || str.charAt(i - 1) != '*') {
                    result.append(str.charAt(i));
                }
            }
        }
        return result.toString();
    }
}
