package pl.mbrzozowski.logic.two;

/**
 *
 Given 3 int values, a b c, return their sum. However, if one of the values is the same as
 another of the values, it does not count towards the sum.
 */
public class LoneSum {

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != b && c != a) {
            sum += c;
        }
        return sum;
    }
}
