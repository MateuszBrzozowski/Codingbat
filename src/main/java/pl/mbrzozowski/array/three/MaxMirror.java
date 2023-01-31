package pl.mbrzozowski.array.three;

/**
 * We'll say that a "mirror" section in an array is a group of contiguous elements such that
 * somewhere in the array, the same group appears in reverse order. For example, the largest
 * mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of
 * the largest mirror section found in the given array.
 */
public class MaxMirror {

    public int maxMirror(int[] nums) {
        for (int i = nums.length; i > 0; i--) {
            for (int j = 0; j <= nums.length - i; j++) {
                int[] base = getArrayForMaxMirror(nums, j, i);
                for (int k = 0; k <= nums.length - i; k++) {
                    int[] checkingTable = getArrayForMaxMirror(nums, k, i);
                    if (isTableMirror(base, checkingTable)) {
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    private boolean isTableMirror(int[] base, int[] checkingTable) {
        if (base.length != checkingTable.length) {
            throw new IllegalArgumentException("Tablice nie są równe");
        }
        int indexCheckingTable = checkingTable.length - 1;
        for (int i = 0; i < base.length; i++) {
            if (base[i] != checkingTable[indexCheckingTable]) {
                return false;
            }
            indexCheckingTable--;
        }
        return true;
    }

    private int[] getArrayForMaxMirror(int[] nums, int offset, int length) {
        int[] result = new int[length];
        if (offset + length > nums.length) {
            throw new IllegalArgumentException("Nieprawidłowa długość i offset. Nie utworzę tablicy");
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[offset];
            offset++;
        }
        return result;
    }
}
