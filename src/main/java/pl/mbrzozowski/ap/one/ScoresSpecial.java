package pl.mbrzozowski.ap.one;

/**
 * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is
 * a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the
 * largest special score in B. To practice decomposition, write a separate helper method which
 * finds the largest special score in an array. Write your helper method after your
 * scoresSpecial() method in the JavaBat text area.
 */
public class ScoresSpecial {

    public int scoresSpecial(int[] a, int[] b) {
        return scoresSpecial(a) + scoresSpecial(b);
    }

    private int scoresSpecial(int[] source) {
        int max = 0;
        for (int j : source) {
            if (j % 10 == 0) {
                max = Math.max(j, max);
            }
        }
        return max;
    }
}
