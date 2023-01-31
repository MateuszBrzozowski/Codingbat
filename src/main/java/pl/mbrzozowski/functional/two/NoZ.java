package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list of the strings, omitting any string that contains a "z".
 * (Note: the str.contains(x) method returns a boolean)
 */
public class NoZ {

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }
}
