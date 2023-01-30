package pl.mbrzozowski.logic.two;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if
 * the three values are evenly spaced, so the difference between small and medium is the
 * same as the difference between medium and large.
 */
public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {
        int buffer;
        if (b < a) {
            buffer = b;
            b = a;
            a = buffer;
        }
        if (c < b) {
            buffer = c;
            c = b;
            b = buffer;
        }
        if (b < a) {
            buffer = b;
            b = a;
            a = buffer;
        }
        return b - a == c - b;
    }
}
