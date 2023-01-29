package pl.mbrzozowski.logic.one;

/**
 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different
 * from each other, the result is 0. If all of the numbers are the same, the result is 20. If two
 * of the numbers are the same, the result is 10.
 */
public class GreenTicket {

    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }
}
