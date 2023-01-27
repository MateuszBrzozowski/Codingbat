package pl.mbrzozowski.string.three;

/**
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 * A number is a series of 1 or more digit chars in a row.
 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 */
public class SumNumbers {

    public int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int indexLast = i + 1;
                int indexStart = i;
                for (int j = i + 1; j < str.length(); j++) {
                    if (!Character.isDigit(str.charAt(j))) {
                        indexLast = j;
                        i = j - 1;
                        break;
                    } else if (j == str.length() - 1) {
                        indexLast = str.length();
                        i = str.length();
                    }
                }
                sum += Integer.parseInt(str.substring(indexStart, indexLast));
            }
        }
        return sum;
    }
}
