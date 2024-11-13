public class RetailItem {
    private String name;
    private double price;
    private int quantityInStock;
    public RetailItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
    public boolean purchase(int quantity){
        if (quantityInStock <= quantity) {
            System.out.println("not enough");
            return false;
        }
        quantityInStock -= quantity;
        return true;
    }
    public void	restock(int quantity){
        quantityInStock += quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    @Override
    public String toString() {
        return "RetailItem [name=" + name + ", price=" + price + ", quantityInStock=" + quantityInStock + "]";
    }
    
    public void getInfo(){
        System.out.println(toString());
    }
    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof RetailItem) == false)
            return false;
        else{
            RetailItem temp = (RetailItem)obj;
            return this.name.equals(temp.name);
        }
    }
    
}
