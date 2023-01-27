package pl.mbrzozowski.string.two;

/**
 * A sandwich is two pieces of bread with something in between.
 * Return the string that is between the first and last appearance of "bread" in the given string,
 * or return the empty string "" if there are not two pieces of bread.
 */
public class GetSandwich {

    public String getSandwich(String str) {
        final String bread = "bread";
        if (str.length() <= bread.length() * 2) {
            return "";
        }
        int firstIndexOf = str.indexOf(bread);
        int lastIndexOf = str.lastIndexOf(bread);
        if (firstIndexOf != lastIndexOf) {
            return str.substring(firstIndexOf + 5, lastIndexOf);
        }
        return "";
    }
}
