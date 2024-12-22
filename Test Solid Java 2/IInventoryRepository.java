import java.util.List;

public interface IInventoryRepository {

    // Kho lưu trữ hàng tồn kho 
    void saveToFile ( String filePath , List<Item> items ) ; 

    List<Item> loadFromFile ( String filePath ) ; 
    
}
