package pl.mbrzozowski.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringOneTest {

    @Test
    void endsLy() {
        String1 stringOne = new String1();
        boolean isEndsLy = stringOne.endsLy("a");
        Assertions.assertFalse(isEndsLy);
    }
}