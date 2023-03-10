package pl.mbrzozowski.ap.one;

/**
 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
 * Given an array of positive ints, return a new array of length "count" containing the first
 * endy numbers from the original array. Decompose out a separate isEndy(int n) method to
 * test if a number is endy. The original array will contain at least "count" endy numbers.
 */
public class CopyEndy {

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length && j < result.length; i++) {
            if (isEndy(nums[i])) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    private boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}
