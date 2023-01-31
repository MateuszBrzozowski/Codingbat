package pl.mbrzozowski.array.two;

/**
 * Return an array that contains the exact same numbers as the given array, but rearranged
 * so that all the even numbers come before all the odd numbers. Other than that, the
 * numbers can be in any order. You may modify and return the given array, or make a new array.
 */
public class EvenOdd {

    public int[] evenOdd(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        int buffer = nums[i];
                        nums[i] = nums[j];
                        nums[j] = buffer;
                    }
                }
            }
        }
        return nums;
    }
}
