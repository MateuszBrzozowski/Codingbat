package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is multiplied with itself.
 */
public class Square {

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer *= integer)
                .collect(Collectors.toList());
    }
}
