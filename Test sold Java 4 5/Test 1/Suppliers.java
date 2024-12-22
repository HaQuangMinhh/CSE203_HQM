import java.util.ArrayList;
import java.util.List;

public class Suppliers {

    private String Id ; 
    private String Name ; 
    private int QualityRating ; 
    private int LeadTime ;

    private List<SupplierProduct> products ; 
    
    public Suppliers(String id, String name, int qualityRating, int leadTime) {
        
        if ( qualityRating < 0 && qualityRating > 5 ) {
            throw new ValidationLogic("Quality can not be negative and over 5 ");
        }

        Id = id;
        Name = name;
        QualityRating = qualityRating ;
        LeadTime = leadTime;
        products = new ArrayList<>(); 
    }

    public void addProduct ( Products product , double price ) {
        products.add(new SupplierProduct( this, product, price));
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
    
    public int getLeadTime() {
        return LeadTime;
    }
    public void setLeadTime( int leadTime) {
        LeadTime = leadTime;
    }

    @Override
    public String toString() {
        return "Supplier: Id: " + Id + ", Name: " + Name + ", Quality: " + QualityRating + ", Lead Time: " + LeadTime ; 
    }

    public int getQualityRating() {
        return QualityRating;
    }

    public void setQualityRating(int qualityRating) {
        QualityRating = qualityRating;
    }

    public List<SupplierProduct> getProducts() {
        return products;
    }

    public void setProducts(List<SupplierProduct> products) {
        this.products = products;
    } 
}
