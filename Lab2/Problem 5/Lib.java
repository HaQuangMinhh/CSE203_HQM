import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lib {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAvailable(true);
        book.setIsbn("1234");
        book.setTitle("Introduction to Java");
        book.setDueDate(new GregorianCalendar(2025, Calendar.FEBRUARY, 11).getTime());
        String bookInfor = book.getIsbn() + " " + book.getTitle() + " " +
                 book.isAvailable() + " " + book.getDueDate().toString();
        System.out.println(bookInfor);
        
	Borrower borrower = new Borrower();
        borrower.setEmail("tien.nguyenduc@eiu.edu.vn");
        borrower.setId("123");
        borrower.setName("Tien");
        
        if(book.isAvailable()){
            System.out.println("check if any overdue book");
            ArrayList<Book> borrowingBooks = borrower.getBorrowingBooks();
            int count = 0;
            for (Book book2 : borrowingBooks) {
                if(book2.getDueDate().before(new Date()))
                    count++;
            }
            if(count >= 1){
                System.out.println("You cannot borrow any more book");
            }
            else{
                System.out.println("OK");
                book.setAvailable(false);
                borrower.addBook(book);
                book.setDueDate(new GregorianCalendar(2024, Calendar.NOVEMBER, 11).getTime());
            }

        }
        else{
            System.out.println("The book is not available");
        }

    }
}
