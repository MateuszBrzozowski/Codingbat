package pl.mbrzozowski.logic.two;

/**
 * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and
 * big bars (5 kilos each). Return the number of small bars to use, assuming we always use
 * big bars before small bars. Return -1 if it can't be done.
 */
public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {
        if (goal > (big * 5) + small) {
            return -1;
        }
        int temp;
        if (goal >= 5 * big) {
            temp = goal - (5 * big);
        } else {
            temp = goal % 5;
        }
        if (temp <= small) {
            return temp;
        } else {
            return -1;
        }
    }
}
