package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return a list of those numbers except omitting any
 * that end with 9. (Note: % by 10)
 */
public class No9 {

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(a -> a % 10 != 9)
                .collect(Collectors.toList());
    }
}
