package pl.mbrzozowski.array.two;

/**
 * Return a version of the given array where each zero value in the array is replaced by the
 * largest odd value to the right of the zero in the array. If there is no odd value to the right
 * of the zero, leave the zero as a zero.
 */
public class ZeroMax {

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int maxOddNumber = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxOddNumber) {
                        maxOddNumber = nums[j];
                    }
                }
                nums[i] = maxOddNumber;
            }
        }
        return nums;
    }
}
