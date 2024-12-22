public class OrderItem {

    private Products product ; 
    private int Quantity ;
    
    public OrderItem(Products product, int quantity) {
        this.product = product;
        Quantity = quantity;
    }
    
    public Products getProduct() {
        return product;
    }
    public void setProduct(Products product) {
        this.product = product;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    } 
}
