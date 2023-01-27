package pl.mbrzozowski.warmup.one;

/**
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */
public class Diff21 {

    public int diff21(int n) {
        if (21 - n < 0) {
            return ((21 - n) * 2) * -1;
        }
        return 21 - n;
    }
}
