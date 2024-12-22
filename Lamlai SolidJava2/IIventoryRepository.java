import java.util.List;

public interface IIventoryRepository {

    void SaveToFile(String filePath , List<Item> items); 

    List<Item> LoadFromFile (String filePath ) ;

}
