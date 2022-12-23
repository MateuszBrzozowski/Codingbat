package pl.mbrzozowski.string;

public class StringOne {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String result = "";
        if (str.length() >= 2) {
            result = str.substring(str.length() - 2);
        } else {
            result = str;
        }
        return result + result + result;
    }

    public String firstTwo(String str) {
        String result = "";
        if (str.length() >= 2) {
            result = str.substring(0, 2);
        } else {
            result = str;
        }
        return result;
    }

    public String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        String shortString = "";
        String longString = "";
        if (a.length() < b.length()) {
            shortString = a;
            longString = b;
        } else {
            shortString = b;
            longString = a;
        }
        return shortString + longString + shortString;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2) + str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String right2(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        } else {
            return str;
        }
    }

    public String theEnd(String str, boolean front) {
        if (front && str.length() > 1) {
            return String.valueOf(str.charAt(0));
        } else if (!front && str.length() > 1) {
            return String.valueOf(str.charAt(str.length() - 1));
        } else {
            return str;
        }
    }

    public String withouEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    public String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index <= 0 || index > str.length() - 2) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        if (str.length() > 3) {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
        } else {
            return str;
        }
    }

    public boolean hasBad(String str) {
        if (str.length() > 3 && (str.startsWith("bad") || str.substring(1, 4).equals("bad"))) {
            return true;
        } else if (str.length() == 3) {
            return str.contains("bad");
        } else {
            return false;
        }
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    public String lastChars(String a, String b) {
        String result = "";
        if (a.length() > 0) {
            result += a.charAt(0);
        } else {
            result += "@";
        }
        if (b.length() > 0) {
            result += b.substring(b.length() - 1);
        } else {
            result += "@";
        }
        return result;
    }

    public String conCat(String a, String b) {
        if (b.length() > 0 && a.endsWith(b.substring(0, 1))) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        } else {
            return str;
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.startsWith(str.substring(str.length() - 2));
    }

    public String minCat(String a, String b) {
        if (a.length() <= b.length()) {
            return a + b.substring(b.length() - a.length());
        } else {
            return a.substring(a.length() - b.length()) + b;
        }
    }

    public String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else {
            return str + str + str;
        }
    }

    public String without2(String str) {
        if (str.length() >= 2 && str.startsWith(str.substring(str.length() - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public String deFront(String str) {
        if (str.startsWith("ab")) {
            return str;
        } else if (str.length() >= 2 && str.charAt(1) == 'b') {
            return str.substring(1);
        } else if (str.length() >= 2 && str.startsWith("a")) {
            return str.charAt(0) + str.substring(2);
        } else if (str.length() >= 2) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public String startWord(String str, String word) {
        if (str.startsWith(word)) {
            return word;
        } else if (str.length() < word.length()) {
            return "";
        } else if (str.substring(1, word.length()).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        if (str.length() >= 2 && str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2);
        }
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        return str;
    }

}
