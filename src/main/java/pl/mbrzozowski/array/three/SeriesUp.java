package pl.mbrzozowski.array.three;

/**
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
 * (spaces added to show the grouping). Note that the length of the array will
 * be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
 */
public class SeriesUp {

    public int[] seriesUp(int n) {
        int[] result = new int[(n * (n + 1)) / 2];
        int numberToFill = 1;
        int maxNumberNow = 1;
        int index = 0;
        while (maxNumberNow <= n) {
            result[index] = numberToFill;
            if (numberToFill == maxNumberNow) {
                numberToFill = 1;
                maxNumberNow++;
            } else {
                numberToFill++;
            }
            index++;
        }
        return result;
    }
}
