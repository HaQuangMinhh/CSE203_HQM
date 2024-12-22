public class Item {

    private String Name ; 
    private int Quantity ; 
    private Float Price ;
    

    public Item(String name, int quantity, Float price) {
        // Thêm exception handling 
        if ( quantity < 0 ) {
            throw new ValidationLogic("Quantity cannot be negative");
        } 
        if ( price < 0  ) {
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
    public Float getPrice() {
        return Price;
    }
    public void setPrice(Float price) {
        Price = price;
    }

   



}
