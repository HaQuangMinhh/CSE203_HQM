public class Essay extends GradedActivity {

    
    public boolean Grade ( int grammar, int spelling, int correctLength, int content) {
        if ( grammar > 30 ) {
            return false ; 
        } else if ( spelling > 20 ) {
            return false ; 
        } else if ( correctLength > 20 ) {
            return false ; 
        } else if ( content > 30 ) {
            return false ; 
        }
        // Method 2
        // double sum = grammar + spelling + correctLength + content
        // setScore(sum);

        super.setScore(grammar + spelling + correctLength + content ); 
        return true; 
    }


    

}
