package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string
 * concatenated together.
 */
public class Copies3 {

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s = s + s + s)
                .collect(Collectors.toList());
    }
}
