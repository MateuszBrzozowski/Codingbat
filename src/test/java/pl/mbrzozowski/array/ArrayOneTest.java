package pl.mbrzozowski.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayOneTest {

    private final Array1 arrayOne = new Array1();

    @Test
    void firstLast6() {
        int input[] = {1, 2, 6};
        boolean result = arrayOne.firstLast6(input);
        Assertions.assertTrue(result);
    }

    @Test
    void midThree() {
//        System.out.println(5 / 2);
    }

    @Test
    void front11() {
        int[] ints = arrayOne.front11(new int[]{1, 2, 3}, new int[]{7, 8, 8});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}