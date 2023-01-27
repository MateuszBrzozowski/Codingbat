package pl.mbrzozowski.string.three;

/**
 * Given a string, return the longest substring that appears at both the beginning
 * and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 */
public class SameEnds {

    public String sameEnds(String string) {
        int mid = string.length() / 2;
        int indexTemp = mid;
        if (string.length() % 2 != 0) {
            mid++;
        }
        while (indexTemp > 0) {
            if (string.substring(0, indexTemp).equals(string.substring(mid))) {
                return string.substring(mid);
            }
            indexTemp--;
            mid++;
        }
        return "";
    }
}
