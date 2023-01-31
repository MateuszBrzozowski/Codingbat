package pl.mbrzozowski.array.two;

/**
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and
 * no 3's are next to each other.
 */
public class HaveThree {

    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                count++;
            }
            if (i == nums.length - 2 && nums[i + 1] == 3) {
                count++;
            }
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return false;
            }
        }
        return count == 3;
    }
}
