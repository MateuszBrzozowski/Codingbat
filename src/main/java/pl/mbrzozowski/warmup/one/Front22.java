package pl.mbrzozowski.warmup.one;

/**
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
 * so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 */
public class Front22 {

    public String front22(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        } else {
            return str + str + str;
        }
    }
}
