package pl.mbrzozowski.warmup.one;

/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 */
public class SumDouble {

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        return (a + b) * 2;
    }
}
