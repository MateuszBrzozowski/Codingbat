package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
 */
public class NoNeg {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(a -> a >= 0)
                .collect(Collectors.toList());
    }
}
