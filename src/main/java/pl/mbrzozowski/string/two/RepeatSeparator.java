package pl.mbrzozowski.string.two;

/**
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
 * separated by the separator string.
 */
public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i != count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }
}
