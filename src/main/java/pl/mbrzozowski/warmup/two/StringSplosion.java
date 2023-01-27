package pl.mbrzozowski.warmup.two;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 */
public class StringSplosion {

    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str, 0, i + 1);
        }
        return result.toString();
    }
}
