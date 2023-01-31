package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
 */
public class Math1 {

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer = (integer + 1) * 10)
                .collect(Collectors.toList());
    }
}
