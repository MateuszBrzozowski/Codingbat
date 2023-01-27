package pl.mbrzozowski.recursion;

public class Recursion2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start > nums.length - 1) {
            return target == 0;
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start > nums.length - 1) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start > nums.length - 1) {
            return target == 0;
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        return groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start > nums.length - 1) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            if (start < nums.length - 1 && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum5(start + 1, nums, target);
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start > nums.length - 1) {
            return target == 0;
        }
        int i = start;
        int sum = 0;
        while (i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }
        if (groupSumClump(i, nums, target - sum)) {
            return true;
        }
        return groupSumClump(i, nums, target);
    }

    public boolean splitArray(int[] nums) {
        return splitArray(0, nums, 0, 0);
    }

    public boolean splitArray(int start, int[] nums, int sumA, int sumB) {
        if (start > nums.length - 1) {
            return sumA == sumB;
        }
        if (splitArray(start + 1, nums, sumA + nums[start], sumB)) {
            return true;
        }
        return splitArray(start + 1, nums, sumA, sumB + nums[start]);
    }

    public boolean splitOdd10(int[] nums) {
        return splitOdd10(0, nums, 0, 0);
    }

    public boolean splitOdd10(int start, int[] nums, int multiple, int odd) {
        if (start > nums.length - 1) {
            return multiple % 10 == 0 && odd % 2 != 0;
        }
        if (splitOdd10(start + 1, nums, multiple + nums[start], odd)) {
            return true;
        }
        return splitOdd10(start + 1, nums, multiple, nums[start] + odd);
    }

    public boolean split53(int[] nums) {
        return split53(0, nums, 0, 0);
    }

    private boolean split53(int start, int[] nums, int mult5, int mult3) {
        if (start > nums.length - 1) {
            return mult5 == mult3;
        }
        if (nums[start] % 5 == 0) {
            return split53(start + 1, nums, mult5 + nums[start], mult3);
        }
        if (nums[start] % 3 == 0) {
            return split53(start + 1, nums, mult5, mult3 + nums[start]);
        }
        if (split53(start + 1, nums, mult5 + nums[start], mult3)) {
            return true;
        }
        return split53(start + 1, nums, mult5, mult3 + nums[start]);
    }

}
