package pl.mbrzozowski.warmup.one;

/**
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100
 */
public class IcyHot {

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }
}
