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

}
