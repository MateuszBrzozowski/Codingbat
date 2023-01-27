package pl.mbrzozowski.string.two;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
 * but "xyx" is not. One 'y' can balance multiple 'x's.
 * Return true if the given string is xy-balanced.
 */
public class XYBalance {

    public boolean xyBalance(String str) {
        return !str.contains("x") || (str.lastIndexOf("x") < str.lastIndexOf("y"));
    }
}
