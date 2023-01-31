package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers squared and the product added to
 * 10, omitting any of the resulting numbers that end in 5 or 6.
 */
public class Square56 {

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(a -> (a * a) + 10)
                .filter(a -> a % 10 != 5 && a % 10 != 6)
                .collect(Collectors.toList());
    }
}
