package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is multiplied by 2.
 */
public class Doubling {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
    }
}
