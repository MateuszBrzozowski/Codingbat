package pl.mbrzozowski.string.three;

/**
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
 * immediately to its left or right. Return true if all the g's in the given string are happy.
 */
public class GHappy {

    public boolean gHappy(String str) {
        if (str.length() == 1) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i == 0 && str.charAt(i + 1) != 'g') {
                    return false;
                } else if (i == str.length() - 1 && str.charAt(i - 1) != 'g') {
                    return false;
                } else if (i != 0 && i != str.length() - 1 && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                    return false;
                }
            }
        }
        return true;
    }
}
