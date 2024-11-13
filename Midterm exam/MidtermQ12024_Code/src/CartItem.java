public class CartItem {
    private RetailItem retailItem;
    private int quality;
    public CartItem(RetailItem retailItem, int quality) {
        this.retailItem = retailItem;
        this.quality = quality;
    }
    public RetailItem getRetailItem() {
        return retailItem;
    }
    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
    
    public void getInfo(){
        String temp = "";
        temp += retailItem.getName() + ", " + retailItem.getPrice() + ", quality = " + quality;
        System.out.println(temp);
    }

    public double getTotalPrice(){
        double total = retailItem.getPrice() * quality;
        return total;
    }

    public boolean equals(CartItem anotherCartItem){
        return retailItem.equals(anotherCartItem.getRetailItem());
    }
}
