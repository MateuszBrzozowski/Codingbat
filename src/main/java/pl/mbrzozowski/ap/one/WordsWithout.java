package pl.mbrzozowski.ap.one;

/**
 * Given an array of strings, return a new array without the strings that are equal to the
 * target string. One approach is to count the occurrences of the target string, make a new
 * array of the correct length, and then copy over the correct strings.
 */
public class WordsWithout {

    public String[] wordsWithout(String[] words, String target) {
        String[] result = new String[0];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                String[] newResult = new String[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    newResult[j] = result[j];
                }
                newResult[newResult.length - 1] = words[i];
                result = newResult;
            }
        }
        return result;
    }
}
