package pl.mbrzozowski.array.one;

/**
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class No23 {

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }
}
