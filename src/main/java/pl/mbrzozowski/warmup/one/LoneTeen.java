package pl.mbrzozowski.warmup.one;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 */
public class LoneTeen {

    public boolean loneTeen(int a, int b) {
        final int MIN = 13;
        final int MAX = 19;
        if ((a >= MIN && a <= MAX) && (b < MIN || b > MAX)) {
            return true;
        } else return (a < MIN || a > MAX) && (b >= MIN && b <= MAX);
    }
}
