package pl.mbrzozowski.array.one;

/**
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
 * set the 3 element to 0. Return the changed array.
 */
public class Fix23 {

    public int[] fix23(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i - 1] == 2) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}
