package Lab2.Problem5;


import java.util.*;
public class Borrower {

    private String Id ; 
    private String email ; 
    private String name ; 
    private ArrayList<Book> borrowingBooks ;
    
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public void setBorrowingBooks(ArrayList<Book> borrowingBooks) {
        this.borrowingBooks = borrowingBooks;
    } 

    // tạo 1 hàm addbook 
    public void addBook(Book b ) {
        borrowingBooks.add(b);
    }

    
}
