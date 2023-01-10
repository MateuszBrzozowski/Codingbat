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

    public String repeatEnd(String str, int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str.substring(str.length() - n));
        }
        return result.toString();
    }

    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str, 0, (n - i));
        }
        return result.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i != count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }

    public boolean prefixAgain(String str, int n) {
        char charAtIndex = str.charAt(n - 1);
        for (int i = 0; i < str.length(); i++) {
            if (i != n - 1 && str.charAt(i) == charAtIndex) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        String xyzMidOne = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        if (str.length() % 2 == 0) {
            if (xyzMidOne.equals("xyz")
                    || str.substring(str.length() / 2 - 2, str.length() / 2 + 1).equals("xyz")) {
                return true;
            }
        }
        return xyzMidOne.equals("xyz");
    }

    public String getSandwich(String str) {
        final String bread = "bread";
        if (str.length() <= bread.length() * 2) {
            return "";
        }
        int firstIndexOf = str.indexOf(bread);
        int lastIndexOf = str.lastIndexOf(bread);
        if (firstIndexOf != lastIndexOf) {
            return str.substring(firstIndexOf + 5, lastIndexOf);
        }
        return "";
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && (str.charAt(i - 1) != str.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            if (str.length() >= i + 3) {
                result.append(str, i + 1, i + 3).append(str.charAt(i));
            } else {
                result.append(str.substring(i));
            }
        }
        return result.toString();
    }

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= i + 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append(str.charAt(i)).append(str.charAt(i + 2));
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                i++;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                i += 2;
            } else {
                if (i == 0 || str.charAt(i - 1) != '*') {
                    result.append(str.charAt(i));
                }
            }
        }
        return result.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                result.append(word);
                i += word.length() - 1;
            } else {
                result.append("+");
            }
        }
        return result.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.startsWith(word, i)) {
                if (i != 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) {
                    result.append(str.charAt(i + word.length()));
                }
            }
        }
        return result.toString();
    }


}
