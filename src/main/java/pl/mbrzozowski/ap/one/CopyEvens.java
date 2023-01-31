package pl.mbrzozowski.ap.one;

/**
 * Given an array of positive ints, return a new array of length "count" containing the first
 * even numbers from the original array. The original array will contain at least "count" even numbers.
 */
public class CopyEvens {

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length && j < result.length; i++) {
            if (nums[i] % 2 == 0) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }
}
