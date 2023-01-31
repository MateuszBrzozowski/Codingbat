package pl.mbrzozowski.array.three;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array that contains
 * exactly the same numbers as the given array, but rearranged so that every 4 is
 * immediately followed by a 5. Do not move the 4's, but every other number may move. The
 * array contains the same number of 4's and 5's, and every 4 has a number after it that
 * is not a 4. In this version, 5's may appear anywhere in the original array.
 */
public class Fix45 {

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = nums.length - 1; j > 0; j--) {
                    if (nums[j] == 5 && nums[j - 1] != 4) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    if (j == 1) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j - 1];
                        nums[j - 1] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
