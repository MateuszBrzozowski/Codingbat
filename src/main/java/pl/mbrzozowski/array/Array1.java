package pl.mbrzozowski.array;

import java.util.Arrays;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int buffer = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = buffer;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[result.length - 1 - i] = nums[i];
        }
        return result;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, max);
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        return !has23(nums);
    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        Arrays.fill(result, 0);
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

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

    public int[] fix23(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i - 1] == 2) {
                nums[i] = 0;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        for (int i : a) {
            sumA += i;
        }
        int sumB = 0;
        for (int i : b) {
            sumB += i;
        }
        if (sumA >= sumB) {
            return a;
        } else {
            return b;
        }
    }

    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        int j = a.length;
        for (int i = 0; i < b.length; i++) {
            result[j] = b[i];
            j++;
        }
        return result;
    }

    public int[] swapEnds(int[] nums) {
        int buffer = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = buffer;
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    public int maxTriple(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        max = Math.max(max, nums[nums.length / 2]);
        return max;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length > 2) {
            return new int[]{nums[0], nums[1]};
        } else {
            return nums;
        }
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length > 1) {
            return (nums[0] == 1 && nums[1] == 3) || (nums.length > 2 && nums[1] == 1 && nums[2] == 3) ||
                    (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
        } else {
            return false;
        }
    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        int i;

        i = 0;
        while (count < 2 && i < a.length) {
            result[count] = a[i];
            count++;
            i++;
        }

        i = 0;
        while (count < 2 && i < b.length) {
            result[count] = b[i];
            count++;
            i++;
        }

        return result;
    }

    public int[] front11(int[] a, int[] b) {
        int[] result = new int[0];
        if (a.length > 0) {
            result = new int[1];
            result[0] = a[0];
        }
        if (b.length > 0) {
            int[] resultB = Arrays.copyOf(result, result.length);
            result = new int[result.length + 1];
            for (int i = 0; i < resultB.length; i++) {
                result[i] = resultB[i];
            }
            result[result.length - 1] = b[0];
        }
        return result;
    }


}
