package pl.mbrzozowski.array.two;

/**
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You
 * may modify and return the given array, or return a new array.
 */
public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
}
