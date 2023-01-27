package pl.mbrzozowski.string.three;

/**
 * Given two strings, base and remove, return a version of the base string where all instances
 * of the remove string have been removed (not case sensitive). You may assume that the remove
 * string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */
public class WithoutString {

    public String withoutString(String base, String remove) {
        while (true) {
            if (base.toLowerCase().contains(remove.toLowerCase())) {
                int indexOf = base.toLowerCase().indexOf(remove.toLowerCase());
                base = base.substring(0, indexOf) + base.substring(indexOf + remove.length());
            } else {
                break;
            }
        }
        return base;
    }
}
