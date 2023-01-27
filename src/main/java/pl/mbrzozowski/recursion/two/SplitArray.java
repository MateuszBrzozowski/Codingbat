package pl.mbrzozowski.recursion.two;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of
 * the two groups are the same. Every int must be in one group or the other. Write a
 * recursive helper method that takes whatever arguments you like, and make the initial call
 * to your recursive helper from splitArray(). (No loops needed.)
 */
public class SplitArray {

    public boolean splitArray(int[] nums) {
        return splitArray(0, nums, 0, 0);
    }

    private boolean splitArray(int start, int[] nums, int sumA, int sumB) {
        if (start > nums.length - 1) {
            return sumA == sumB;
        }
        if (splitArray(start + 1, nums, sumA + nums[start], sumB)) {
            return true;
        }
        return splitArray(start + 1, nums, sumA, sumB + nums[start]);
    }
}
