package pl.mbrzozowski.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

class ArrayOneTest {

    private final ArrayOne arrayOne = new ArrayOne();

    @Test
    void firstLast6() {
        int input[] = {1, 2, 6};
        boolean result = arrayOne.firstLast6(input);
        Assertions.assertTrue(result);
    }
}