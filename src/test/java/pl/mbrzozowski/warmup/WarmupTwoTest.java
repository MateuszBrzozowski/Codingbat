package pl.mbrzozowski.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WarmupTwoTest {

    @Test
    void stringMatch() {
        WarmupTwo warmupTwo = new WarmupTwo();
        int result = warmupTwo.stringMatch("abc", "abc");
        Assertions.assertEquals(2, result);
    }
}