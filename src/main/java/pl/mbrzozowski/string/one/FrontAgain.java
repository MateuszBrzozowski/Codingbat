package pl.mbrzozowski.string.one;

/**
 * Given a string, return true if the first 2 chars in the string
 * also appear at the end of the string, such as with "edited".
 */
public class FrontAgain {

    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.startsWith(str.substring(str.length() - 2));
    }
}
