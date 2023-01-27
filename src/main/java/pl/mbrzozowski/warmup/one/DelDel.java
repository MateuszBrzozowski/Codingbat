package pl.mbrzozowski.warmup.one;

/**
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted.
 * Otherwise, return the string unchanged.
 */
public class DelDel {

    public String delDel(String str) {
        if (str.indexOf("del", 1) == 1) {
            str = str.replaceFirst("del", "");
        }
        return str;
    }
}
