public class HashMap {


    public static void main(String[] args) {
        
        Student be1 = new Student(1, "Hung");

        StudentRegistry registry = new StudentRegistry() ; 

        registry.addStudent(be1);

        registry.displayAllStudents();

    }


}
