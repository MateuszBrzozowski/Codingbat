package pl.mbrzozowski.array.one;

/**
 * Given an int array length 2, return true if it contains a 2 or a 3.
 */
public class Has23 {

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }
}
