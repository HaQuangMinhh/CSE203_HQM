public class Item {

    private String Name  ; 
    private int Quantity ; 
    private float Price ;

    
    public Item(String name, int quantity, float price) {
        
        if ( quantity < 0 ) {
            throw new ValidationLogic("Quantity cannot be negative");
        }
        if ( Price < 0  ) {
            throw new ValidationLogic("Price cannot be negative");
        }
        
        Name = name;
        Quantity = quantity;
        Price = price;
    }

    public void getDescription() {
        System.out.println("Name: " + Name + ", Quantity: " + Quantity + ", Price: " + Price );
    }

    public String getDescription1() {
        return "Name: " + Name + ", Quantity: " + Quantity + ", Price: " + Price ; 
    }


    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public float getPrice() {
        return Price;
    }
    public void setPrice(float price) {
        Price = price;
    } 

}
