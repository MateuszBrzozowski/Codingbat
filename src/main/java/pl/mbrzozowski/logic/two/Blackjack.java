package pl.mbrzozowski.logic.two;

/**
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going
 * over. Return 0 if they both go over.
 */
public class Blackjack {

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        if (21 - b < 21 - a) {
            return b;
        }
        return a;
    }
}
