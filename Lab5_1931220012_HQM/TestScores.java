

public class TestScores {

    private double[] Scores ;

    public TestScores( double[] scores ) throws InvalidTestScore  {
        for ( var score : scores ) {
            if ( score < 0 || score > 100)   {
                throw new InvalidTestScore("Invalid score hehe");
            }
        }
        Scores = scores ; 
    } 

    public double calculateAvgScores() {
        int result  = 0 ; 
        for ( var eachScore : Scores ) {
            result += eachScore ; 
        }
        return result / Scores.length  ; 
    }

    



}
