package pl.mbrzozowski.ap.one;

/**
 * We'll say that a positive int divides itself if every digit in the number divides into the
 * number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128
 * evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit
 * divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
 */
public class DividesSelf {

    public boolean dividesSelf(int n) {
        int digit = n;
        while (digit > 0) {
            int rightNumber = digit % 10;
            if (rightNumber == 0) {
                return false;
            }
            if (n % rightNumber != 0) {
                return false;
            }
            digit = digit / 10;
        }
        return true;
    }
}
