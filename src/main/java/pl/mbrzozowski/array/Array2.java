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

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums2[i] != nums1[i] && nums2[i] >= nums1[i] - 2 && nums2[i] <= nums1[i] + 2) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            } else if (i < nums.length - 2 && (nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7))) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) ||
                    (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)) {
                return true;
            }
        }
        return false;
    }

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

    public boolean twoTwo(int[] nums) {
        boolean hasFront2 = false;
        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (!hasFront2 && nums[i + 1] != 2) {
                    return false;
                }
                hasFront2 = true;
            } else {
                if (i == nums.length - 2 && nums[i + 1] == 2) {
                    return false;
                }
                hasFront2 = false;
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i + 1] + 1) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start;
            start++;
        }
        return result;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public int[] tenRun(int[] nums) {
        int buffer = 0;
        boolean wasMultipleOf10 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                buffer = nums[i];
                wasMultipleOf10 = true;
            } else if (wasMultipleOf10) {
                nums[i] = buffer;
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int indexFirstFourNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                indexFirstFourNumber = i;
                break;
            }
        }
        int[] result = new int[indexFirstFourNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    public int[] post4(int[] nums) {
        int indexOfLastFourNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                indexOfLastFourNumber = i;
            }
        }
        int[] result = new int[nums.length - indexOfLastFourNumber - 1];
        indexOfLastFourNumber++;
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[indexOfLastFourNumber++];
        }
        return result;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                int max = Math.max(nums[i - 1], nums[i + 1]);
                if (max > nums[i]) {
                    nums[i] = max;
                }
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        int buffer = nums[i];
                        nums[i] = nums[j];
                        nums[j] = buffer;
                    }
                }
            }
        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[nums.length - 1] = 0;
                if (i < nums.length - 1 && nums[i] == 10) {
                    i--;
                }
            }
        }
        return nums;
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int maxOddNumber = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxOddNumber) {
                        maxOddNumber = nums[j];
                    }
                }
                nums[i] = maxOddNumber;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        int buffer = nums[i];
                        nums[i] = nums[j];
                        nums[j] = buffer;
                    }
                }
            }
        }
        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = 0; i < result.length; i++) {
            if (start % 3 == 0 && start % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                result[i] = "Fizz";
            } else if (start % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(start);
            }
            start++;
        }
        return result;
    }

}
