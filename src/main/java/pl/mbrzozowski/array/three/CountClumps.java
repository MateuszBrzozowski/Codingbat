package pl.mbrzozowski.array.three;

/**
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
 * Return the number of clumps in the given array.
 */
public class CountClumps {

    public int countClumps(int[] nums) {
        int count = 0;
        int countTemp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    countTemp++;
                } else if (nums[i] != nums[j] && countTemp >= 2) {
                    count++;
                    i = j - 1;
                    break;
                } else {
                    break;
                }
                if (countTemp >= 2 && j == nums.length - 1) {
                    count++;
                    i = j;
                }
            }
            countTemp = 1;
        }
        return count;
    }
}
