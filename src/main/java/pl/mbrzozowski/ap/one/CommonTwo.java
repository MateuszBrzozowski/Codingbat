package pl.mbrzozowski.ap.one;

/**
 * Start with two arrays of strings, a and b, each in alphabetical order, possibly with
 * duplicates. Return the count of the number of strings which appear in both arrays. The
 * best "linear" solution makes a single pass over both arrays, taking advantage of the fact
 * that they are in alphabetical order.
 */
public class CommonTwo {

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    count++;
                    break;
                }
            }
            for (int j = i; j < a.length; j++) {
                if (j < a.length - 1 && !a[j].equals(a[j + 1])) {
                    i = j;
                    break;
                }
            }
        }
        return count;
    }
}
