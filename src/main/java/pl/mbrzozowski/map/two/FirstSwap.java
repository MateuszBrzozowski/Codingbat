package pl.mbrzozowski.map.two;

import java.util.HashMap;
import java.util.Map;

/**
 * We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 * Loop over and then return the given array of non-empty strings as follows: if a string
 * matches an earlier string in the array, swap the 2 strings in the array. A particular first
 * char can only cause 1 swap, so once a char has caused a swap, its later swaps are
 * disabled. Using a map, this can be solved making just one pass over the array. More
 * difficult than it looks.
 */
public class FirstSwap {

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
}
