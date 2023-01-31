package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
 */
public class NoTeen {

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(a -> a < 13 || a > 19)
                .collect(Collectors.toList());
    }
}
