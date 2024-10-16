import java.util.List;

public class Borrower {
    private String id;
    private String email;
    private String name;
    private List<Book> borrowingBooks;
    public Borrower(){}

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

    public List<Book> getBorrowingBooks() {
        return borrowingBooks;
    }

    public void setBooks(List<Book> books) {
        this.borrowingBooks = books;
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
