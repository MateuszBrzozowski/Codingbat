package pl.mbrzozowski.array.one;

/**
 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 */
public class Double23 {

    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int num : nums) {
            if (num == 2) {
                count2++;
            }
            if (num == 3) {
                count3++;
            }
        }
        return count2 == 2 || count3 == 2;
    }
}
