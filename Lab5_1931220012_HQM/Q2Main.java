

public class Q2Main {

    public static void main(String[] args) {
        
        InstructorManager manager = new InstructorManager(); 


        manager.addInstructor(new Instructor("Minh", "Hi", 1));

        manager.addInstructor(new Instructor("Go", "mong", 2));

        // show all giảng viên 
        manager.displayInstructor();
        

        // Search by FirstName 
        Instructor instructor1 = manager.searchByFirstName("oooooo");

        if ( instructor1 != null ) {
            System.out.println("Show: " + instructor1);
        }  else {
            System.out.println("not found");
        }
    }
}
