package pl.mbrzozowski.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarmupOneTest {

    Warmup1 warmupOne = new Warmup1();

    @Test
    public void nearHundred_93_true() {
        //given
        boolean actual = warmupOne.nearHundred(93);
        //when/then
        Assertions.assertTrue(actual);
    }

    @Test
    public void nearHundred_90_true() {
        //given
        boolean actual = warmupOne.nearHundred(90);
        //when/then
        Assertions.assertTrue(actual);
    }

    @Test
    public void nearHundred_89_false() {
        //given
        boolean actual = warmupOne.nearHundred(89);
        //when/then
        Assertions.assertFalse(actual);
    }

    @Test
    public void posNeg_minus4and5andtrue_false(){
        boolean actual = warmupOne.posNeg(-4, 5, true);
        Assertions.assertFalse(actual);
    }

}