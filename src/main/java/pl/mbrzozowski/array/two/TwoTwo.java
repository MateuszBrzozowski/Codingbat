package pl.mbrzozowski.array.two;

/**
 * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 */
public class TwoTwo {

    public boolean twoTwo(int[] nums) {
        boolean hasFront2 = false;
        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (!hasFront2 && nums[i + 1] != 2) {
                    return false;
                }
                hasFront2 = true;
            } else {
                if (i == nums.length - 2 && nums[i + 1] == 2) {
                    return false;
                }
                hasFront2 = false;
            }
        }
        return true;
    }
}
