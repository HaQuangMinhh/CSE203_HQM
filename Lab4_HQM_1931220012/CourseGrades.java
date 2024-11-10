
import java.util.*;
public class CourseGrades implements Analyzable {

    // Có 2 cách viết 
    private GradedActivity[] grades = new GradedActivity[4]  ; // data type 
    // private List<GradedActivity> gradedActivity2 ;
    
    public void setLab(GradedActivity gradedActivity ) {
        grades[0] = gradedActivity ;    // Array
    }

    public void setPassFailExam ( PassFailActivity passFailActivity ) {
        grades[1] = passFailActivity ; 
    }

    public void setEssay ( Essay essay ) {
        grades[2] = essay ; 
    }

    public void setFinalExam ( FinalExam finalExam ) {
        grades[3] = finalExam ; 
    }


    // Viết hàm toString lấy cả hàm số và hàm chữ 
    // Append
    @Override
    public String toString() {
        // String scores = "";
        // System.out.println(" Course Grades: ");

        // for ( GradedActivity gradedActivity : grades ) {
        //     scores += gradedActivity.getScore() ;
            
        //     System.out.println("Graded Activity = " + gradedActivity.getScore() + ", Letter grade = " + gradedActivity.getGrade()) ;  
        // }
        // return scores ; 

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            result.append("Activity ").append(i + 1).append(": ");
            result.append("Score = ").append(grades[i].getScore());
            result.append(", Grade = ").append(grades[i].getGrade()).append("\n");
        }
        return result.toString();
    }

   
    @Override
    public double getAverage() {
        double result = 0;
        for (GradedActivity grade : grades) {
            result += grade.getScore();
        }
        return result / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity highActivity = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() > highActivity.getScore()) {
                highActivity = grade;
            }
        }
        return highActivity;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowActivity = grades[0];
        for (GradedActivity grade : grades) {
            if (grade.getScore() < lowActivity.getScore()) {
                lowActivity = grade;
            }
        }
        return lowActivity;
    }


    

}
