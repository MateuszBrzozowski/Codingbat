package pl.mbrzozowski.array.one;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 */
public class Sum3 {

    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
