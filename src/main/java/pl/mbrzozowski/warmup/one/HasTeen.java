package pl.mbrzozowski.warmup.one;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 */
public class HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        final int MIN = 13;
        final int MAX = 19;
        return (a >= MIN && a <= MAX) || (b >= MIN && b <= MAX) || (c >= MIN && c <= MAX);
    }
}
