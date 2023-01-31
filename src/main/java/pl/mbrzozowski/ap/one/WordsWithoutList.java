package pl.mbrzozowski.ap.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the
 * given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
 */
public class WordsWithoutList {

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                result.add(words[i]);
            }
        }
        return result;
    }
}
