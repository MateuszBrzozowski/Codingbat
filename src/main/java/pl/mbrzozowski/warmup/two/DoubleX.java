package pl.mbrzozowski.warmup.two;

/**
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 */
public class DoubleX {

    boolean doubleX(String str) {
        return (str.indexOf('x') == str.indexOf("xx")) && str.indexOf('x') != -1;
    }
}
