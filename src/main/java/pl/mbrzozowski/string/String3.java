package pl.mbrzozowski.string;

public class String3 {

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {
                    if ((str.charAt(j) == 'y' || str.charAt(j) == 'z' || str.charAt(j) == 'Y' || str.charAt(j) == 'Z')) {
                        if (j == str.length() - 1 || !Character.isLetter(str.charAt(j + 1))) {
                            count++;
                            i = j;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        while (true) {
            if (base.toLowerCase().contains(remove.toLowerCase())) {
                int indexOf = base.toLowerCase().indexOf(remove.toLowerCase());
                base = base.substring(0, indexOf) + base.substring(indexOf + remove.length());
            } else {
                break;
            }
        }
        return base;
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("is")) {
                countIs++;
            }
            if (str.substring(i).startsWith("not")) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        if (str.length() == 1) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i == 0 && str.charAt(i + 1) != 'g') {
                    return false;
                } else if (i == str.length() - 1 && str.charAt(i - 1) != 'g') {
                    return false;
                } else if (i != 0 && i != str.length() - 1 && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                    return false;
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i + 1) == str.charAt(i) && str.charAt(i + 2) == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        int mid = string.length() / 2;
        int indexTemp = mid;
        if (string.length() % 2 != 0) {
            mid++;
        }
        while (indexTemp > 0) {
            if (string.substring(0, indexTemp).equals(string.substring(mid))) {
                return string.substring(mid);
            }
            indexTemp--;
            mid++;
        }
        return "";
    }

    public String mirrorEnds(String string) {
        String result = "";
        int indexBack = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(indexBack)) {
                result = string.substring(0, i + 1);
                indexBack--;
            } else {
                break;
            }
        }
        return result;
    }

    public int maxBlock(String str) {
        int maxSum = 0;
        for (int i = 0; i < str.length(); i++) {
            int sumTemp = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    sumTemp++;
                } else {
                    break;
                }
            }
            if (maxSum < sumTemp) {
                maxSum = sumTemp;
            }
        }
        return maxSum;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int indexLast = i + 1;
                int indexStart = i;
                for (int j = i + 1; j < str.length(); j++) {
                    if (!Character.isDigit(str.charAt(j))) {
                        indexLast = j;
                        i = j - 1;
                        break;
                    } else if (j == str.length() - 1) {
                        indexLast = str.length();
                        i = str.length();
                    }
                }
                sum += Integer.parseInt(str.substring(indexStart, indexLast));
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i).startsWith("is")) {
                boolean isSolo = true;
                if (i > 0 && Character.isLetter(str.charAt(i - 1))) {
                    isSolo = false;
                }
                if (i < str.length() - 2 && Character.isLetter(str.charAt(i + 2))) {
                    isSolo = false;
                }
                if (isSolo) {
                    str = str.substring(0, i) + "is not" + str.substring(i + 2);
                }
            }
        }
        return str;
    }

}
