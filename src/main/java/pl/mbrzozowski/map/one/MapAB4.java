package pl.mbrzozowski.map.one;

import java.util.Map;

/**
 * Modify and return the given map as follows: if the keys "a" and "b" have values that have
 * different lengths, then set "c" to have the longer value. If the values exist and have the
 * same length, change them both to the empty string in the map.
 */
public class MapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.length() > b.length()) {
                map.put("c", map.get("a"));
            } else if (b.length() > a.length()) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
