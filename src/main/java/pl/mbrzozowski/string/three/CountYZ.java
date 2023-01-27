package pl.mbrzozowski.string.three;

/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
 * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */
public class CountYZ {

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {
                    if ((str.charAt(j) == 'y' || str.charAt(j) == 'z' || str.charAt(j) == 'Y' || str.charAt(j) == 'Z')) {
                        if (j == str.length() - 1 || !Character.isLetter(str.charAt(j + 1))) {
                            count++;
                            i = j;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
