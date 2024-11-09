public class RetailItem {

    private String Name ; 
    private Double Price ; 
    private int QuantityInStock ;
    
    
    // Constructor
    public RetailItem(String name, Double price, int quantityInStock) {
        Name = name;
        Price = price;
        QuantityInStock = quantityInStock;
    }

    // Purchase 
    public boolean purchase( int quantity ) {
        if ( quantity <= QuantityInStock ) {
            QuantityInStock -= quantity ; 
            return true ; 
        } else {
            System.out.println("Not enough in stock");
            return false ; 
        }
    }

    // Increase the stock 
    public void restock (int quantity ) {
        if (quantity > 0 ) {
            QuantityInStock += quantity ; 
            System.out.println( "Restock: " + quantity + ", Quantity updated: " + QuantityInStock );
        } else {
            System.out.println("Please input again");
        }
    }

    // Equals based on name
    public boolean CompareTwoItem (RetailItem anotherItem) {
        return this.Name.equals(anotherItem.Name);
    }


    // SystemOut
    @Override
    public String toString() {
        return Name + " , Price: " + Price + " , In Stock: " + QuantityInStock ;
    }

    // Getter and Setter 
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
}
