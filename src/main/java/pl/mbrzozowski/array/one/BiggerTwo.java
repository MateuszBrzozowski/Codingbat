package pl.mbrzozowski.array.one;

/**
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each
 * array. Return the array which has the largest sum. In event of a tie, return a.
 */
public class BiggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        for (int i : a) {
            sumA += i;
        }
        int sumB = 0;
        for (int i : b) {
            sumB += i;
        }
        if (sumA >= sumB) {
            return a;
        } else {
            return b;
        }
    }
}
