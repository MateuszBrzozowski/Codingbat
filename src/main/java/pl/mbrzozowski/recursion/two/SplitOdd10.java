package pl.mbrzozowski.recursion.two;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
 * one group is a multiple of 10, and the sum of the other group is odd. Every int must be in
 * one group or the other. Write a recursive helper method that takes whatever arguments
 * you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
 */
public class SplitOdd10 {

    public boolean splitOdd10(int[] nums) {
        return splitOdd10(0, nums, 0, 0);
    }

    private boolean splitOdd10(int start, int[] nums, int multiple, int odd) {
        if (start > nums.length - 1) {
            return multiple % 10 == 0 && odd % 2 != 0;
        }
        if (splitOdd10(start + 1, nums, multiple + nums[start], odd)) {
            return true;
        }
        return splitOdd10(start + 1, nums, multiple, nums[start] + odd);
    }
}
