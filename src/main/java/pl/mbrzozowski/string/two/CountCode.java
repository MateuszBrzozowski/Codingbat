package pl.mbrzozowski.string.two;

/**
 * Return the number of times that the string "code" appears anywhere in the given string,
 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 */
public class CountCode {

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.substring(i, i + 4).endsWith("e")) {
                count++;
            }
        }
        return count;
    }
}
