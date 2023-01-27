package pl.mbrzozowski.recursion.two;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints, beginning at the
 * start index, such that the group sums to the given target? However, with the additional
 * constraint that all 6's must be chosen. (No loops needed.)
 */
public class GroupSum6 {

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start > nums.length - 1) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum6(start + 1, nums, target);
    }
}
