package pl.mbrzozowski.warmup.one;

/**
 * Given three int values, a b c, return the largest.
 */
public class IntMax {

    public int intMax(int a, int b, int c) {
        int maxAB = Math.max(a, b);
        return Math.max(maxAB, c);
    }
}
