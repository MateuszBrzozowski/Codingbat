package pl.mbrzozowski.warmup.one;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 */
public class Max1020 {

    public int max1020(int a, int b) {
        if (max1020(a) && max1020(b)) {
            return Math.max(a, b);
        } else if (max1020(a) && !max1020(b)) {
            return a;
        } else if (max1020(b) && !max1020(a)) {
            return b;
        } else {
            return 0;
        }
    }

    private boolean max1020(int a) {
        return a >= 10 && a <= 20;
    }
}
