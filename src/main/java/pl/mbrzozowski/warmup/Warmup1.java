package pl.mbrzozowski.warmup;

import java.util.ArrayList;

public class Warmup1 {

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

    public boolean hasTeen(int a, int b, int c) {
        final int MIN = 13;
        final int MAX = 19;
        return (a >= MIN && a <= MAX) || (b >= MIN && b <= MAX) || (c >= MIN && c <= MAX);
    }

    public boolean loneTeen(int a, int b) {
        final int MIN = 13;
        final int MAX = 19;
        if ((a >= MIN && a <= MAX) && (b < MIN || b > MAX)) {
            return true;
        } else return (a < MIN || a > MAX) && (b >= MIN && b <= MAX);
    }

    public String delDel(String str) {
        if (str.indexOf("del", 1) == 1) {
            str = str.replaceFirst("del", "");
        }
        return str;
    }

    public boolean mixStart(String str) {
        return str.indexOf("ix", 1) == 1;
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1) {
            if (str.charAt(0) == 'o') {
                result += "o";
            }
        }
        if (str.length() >= 2) {
            if (str.charAt(1) == 'z') {
                result += "z";
            }
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();  //Coding bat nie przyjmuje List.of
        list.add(a);
        list.add(b);
        list.add(c);
        for (Integer integer : list) {
            if (integer >= max) {
                max = integer;
            }
        }
        return max;
    }

    public int close10(int a, int b) {
        int aDiff = close10CheckInt(a);
        int bDiff = close10CheckInt(b);
        if (aDiff < bDiff) {
            return a;
        } else if (bDiff < aDiff) {
            return b;
        } else {
            return 0;
        }
    }

    private int close10CheckInt(int a) {
        if (a < 0) {
            a = Math.abs(a) + 10;
        } else {
            a = a - 10;
            a = Math.abs(a);
        }
        return a;
    }

    public boolean in3050(int a, int b) {
        return in3050InRange(a, b, 30, 40) || in3050InRange(a, b, 40, 50);
    }

    private boolean in3050InRange(int a, int b, int rangeMin, int rangeMax) {
        return (a >= rangeMin && a <= rangeMax) && (b >= rangeMin && b <= rangeMax);
    }

    public int max1020(int a, int b) {
        if (max1020IsInRange(a) && max1020IsInRange(b)) {
            return Math.max(a, b);
        } else if (max1020IsInRange(a) && !max1020IsInRange(b)) {
            return a;
        } else if (max1020IsInRange(b) && !max1020IsInRange(a)) {
            return b;
        } else {
            return 0;
        }
    }

    private boolean max1020IsInRange(int a) {
        return a >= 10 && a <= 20;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        return lastDigit(a) == lastDigit(b);
    }

    private int lastDigit(int a) {
        return a % 10;
    }

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String stringEnd = str.substring(str.length() - 3).toUpperCase();
            String result = str.substring(0, str.length() - 3);
            return result + stringEnd;
        }
    }

    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }


}
