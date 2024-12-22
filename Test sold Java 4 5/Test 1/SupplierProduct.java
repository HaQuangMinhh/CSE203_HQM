public class SupplierProduct {

    private Suppliers suppliers ; 
    private Products products ; 
    private double Price ;
    
    public SupplierProduct(Suppliers suppliers, Products products, double price) {
        this.suppliers = suppliers;
        this.products = products;
        Price = price;
    }

    
    public Suppliers getSuppliers() {
        return suppliers;
    }
    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }
    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        Price = price;
    } 
}
