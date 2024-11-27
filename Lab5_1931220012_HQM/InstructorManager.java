import java.util.HashSet;

public class InstructorManager {

    private HashSet<Instructor> instructors ;

    public InstructorManager() {
        instructors = new HashSet<>();
    } 

    // thêm giảng viên 
    public void addInstructor(Instructor instructor ) {
        instructors.add(instructor); 
    }

    // Show all instructor 
    public void displayInstructor () {
        if (instructors.isEmpty()) {
            System.out.println("Don't have any people");
        } else {
            System.out.println("Instructors available");
            for ( Instructor instructor : instructors  ) {
                System.out.println( instructor );
            }
        }
    }

    // Search instructor
    public Instructor searchByFirstName ( String firstName ) {
        for ( Instructor instructor : instructors ) {
            if ( instructor.getFirstName().toLowerCase().equals(firstName) ) {
                return instructor ; 
            }
        }
        return null ; 
    }
}
