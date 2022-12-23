package pl.mbrzozowski.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringOneTest {

    @Test
    void endsLy() {
        StringOne stringOne = new StringOne();
        boolean isEndsLy = stringOne.endsLy("a");
        Assertions.assertFalse(isEndsLy);
    }
}