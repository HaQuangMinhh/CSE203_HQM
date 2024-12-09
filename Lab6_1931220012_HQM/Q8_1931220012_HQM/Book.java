import java.sql.Date;

public class Book implements Service {

    private String Isbn ; 
    private String Title ; 
    private String Authors ; 

    private boolean IsAvailable ;
    
    public Book(String isbn, String title, String authors) {
        Isbn = isbn;
        Title = title;
        Authors = authors;
        
        IsAvailable = true ; 
    }


    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getAuthors() {
        return Authors;
    }
    public void setAuthors(String authors) {
        Authors = authors;
    }
    
    

    @Override
    public Boolean GetAvailability() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Date GetDueDate() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Void SetAvailability(Boolean status) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void SetDueDate(Date dueDate) {
        // TODO Auto-generated method stub
        
    } 
}
