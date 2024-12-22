public class Products {

    private String Id ; 
    private String Name ; 
    private String Category ; 
    private double UnitPrice ;
    
    // Choose Lowest cost , Highest quality rating , Shortest lead time

    public Products(String id, String name, String category, double unitPrice) {
        Id = id;
        Name = name;
        Category = category;
        UnitPrice = unitPrice;
    }


    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public double getUnitPrice() {
        return UnitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }


    @Override
    public String toString() {
        return "Product: Id: " + Id + ", Name: " + Name + ", Category: " + Category + ", Unit Price: " + UnitPrice ; 
    } 
}
