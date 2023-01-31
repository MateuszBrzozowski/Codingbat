package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "*" added at its end.
 */
public class AddStar {

    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s += "*")
                .collect(Collectors.toList());
    }
}
