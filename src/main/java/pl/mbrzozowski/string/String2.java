package pl.mbrzozowski.string;

public class String2 {

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }
        return result.toString();
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                countCat++;
            }
            if (str.startsWith("dog", i)) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.substring(i, i + 4).endsWith("e")) {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        return b.toLowerCase().endsWith(a.toLowerCase()) || a.toLowerCase().endsWith(b.toLowerCase());
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) != '.' && str.substring(i, i + 4).endsWith("xyz")) {
                return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("b", i) && str.substring(i, i + 3).endsWith("b")) {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        return !str.contains("x") || (str.lastIndexOf("x") < str.lastIndexOf("y"));
    }

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }

}
