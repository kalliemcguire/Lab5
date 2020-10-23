import java.util.Scanner;

public class TestScoresDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the first test score :");
        double testScoreOne = keyboard.nextDouble();
        System.out.println("Enter the second test score :");
        double testScoreTwo = keyboard.nextDouble();
        System.out.println("Enter the third test score :");
        double testScoreThree = keyboard.nextDouble();
        
        double[] userScores = {testScoreOne, testScoreTwo, testScoreThree};
        
        TestScores test = new TestScores(userScores);
        
        try {
            test.setScores(userScores);
        }
        catch (InvalidTestScore ex) {
            System.out.println("Invalid test scores");
        }
        
        System.out.println("The average test score is : " + TestScores.averageScore(userScores));
    }
}
