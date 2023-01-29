package pl.mbrzozowski.map.two;

import java.util.HashMap;
import java.util.Map;

/**
 * Loop over the given array of strings to build a result string like this: when a string appears
 * the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty
 * string if no string appears a 2nd time.
 */
public class WordAppend {

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
}
