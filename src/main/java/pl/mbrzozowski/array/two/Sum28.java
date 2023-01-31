package pl.mbrzozowski.array.two;

/**
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
 */
public class Sum28 {

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return sum == 8;
    }
}
