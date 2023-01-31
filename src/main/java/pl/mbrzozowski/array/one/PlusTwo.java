package pl.mbrzozowski.array.one;

/**
 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
 */
public class PlusTwo {

    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        int j = a.length;
        for (int i = 0; i < b.length; i++) {
            result[j] = b[i];
            j++;
        }
        return result;
    }
}
