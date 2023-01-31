package pl.mbrzozowski.array.two;

/**
 * Given an array length 1 or more of ints, return the difference between the largest and
 * smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
 * methods return the smaller or larger of two values.
 */
public class BigDiff {

    public int bigDiff(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }
}
