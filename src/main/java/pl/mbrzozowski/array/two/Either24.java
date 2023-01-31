package pl.mbrzozowski.array.two;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 */
public class Either24 {

    public boolean either24(int[] nums) {
        boolean is2NextTo2 = false;
        boolean is4NextTo4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                is2NextTo2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                is4NextTo4 = true;
            }
        }
        if (!is2NextTo2 && !is4NextTo4) {
            return false;
        } else if (is2NextTo2 && !is4NextTo4) {
            return true;
        } else {
            return !is2NextTo2;
        }
    }
}
