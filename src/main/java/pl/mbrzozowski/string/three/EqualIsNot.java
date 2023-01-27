package pl.mbrzozowski.string.three;

/**
 * Given a string, return true if the number of appearances of "is" anywhere in the string
 * is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 */
public class EqualIsNot {

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("is")) {
                countIs++;
            }
            if (str.substring(i).startsWith("not")) {
                countNot++;
            }
        }
        return countIs == countNot;
    }
}
