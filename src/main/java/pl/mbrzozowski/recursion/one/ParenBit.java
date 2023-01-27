package pl.mbrzozowski.recursion.one;

/**
 * Given a string that contains a single pair of parenthesis, compute recursively a new string made
 * of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
 */
public class ParenBit {

    public String parenBit(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;
        } else if (str.startsWith("(")) {
            return parenBit(str.substring(0, str.length() - 1));
        } else if (str.endsWith(")")) {
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(1, str.length() - 1));
    }
}
