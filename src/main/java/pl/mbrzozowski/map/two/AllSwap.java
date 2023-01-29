package pl.mbrzozowski.map.two;

import java.util.HashMap;
import java.util.Map;

/**
 * We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 * Loop over and then return the given array of non-empty strings as follows: if a string
 * matches an earlier string in the array, swap the 2 strings in the array. When a position in
 * the array has been swapped, it no longer matches anything. Using a map, this can be
 * solved making just one pass over the array. More difficult than it looks.
 */
public class AllSwap {

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
}
