package pl.mbrzozowski.string.two;

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 */
public class BobThere {

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("b", i) && str.substring(i, i + 3).endsWith("b")) {
                return true;
            }
        }
        return false;
    }
}
