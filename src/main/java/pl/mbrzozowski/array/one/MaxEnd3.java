package pl.mbrzozowski.array.one;

import java.util.Arrays;

/**
 * Given an array of ints length 3, figure out which is larger, the first or last element in the
 * array, and set all the other elements to be that value. Return the changed array.
 */
public class MaxEnd3 {

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, max);
        return nums;
    }
}
