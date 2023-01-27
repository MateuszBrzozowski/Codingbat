package pl.mbrzozowski.warmup.one;

/**
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 */
public class In3050 {

    public boolean in3050(int a, int b) {
        return in3050(a, b, 30, 40) || in3050(a, b, 40, 50);
    }

    private boolean in3050(int a, int b, int rangeMin, int rangeMax) {
        return (a >= rangeMin && a <= rangeMax) && (b >= rangeMin && b <= rangeMax);
    }
}
