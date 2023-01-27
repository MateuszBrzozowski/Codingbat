package pl.mbrzozowski.string.two;

/**
 * Given a string and a non-empty word string, return a version of the original
 * String where all chars have been replaced by pluses ("+"), except for appearances
 * of the word string which are preserved unchanged.
 */
public class PlusOut {

    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                result.append(word);
                i += word.length() - 1;
            } else {
                result.append("+");
            }
        }
        return result.toString();
    }
}
