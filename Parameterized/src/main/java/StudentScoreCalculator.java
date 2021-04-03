public class StudentScoreCalculator {

    private int satScore;

    public void calculateSATScore(int mathsScore, int literacyScore) {
        if (mathsScore < 0 || mathsScore > 100 || literacyScore < 0 || literacyScore > 100) {
            satScore = -1;
        } else {
            satScore = mathsScore * literacyScore;
        }
    }

    public int getSatScore() {
        return this.satScore;
    }
}
