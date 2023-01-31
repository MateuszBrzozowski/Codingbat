package pl.mbrzozowski.array.one;

/**
 * Given an array of ints length 3, return a new array with the elements in reverse order, so
 * {1, 2, 3} becomes {3, 2, 1}.
 */
public class Reverse3 {

    public int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[result.length - 1 - i] = nums[i];
        }
        return result;
    }
}
