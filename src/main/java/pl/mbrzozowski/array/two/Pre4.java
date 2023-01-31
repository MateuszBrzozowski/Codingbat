package pl.mbrzozowski.array.two;

/**
 * Given a non-empty array of ints, return a new array containing the elements from the
 * original array that come before the first 4 in the original array. The original array will
 * contain at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Pre4 {

    public int[] pre4(int[] nums) {
        int indexFirstFourNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                indexFirstFourNumber = i;
                break;
            }
        }
        int[] result = new int[indexFirstFourNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }
        return result;
    }
}
