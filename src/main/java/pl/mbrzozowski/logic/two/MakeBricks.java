package pl.mbrzozowski.logic.two;

/**
 * We want to make a row of bricks that is goal inches long. We have a number of small
 * bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the
 * goal by choosing from the given bricks. This is a little harder than it looks and can be done
 * without any loops. See also: Introduction to MakeBricks
 */
public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        if ((big * 5 + small) < goal) {
            return false;
        } else {
            return goal % 5 <= small;
        }
    }
}
