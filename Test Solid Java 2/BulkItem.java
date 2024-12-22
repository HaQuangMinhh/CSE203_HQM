public class BulkItem extends Item {

    private double BulkWeight ;

    public BulkItem(String name, int quantity, Float price, double bulkWeight) {
        super(name, quantity, price);
        BulkWeight = bulkWeight;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice() + ", Bulk Weight: " + BulkWeight );
    } 
    
}
