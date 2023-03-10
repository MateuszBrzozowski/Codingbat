package pl.mbrzozowski.array.two;

/**
 * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider
 * the corresponding element in nums2 (at the same index). Return the count of the number
 * of times that the two elements differ by 2 or less, but are not equal.
 */
public class MatchUp {

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums2[i] != nums1[i] && nums2[i] >= nums1[i] - 2 && nums2[i] <= nums1[i] + 2) {
                count++;
            }
        }
        return count;
    }
}
