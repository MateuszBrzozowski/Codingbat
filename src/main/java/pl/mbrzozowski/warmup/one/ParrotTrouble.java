package pl.mbrzozowski.warmup.one;

/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 * Return true if we are in trouble.
 */
public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour >= 0 && hour <= 23) {
            return (hour < 7 || hour > 20) && talking;
        }
        return false;
    }
}
