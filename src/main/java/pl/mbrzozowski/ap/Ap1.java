package pl.mbrzozowski.ap;

import java.util.ArrayList;
import java.util.List;

public class Ap1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int firstHalf = average(scores, 0, scores.length / 2 - 1);
        int secondHalf = average(scores, scores.length / 2, scores.length - 1);
        return Math.max(firstHalf, secondHalf);
    }

    private int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int digit = n;
        while (digit > 0) {
            int rightNumber = digit % 10;
            if (rightNumber == 0) {
                return false;
            }
            if (n % rightNumber != 0) {
                return false;
            }
            digit = digit / 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length && j < result.length; i++) {
            if (nums[i] % 2 == 0) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length && j < result.length; i++) {
            if (isEndy(nums[i])) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    private boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(key[i])) {
                score += 4;
            } else if (!answers[i].equals("?")) {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        String[] result = new String[0];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                String[] newResult = new String[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    newResult[j] = result[j];
                }
                newResult[newResult.length - 1] = words[i];
                result = newResult;
            }
        }
        return result;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return maxScoresSpecial(a) + maxScoresSpecial(b);
    }

    private int maxScoresSpecial(int[] source) {
        int max = 0;
        for (int j : source) {
            if (j % 10 == 0) {
                max = Math.max(j, max);
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i + 1] > heights[i]) {
                sum += (2 * Math.abs(heights[i] - heights[i + 1]));
            } else {
                sum += Math.abs(heights[i] - heights[i + 1]);
            }
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int countBigSteps = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                countBigSteps++;
            }
        }
        return countBigSteps;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) == 0) {
            if (aId == bId) {
                return 0;
            } else if (aId > bId) {
                return 1;
            } else {
                return -1;
            }
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < result.length; i++) {
            if (a[indexA].compareTo(b[indexB]) < 0) {
                result[i] = a[indexA];
                indexA++;
            } else if (a[indexA].compareTo(b[indexB]) > 0) {
                result[i] = b[indexB];
                indexB++;
            } else {
                result[i] = a[indexA];
                indexA++;
                indexB++;
            }
        }
        return result;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    count++;
                    break;
                }
            }
            for (int j = i; j < a.length; j++) {
                if (j < a.length - 1 && !a[j].equals(a[j + 1])) {
                    i = j;
                    break;
                }
            }
        }
        return count;
    }
}
