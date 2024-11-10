public class MainCourseGrades {

    // Create a new object from CourseGrades ==> Object A
    // Create GradedActivity ==> Object B 
    // Dùng Object A gọi hàm setLab truyền vào Object B 

    public static void main(String[] args) {
        
        GradedActivity gradedActivity = new GradedActivity() ; 
        gradedActivity.setScore(80);

        PassFailActivity passFailActivity = new PassFailActivity(10);
        passFailActivity.setScore(85);

        Essay essay = new Essay();
        essay.setScore(90);

        FinalExam finalExam = new FinalExam(50, 45);
        finalExam.setScore(88);

        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab( gradedActivity );
        courseGrades.setPassFailExam(passFailActivity);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);

        System.out.println( courseGrades );
        

        System.out.println("Average Score: " + courseGrades.getAverage());
        System.out.println("Highest Score: " + courseGrades.getHighest());
        System.out.println("Lowest Score: " + courseGrades.getLowest());
    }
}
