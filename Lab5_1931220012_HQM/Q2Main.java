
import java.util.HashSet;

public class Q2Main {

    public static HashSet<Instructor> instructors;

    public static void main(String[] args) {
        // Tạo các đối tượng Instructor
        Instructor instructor1 = new Instructor("Minh", "Ha", "A101");
        Instructor instructor2 = new Instructor("Vinh", "Ngo", "A101");
        Instructor instructor3 = new Instructor("Duy", "Ngo", "B202");

        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);

    }

    // Thêm Instructor into HashSet 
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    // Search for an instructor (  ) 
    public Instructor searchInstructor(String searchTerm) {
        for (Instructor instructor : instructors) {

            if (instructor.getFirstName().equalsIgnoreCase(searchTerm)
                    || instructor.getLastName().equalsIgnoreCase(searchTerm)
                    || instructor.getOfficeNumber().equalsIgnoreCase(searchTerm)) {
                return instructor;
            }
        }
        return null;
    }

}
