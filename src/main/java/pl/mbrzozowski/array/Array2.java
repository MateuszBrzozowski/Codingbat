package pl.mbrzozowski.array;

import java.util.Arrays;

public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    public int centeredAverage(int[] nums) {
        //You may assume that the array is length 3 or more.
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        boolean isMinTaken = false;
        boolean isMaxTaken = false;
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num == min && !isMinTaken) {
                isMinTaken = true;
            } else if (num == max && !isMaxTaken) {
                isMaxTaken = true;
            } else {
                sum += num;
                count++;
            }
        }
        return sum / count;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;
        for (int num : nums) {
            if (num == 6) {
                ignore = true;
            }
            if (!ignore) {
                sum += num;
            }
            if (ignore && num == 7) {
                ignore = false;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int num : nums) {
            if (num == 1) {
                count1++;
            }
            if (num == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }

    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

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

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean is2NextTo2 = false;
        boolean is4NextTo4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                is2NextTo2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                is4NextTo4 = true;
            }
        }
        if (!is2NextTo2 && !is4NextTo4) {
            return false;
        } else if (is2NextTo2 && !is4NextTo4) {
            return true;
        } else {
            return !is2NextTo2;
        }
    }
}
