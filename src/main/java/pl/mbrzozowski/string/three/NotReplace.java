package pl.mbrzozowski.string.three;

/**
 * Given a string, return a string where every appearance of the lowercase word "is"
 * has been replaced with "is not". The word "is" should not be immediately preceeded
 * or followed by a letter -- so for example the "is" in "this" does not count.
 * (Note: Character.isLetter(char) tests if a char is a letter.)
 */
public class NotReplace {

    public String notReplace(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i).startsWith("is")) {
                boolean isSolo = true;
                if (i > 0 && Character.isLetter(str.charAt(i - 1))) {
                    isSolo = false;
                }
                if (i < str.length() - 2 && Character.isLetter(str.charAt(i + 2))) {
                    isSolo = false;
                }
                if (isSolo) {
                    str = str.substring(0, i) + "is not" + str.substring(i + 2);
                }
            }
        }
        return str;
    }
}
