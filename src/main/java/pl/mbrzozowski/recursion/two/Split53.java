package pl.mbrzozowski.recursion.two;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
 * the two groups is the same, with these constraints: all the values that are multiple of 5
 * must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5)
 * must be in the other. (No loops needed.)
 */
public class Split53 {

    public boolean split53(int[] nums) {
        return split53(0, nums, 0, 0);
    }

    private boolean split53(int start, int[] nums, int mult5, int mult3) {
        if (start > nums.length - 1) {
            return mult5 == mult3;
        }
        if (nums[start] % 5 == 0) {
            return split53(start + 1, nums, mult5 + nums[start], mult3);
        }
        if (nums[start] % 3 == 0) {
            return split53(start + 1, nums, mult5, mult3 + nums[start]);
        }
        if (split53(start + 1, nums, mult5 + nums[start], mult3)) {
            return true;
        }
        return split53(start + 1, nums, mult5, mult3 + nums[start]);
    }
}
