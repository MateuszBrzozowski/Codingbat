package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 */
public class MoreY {

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> s = "y" + s + "y")
                .collect(Collectors.toList());
    }
}
