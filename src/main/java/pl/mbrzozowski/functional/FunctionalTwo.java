package pl.mbrzozowski.functional;

import java.util.List;
import java.util.stream.Collectors;


public class FunctionalTwo {

    public FunctionalTwo() {
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(a -> (a * a) + 10)
                .filter(a -> a % 10 != 5 && a % 10 != 6)
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer * 2)
                .filter(integer -> integer % 10 != 2)
                .collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.endsWith("y"))
                .filter(s -> !s.contains("yy"))
                .map(s -> s = s + "y")
                .collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(a -> a < 13 || a > 19)
                .collect(Collectors.toList());
    }


    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(a -> a % 10 != 9)
                .collect(Collectors.toList());
    }


    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(a -> a >= 0)
                .collect(Collectors.toList());
    }

}
