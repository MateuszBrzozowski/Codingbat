package pl.mbrzozowski.array.one;

/**
 * Given an array of ints of odd length, look at the first, last, and middle values in the array
 * and return the largest. The array length will be a least 1.
 */
public class MaxTriple {

    public int maxTriple(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        max = Math.max(max, nums[nums.length / 2]);
        return max;
    }
}
