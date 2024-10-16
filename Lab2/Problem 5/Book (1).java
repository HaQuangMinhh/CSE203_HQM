import java.util.Date;

public class Book {
    private String isbn;
    private String title;
    private boolean isAvailable;
    private Date dueDate;
    public Book(){}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    @Override
    public String toString() {
        return "ISBN: "+isbn+"\n"+"Title: "+title+"\n"+"DueDate: "+dueDate;
    }
}
