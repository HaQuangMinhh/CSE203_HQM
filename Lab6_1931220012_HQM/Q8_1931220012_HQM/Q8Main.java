import java.io.File;

public class Q8Main {

    public static void main(String[] args) {
        
        Library library = new Library(); 

        User user1 = new User("1", "Tuan"); 
        user1.setPassword("123456");

        User user2 = new User("2", "Hoang"); 
        User user3 = new User("3", "Nghia"); 
        
        

        // mở ra là bị duplicate
        // library.addUser(user1);
        // library.addUser(user2);
        // library.addUser(user3);

        
        File outputFile = new File("output.txt");

        // Load Users from file TO vào list User
        library.loadUsersFromFile(outputFile);

        // Test Load Users
        library.showUser();


        // Cuối chương trình 
        // Save Users from khi addUser vào library TO output.txt
        library.saveUsersToFile(outputFile);

        System.out.println("----------------------------------");
        // Room 
        Room room1 = new Room("A100", "Big", 25);
        library.addService(room1);
        System.out.println(room1);

        // Book
        EBook eBook = new EBook("12345", "Java", "John", Format.PDF); 
        PrintedBook printedBook = new PrintedBook("456789", "C++", "Doe", 1);

        System.out.println("----------------------------------");
        System.out.println(eBook);
        System.out.println(printedBook);
        System.out.println("----------------------------------");

        // Borrow book 
        Tutoring tutoring1 = new Tutoring("S101", "Minh", "Math");


        System.out.println("---------Borrow Service-------------------------");
        if (library.bookService(user3, tutoring1, 24)) {
            System.out.println(user3.getName() + " has borrowed \"" + tutoring1 +
                    "\" with due date: " + tutoring1.GetDueDate());
        }
        System.out.println("----------------------------------");

        System.out.println("--------------Return Service--------------------");
        library.returnService(user3, tutoring1);
        


    }
}
