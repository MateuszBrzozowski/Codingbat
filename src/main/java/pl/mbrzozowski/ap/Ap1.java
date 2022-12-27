package pl.mbrzozowski.ap;

public class Ap1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

}
