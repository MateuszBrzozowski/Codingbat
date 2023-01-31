package pl.mbrzozowski.array.three;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of
 * the numbers in inner appear in outer. The best solution makes only a single "linear" pass of
 * both arrays, taking advantage of the fact that both arrays are already in sorted order.
 */
public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length && j < inner.length; i++) {
            int temp = inner[j];
            if (outer[i] == temp) {
                j++;
                i--;
            }
            if (j == inner.length) {
                return true;
            }
        }
        return inner.length == 0;
    }
}
