package pl.mbrzozowski.array;

public class Array3 {

    public int maxSpan(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            while (nums[i] != nums[j]) {
                j--;
            }
            int span = j - i + 1;
            if (span > max) {
                max = span;
            }
        }
        return max;
    }

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = nums.length - 1; j > 0; j--) {
                    if (nums[j] == 5 && nums[j - 1] != 4) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    if (j == 1) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j - 1];
                        nums[j - 1] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j <= i; j++) {
                sumLeft += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                sumRight += nums[j];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
//        for (int i = 0; i < inner.length; i++) {
//            boolean contain = false;
//            for (int j = 0; j < outer.length; j++) {
//                if (outer[j] == inner[i]) {
//                    contain = true;
//                }
//            }
//            if (!contain) {
//                return false;
//            }
//        }
//        return  true;

        int j = 0;
        for (int i = 0; i < outer.length && j < inner.length; i++) {
            int temp = inner[j];
            if (outer[i] == temp) {
                j++;
                i--;
            }
            if (j == inner.length) {
                return true;
            }
        }
        return inner.length == 0;
    }

    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        int howMuchNumbersFill = n;
        for (int i = result.length - 1; i >= 0; i -= n) {
            int number = 1;
            for (int j = i; howMuchNumbersFill >= number; j--) {
                result[j] = number;
                number++;
            }
            howMuchNumbersFill--;
        }
        return result;
    }

    public int[] seriesUp(int n) {
        int[] result = new int[(n * (n + 1)) / 2];
        int numberToFill = 1;
        int maxNumberNow = 1;
        int index = 0;
        while (maxNumberNow <= n) {
            result[index] = numberToFill;
            if (numberToFill == maxNumberNow) {
                numberToFill = 1;
                maxNumberNow++;
            } else {
                numberToFill++;
            }
            index++;
        }
        return result;
    }

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
