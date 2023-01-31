package pl.mbrzozowski.array.one;

/**
 * Given an array of ints length 3, return an array with the elements "rotated left" so
 * {1, 2, 3} yields {2, 3, 1}.
 */
public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {
        int buffer = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = buffer;
        return nums;
    }
}
