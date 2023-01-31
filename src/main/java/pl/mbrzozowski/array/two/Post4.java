package pl.mbrzozowski.array.two;

/**
 * Given a non-empty array of ints, return a new array containing the elements from the
 * original array that come after the last 4 in the original array. The original array will contain
 * at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Post4 {

    public int[] post4(int[] nums) {
        int indexOfLastFourNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                indexOfLastFourNumber = i;
            }
        }
        int[] result = new int[nums.length - indexOfLastFourNumber - 1];
        indexOfLastFourNumber++;
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[indexOfLastFourNumber++];
        }
        return result;
    }
}
