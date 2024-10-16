package Lab2.Problem5;

import java.util.*;
public class Main {


    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        // Book 
        Book book = new Book(); 
        
        book.setAvailable(true);
        book.setIsbn("5836");
        book.setTitle("Hello world");
        
        book.setDueDate(new GregorianCalendar(2025, Calendar.FEBRUARY, 12).getTime());

        String bookInfor = "ISBN: " + book.getIsbn() 
        + "\nTitle: " + book.getTitle()
        + "\nAvailable: " + book.isAvailable() 
        + "\nDue Date: " + book.getDueDate();
        
        System.out.println("================================================");
        System.out.println( bookInfor );
        System.out.println("================================================");


        // Borrower 
        Borrower borrower = new Borrower();

        System.out.println("EmaiL: ");
        String email = sc.nextLine();
        borrower.setEmail( email );

        System.out.println("Id: ");
        String id = sc.nextLine();
        borrower.setId(id);

        System.out.println("Name: ");
        String name = sc.nextLine(); 
        borrower.setName( name );


        if ( book.isAvailable() ) {
            System.out.println("Check if any overdue book: ");
            ArrayList<Book> borrowingBooks = borrower.getBorrowingBooks(); 

            int count = 0 ; 
            for ( Book book2 : borrowingBooks ) {
                if (book2.getDueDate().before(new Date() ))
                    count++;
            }

            if (count >= 1) {
                System.out.println(" You cannot borrow any more book");
            } else {
                System.out.println("OK");
                book.setAvailable(false);
                borrower.addBook(book);
                book.setDueDate(new GregorianCalendar(2024, Calendar.NOVEMBER, 12).getTime());
            }
        } else {
            System.out.println("The book is not available");
        }

    }
}
