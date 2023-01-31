package pl.mbrzozowski.array.two;

/**
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */
public class No14 {

    public boolean no14(int[] nums) {
        boolean no1 = false;
        boolean no4 = false;
        for (int num : nums) {
            if (num == 1) {
                no1 = true;
            } else if (num == 4) {
                no4 = true;
            }
        }
        return !no1 || !no4;
    }
}
