import java.io.IOException;

public class Q8Main {



    public static void main(String[] args) {
        
        try {
            double[] scores = { 10 , 50 , 80 , 90 , 115 , 110 }; 

            TestScores testScores = new TestScores(scores); 

            System.out.println("Average Scores: " + testScores.calculateAvgScores());

        } catch ( InvalidTestScore a ) {
            System.out.println("Loi r " + a.getMessage());
        }


    }
}
