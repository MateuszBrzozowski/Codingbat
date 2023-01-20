package pl.mbrzozowski.recursion;

public class Recursion1 {

    public int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        }
        return 2 + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
        if (rows <= 1) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return sumDigits(n % 10) + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 7) {
            return 1;
        } else if (n < 10) {
            return 0;
        }
        return count7(n % 10) + count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }

    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(1));
        }
        return countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        }
        return str.charAt(0) + changeXY(str.substring(1));
    }

    public String changePi(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("pix")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

    public String noX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("x")) {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        }
        return nums[index] * 10 == nums[index + 1] || array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return String.valueOf(str.charAt(0));
        }
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.startsWith("x")) {
            return endX(str.substring(1)) + "x";
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    public int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        } else if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }

    public String parenBit(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;
        } else if (str.startsWith("(")) {
            return parenBit(str.substring(0, str.length() - 1));
        } else if (str.endsWith(")")) {
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(1, str.length() - 1));
    }

    public boolean nestParen(String str) {
        if (str.length() < 2 && !str.startsWith("(") && !str.startsWith(")")) {
            return true;
        }
        if (str.startsWith("(") && str.endsWith(")")) {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n) {
        if (str.length() < sub.length()) {
            return false;
        }
        if (n < 1 || (str.startsWith(sub) && n <= 1)) {
            return true;
        } else if (str.startsWith(sub) && n > 1) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub) {
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        } else if (str.startsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else if (str.length() < 2) {
            return 0;
        }
        return strDist(str.substring(1, str.length() - 1), sub);
    }

}