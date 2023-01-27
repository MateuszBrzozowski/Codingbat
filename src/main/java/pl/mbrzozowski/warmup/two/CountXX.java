package pl.mbrzozowski.warmup.two;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class CountXX {

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 2);
            if (substring.equals("xx")) {
                count++;
            }
        }
        return count;
    }
}
