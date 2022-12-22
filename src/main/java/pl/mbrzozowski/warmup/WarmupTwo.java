package pl.mbrzozowski.warmup;

public class WarmupTwo {

    public String stringTimes(String str, int n) {
        String pattern = str;
        if (n == 0) {
            return "";
        }
        for (int i = 0; i < n - 1; i++) {
            str += pattern;
        }
        return str;
    }

    public String frontTimes(String str, int n) {
        String substring = "";
        StringBuilder result = new StringBuilder();
        if (str.length() >= 3) {
            substring = str.substring(0, 3);
        } else {
            substring = str;
        }
        for (int i = 0; i < n; i++) {
            result.append(substring);
        }
        return result.toString();
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 2);
            if (substring.equals("xx")) {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int indexSolo = str.indexOf('x');
        int indexDouble = str.indexOf("xx");
        return (indexSolo == indexDouble) && indexSolo != -1;
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }

    public int last2(String str) {
        if (str.length() <= 2) {
            return 0;
        }
        int count = 0;
        String suffix = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(suffix)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                return true;
            }
            if (i == 3) {
                return false;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < minLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) != 'x') || i == 0 || i == str.length() - 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i));
            if (i != str.length() - 1) {
                result.append(str.charAt(i + 1));
            }
        }
        return result.toString();
    }

    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (stringYakCheck(str.substring(i))) {
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    private boolean stringYakCheck(String substring) {
        if (substring.length() >= 3) {
            return substring.charAt(0) == 'y' && substring.charAt(2) == 'k';
        } else {
            return false;
        }
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int baseInt = nums[i];
            if (nums[i + 1] == baseInt + 5 && Math.abs(nums[i + 2] - (baseInt - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }


}
