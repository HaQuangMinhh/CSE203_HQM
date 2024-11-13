package Solution;


public class RetailItem {
    
    private String Name ; 
    private Double Price ; 
    private int QuantityInStock ;
    

    public RetailItem(String name, Double price, int quantityInStock) {
        Name = name;
        Price = price;
        QuantityInStock = quantityInStock;
    }

    // Purchase ( quantity ) 
    public boolean purchase( int quantity ) {
        if ( quantity <= QuantityInStock ) {
            QuantityInStock -= quantity ; 
            return true ; 
        } else {
            System.out.println("Not enough");
            return false ; 
        }
    }

    //restock 
    public void restock ( int quantity ) {
        QuantityInStock += quantity ; 
    }

    // Get infor
    public void getInfor() {
        System.out.println(toString());
    }

    // Equals based on name
    public boolean compareTwoItem (RetailItem anotherItem) {
        return this.Name.equals(anotherItem.Name);
    }


    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        Price = price;
    }
    public int getQuantityInStock() {
        return QuantityInStock;
    }
    public void setQuantityInStock(int quantityInStock) {
        QuantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "Product: " + Name + ", Price: " + Price + ", Quantity In Stock: " + QuantityInStock ; 
    } 

    


}
