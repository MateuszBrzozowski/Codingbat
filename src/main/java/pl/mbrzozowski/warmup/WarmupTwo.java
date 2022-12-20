package pl.mbrzozowski.warmup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarmupTwo {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public void run() {
        logger.info(stringTimes("Hi", 2));
        logger.info(stringTimes("Hi", 3));
        logger.info(stringTimes("Hi", 1));
    }

    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     * <p>
     * stringTimes("Hi", 2) → "HiHi"<p>
     * stringTimes("Hi", 3) → "HiHiHi"<p>
     * stringTimes("Hi", 1) → "Hi"<p>
     */
    public String stringTimes(String str, int n) {
        String pattern = str;
        if (n == 0) {
            return "";
        }
        for (int i = 0; i < n - 1; i++) {
            str += pattern;
        }
        return str;
    }

}
