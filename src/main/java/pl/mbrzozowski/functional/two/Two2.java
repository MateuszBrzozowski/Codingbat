package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return a list of those numbers multiplied by 2,
 * omitting any of the resulting numbers that end in 2.
 */
public class Two2 {

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer * 2)
                .filter(integer -> integer % 10 != 2)
                .collect(Collectors.toList());
    }
}
