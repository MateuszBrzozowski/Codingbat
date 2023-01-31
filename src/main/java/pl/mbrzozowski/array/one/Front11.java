package pl.mbrzozowski.array.one;

import java.util.Arrays;

/**
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of
 * each array. If either array is length 0, ignore that array.
 */
public class Front11 {

    public int[] front11(int[] a, int[] b) {
        int[] result = new int[0];
        if (a.length > 0) {
            result = new int[1];
            result[0] = a[0];
        }
        if (b.length > 0) {
            int[] resultB = Arrays.copyOf(result, result.length);
            result = new int[result.length + 1];
            for (int i = 0; i < resultB.length; i++) {
                result[i] = resultB[i];
            }
            result[result.length - 1] = b[0];
        }
        return result;
    }
}
