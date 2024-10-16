import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String id;
    private String email;
    private String name;
    private ArrayList<Book> borrowingBooks;
    public Borrower(){
        borrowingBooks = new ArrayList<>();
    }
    public void addBook(Book b){
        borrowingBooks.add(b);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowingBooks() {
        return borrowingBooks;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "ID student: "+id+"\nName: "+name+"\nEmail: "+email;
    }
}
