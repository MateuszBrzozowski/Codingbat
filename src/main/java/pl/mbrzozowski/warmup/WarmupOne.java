package pl.mbrzozowski.warmup;

public class WarmupOne {

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        return (a + b) * 2;
    }

    public int diff21(int n) {
        if (21 - n < 0) {
            return ((21 - n) * 2) * -1;
        }
        return 21 - n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour >= 0 && hour <= 23) {
            return (hour < 7 || hour > 20) && talking;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }

    public boolean nearHundred(int n) {
        return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a >= 0 && b < 0) || (a < 0 && b >= 0);
    }

    public String notString(String str) {
        if (str.length() >= 3) {
            String substring = str.substring(0, 3);
            if (!substring.equalsIgnoreCase("not")) {
                return "not " + str;
            }
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        n = Math.abs(n);
        if (n >= str.length()) {
            return null;
        }
        if (!str.isEmpty()) {
            String substringFirst = str.substring(0, n);
            String substringSecond = str.substring(n + 1);
            return substringFirst + substringSecond;
        }
        return null;
    }

    public String frontBack(String str) {
        if (!str.isEmpty()) {
            char charFirst = str.charAt(0);
            char charLast = str.charAt(str.length() - 1);
            if (str.length() > 1) {
                return charLast + str.substring(1, str.length() - 1) + charFirst;
            } else return str;
        }
        return "";
    }

    public String front3(String str) {
        if (!str.isEmpty()) {
            if (str.length() >= 3) {
                String front = str.substring(0, 3);
                return front + front + front;
            }
            return str.substring(0) + str.substring(0) + str.substring(0);
        }
        return "";
    }

    public String backAround(String str) {
        if (str.length() >= 1) {
            char charLast = str.charAt(str.length() - 1);
            return charLast + str + charLast;
        }
        return "";
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }

    public String front22(String str) {
        if (str.length() >= 2) {
            String front = str.substring(0, 2);
            return front + str + front;
        } else if (str.length() == 1) {
            String front = str.substring(0, 1);
            return front + str + front;
        }
        return "";
    }


}
