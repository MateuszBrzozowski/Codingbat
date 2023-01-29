package pl.mbrzozowski.map.two;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, return a Map<String, String> with a key for every
 * different first character seen, with the value of all the strings starting with that character
 * appended together in the order they appear in the array.
 */
public class FirstChar {

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
}
