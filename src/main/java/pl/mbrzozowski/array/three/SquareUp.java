package pl.mbrzozowski.array.three;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
 * {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 */
public class SquareUp {

    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        int howMuchNumbersFill = n;
        for (int i = result.length - 1; i >= 0; i -= n) {
            int number = 1;
            for (int j = i; howMuchNumbersFill >= number; j--) {
                result[j] = number;
                number++;
            }
            howMuchNumbersFill--;
        }
        return result;
    }
}
