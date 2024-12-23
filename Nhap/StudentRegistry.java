import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<Integer, Student> studentMap ;

    public StudentRegistry() {
        studentMap = new HashMap<>();
    }  

    // add student 
    public void addStudent ( Student student ) {
        studentMap.put(student.getId(), student) ; 
    }

    // Id
    public Student getStudent ( int id ) {
        return studentMap.get(id);
    }

    // show all students 
    public void displayAllStudents() {
        for ( Student student : studentMap.values() ) {
            System.out.println(student);
        }

    }
    

}
