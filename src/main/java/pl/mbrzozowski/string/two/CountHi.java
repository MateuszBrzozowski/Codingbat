package pl.mbrzozowski.string.two;

/**
 * Return the number of times that the string "hi" appears anywhere in the given string.
 */
public class CountHi {

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;
    }
}
