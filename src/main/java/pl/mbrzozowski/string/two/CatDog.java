package pl.mbrzozowski.string.two;

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 */
public class CatDog {

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                countCat++;
            }
            if (str.startsWith("dog", i)) {
                countDog++;
            }
        }
        return countCat == countDog;
    }
}
