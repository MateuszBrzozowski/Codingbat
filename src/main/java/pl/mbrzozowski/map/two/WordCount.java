package pl.mbrzozowski.map.two;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
 * with a key for each different string, with the value the number of times that string appears
 * in the array.
 */
public class WordCount {

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
}
