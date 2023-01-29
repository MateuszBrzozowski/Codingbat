package pl.mbrzozowski.map.two;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, create and return a Map<String, String> as follows:
 * for each string add its first character as a key with its last character as the value.
 */
public class Pairs {

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            map.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length() - 1)));
        }
        return map;
    }
}
