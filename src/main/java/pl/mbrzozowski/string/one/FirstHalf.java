package pl.mbrzozowski.string.one;

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 */
public class FirstHalf {

    public String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }
}
