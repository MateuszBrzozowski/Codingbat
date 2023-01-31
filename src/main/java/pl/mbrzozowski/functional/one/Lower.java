package pl.mbrzozowski.functional.one;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string is converted to lower case
 * (Note: String toLowerCase() method).
 */
public class Lower {

    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}
