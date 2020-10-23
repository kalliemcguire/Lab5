public class TestScores {
    private double[] scores;

    public TestScores(double[] scores) {
        this.scores = scores;
    }
    
    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) throws InvalidTestScore {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) {
                throw new InvalidTestScore("Invalid test scores");
            }
        }
        this.scores = scores;
    }
    
    public static double averageScore(double[] scores) {
        double total = 0;
        
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];   
        }
        double average = total / scores.length;
        return average;
    }
}
