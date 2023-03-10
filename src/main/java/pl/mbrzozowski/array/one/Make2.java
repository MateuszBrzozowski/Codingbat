package pl.mbrzozowski.array.one;

/**
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the
 * elements from a followed by the elements from b. The arrays may be any length, including 0,
 * but there will be 2 or more elements available between the 2 arrays.
 */
public class Make2 {

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        int i;

        i = 0;
        while (count < 2 && i < a.length) {
            result[count] = a[i];
            count++;
            i++;
        }

        i = 0;
        while (count < 2 && i < b.length) {
            result[count] = b[i];
            count++;
            i++;
        }

        return result;
    }
}
