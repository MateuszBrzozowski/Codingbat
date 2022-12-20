package pl.mbrzozowski.map;

import java.util.HashMap;
import java.util.Map;

public class MapTwo {

    public MapTwo() {
//        allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"});
        String[] strings = firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"});
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public String[] firstSwap(String[] strings) {
        Map<Integer, Integer> swapped = new HashMap<>();
        Map<Integer, Integer> disableElements = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!swapped.containsKey(i) && !disableElements.containsKey(i)) {
                String string = strings[i];
                String firstChar = String.valueOf(string.charAt(0));
                for (int j = i + 1; j < strings.length; j++) {
                    String firstCharSecondString = String.valueOf(strings[j].charAt(0));
                    if (firstChar.equals(firstCharSecondString) && !swapped.containsKey(j) && !disableElements.containsKey(j)) {
                        swapped.put(j, i);
                        String buffer = strings[j];
                        strings[j] = strings[i];
                        strings[i] = buffer;
                        break;
                    }
                }
                for (int j = i + 1; j < strings.length; j++) {
                    String firstCharSecondString = String.valueOf(strings[j].charAt(0));
                    if (firstChar.equals(firstCharSecondString)) {
                        disableElements.put(j, i);
                    }

                }
            }
        }
        return strings;
    }

    public String[] allSwap(String[] strings) {
        Map<Integer, Integer> swapped = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!swapped.containsKey(i)) {
                String string = strings[i];
                String firstChar = String.valueOf(string.charAt(0));
                for (int j = i + 1; j < strings.length; j++) {
                    String firstCharSecondString = String.valueOf(strings[j].charAt(0));
                    if (firstChar.equals(firstCharSecondString) && !swapped.containsKey(j)) {
                        swapped.put(j, i);
                        String buffer = strings[j];
                        strings[j] = strings[i];
                        strings[i] = buffer;
                        break;
                    }
                }
            }
        }
        return strings;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else {
                map.put(string, false);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            int i = 0;
            if (map.containsKey(string)) {
                i = map.get(string) + 1;
                map.put(string, i);
                if (i % 2 == 0) {
                    result = result + string;
                }
            } else {
                map.put(string, i + 1);
            }

        }
        return result;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String firstChar = String.valueOf(string.charAt(0));
            if (!map.containsKey(firstChar)) {
                StringBuilder stringValue = new StringBuilder();
                for (String s : strings) {
                    String checkFirstChar = String.valueOf(s.charAt(0));
                    if (checkFirstChar.equals(firstChar)) {
                        stringValue.append(s);
                    }
                }
                map.put(String.valueOf(string.charAt(0)), stringValue.toString());
            }
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }


    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            map.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length() - 1)));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, string.length());
        }
        return map;
    }


    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, 0);
        }
        return map;
    }
}
