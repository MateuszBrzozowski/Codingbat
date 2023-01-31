package pl.mbrzozowski.array.two;

import java.util.Arrays;

/**
 * Return the "centered" average of an array of ints, which we'll say is the mean average of
 * the values, except ignoring the largest and smallest values in the array. If there are
 * multiple copies of the smallest value, ignore just one copy, and likewise for the largest
 * value. Use int division to produce the final average. You may assume that the array is
 * length 3 or more.
 */
public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        boolean isMinTaken = false;
        boolean isMaxTaken = false;
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num == min && !isMinTaken) {
                isMinTaken = true;
            } else if (num == max && !isMaxTaken) {
                isMaxTaken = true;
            } else {
                sum += num;
                count++;
            }
        }
        return sum / count;
    }
}
