package pl.mbrzozowski.ap.one;

/**
 * Start with two arrays of strings, A and B, each with its elements in alphabetical order and
 * without duplicates. Return a new array containing the first N elements from the two arrays.
 * The result array should be in alphabetical order and without duplicates. A and B will both
 * have a length which is N or more. The best "linear" solution makes a single pass over A
 * and B, taking advantage of the fact that they are in alphabetical order, copying elements
 * directly to the new array.
 */
public class MergeTwo {

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < result.length; i++) {
            if (a[indexA].compareTo(b[indexB]) < 0) {
                result[i] = a[indexA];
                indexA++;
            } else if (a[indexA].compareTo(b[indexB]) > 0) {
                result[i] = b[indexB];
                indexB++;
            } else {
                result[i] = a[indexA];
                indexA++;
                indexB++;
            }
        }
        return result;
    }
}
