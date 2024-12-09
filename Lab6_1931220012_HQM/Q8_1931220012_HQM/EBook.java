

public class EBook extends Book {
    private Format format ;


    public EBook(String isbn, String title, String authors , Format format) {
        super(isbn, title, authors);
        this.format = format;
    }


    @Override
    public String toString() {
        return "Ebook Class, " + " isbn: " + getIsbn() + "\nTitle: " + getTitle() 
                + "\nAuthors" + getAuthors() + "\nFormat: " + format ; 
    } 

    

}
