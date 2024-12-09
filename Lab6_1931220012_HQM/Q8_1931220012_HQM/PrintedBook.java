
public class PrintedBook extends Book {
    
    private int CopyId ;

    public PrintedBook(String isbn, String title, String authors, int copyId) {
        super(isbn, title, authors);
        CopyId = copyId;
    }
    
    public int getCopyId() {
        return CopyId;
    }

    public void setCopyId(int copyId) {
        CopyId = copyId;
    }

    @Override
    public String toString() {
        return "PrintedBook Class, " + " isbn: " + getIsbn() + "\nTitle: " + getTitle() + "\nAuthors" + getAuthors() + "\nCopyId: " + CopyId; 
    }

}
