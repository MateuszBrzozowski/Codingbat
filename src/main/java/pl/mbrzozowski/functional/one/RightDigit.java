package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
 */
public class RightDigit {

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(a -> a % 10)
                .collect(Collectors.toList());
    }
}
