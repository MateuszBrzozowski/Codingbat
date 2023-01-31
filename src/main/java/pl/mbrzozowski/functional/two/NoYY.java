package pl.mbrzozowski.functional.two;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "y" added at its end, omitting any
 * resulting strings that contain "yy" as a substring anywhere.
 */
public class NoYY {

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.endsWith("y"))
                .filter(s -> !s.contains("yy"))
                .map(s -> s = s + "y")
                .collect(Collectors.toList());
    }
}
