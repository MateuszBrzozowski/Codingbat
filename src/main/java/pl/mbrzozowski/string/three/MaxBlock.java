package pl.mbrzozowski.string.three;

/**
 * Given a string, return the length of the largest "block" in the string.
 * A block is a run of adjacent chars that are the same.
 */
public class MaxBlock {

    public int maxBlock(String str) {
        int maxSum = 0;
        for (int i = 0; i < str.length(); i++) {
            int sumTemp = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    sumTemp++;
                } else {
                    break;
                }
            }
            if (maxSum < sumTemp) {
                maxSum = sumTemp;
            }
        }
        return maxSum;
    }
}
