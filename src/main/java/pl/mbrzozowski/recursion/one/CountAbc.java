package pl.mbrzozowski.recursion.one;

/**
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 */
public class CountAbc {

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }
}
