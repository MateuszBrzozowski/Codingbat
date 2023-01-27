package pl.mbrzozowski.string.one;

/**
 * Given a string of odd length, return the string length 3 from its middle,
 * so "Candy" yields "and". The string length will be at least 3.
 */
public class MiddleThree {

    public String middleThree(String str) {
        if (str.length() > 3) {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
        } else {
            return str;
        }
    }
}
