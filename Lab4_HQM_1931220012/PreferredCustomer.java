public class PreferredCustomer extends Customer {
    private double purchaseAmount;
    private double discountLevel;

    public PreferredCustomer(String name, String address, String phoneNumber, String customerNumber,
            boolean mailingList,
            double purchaseAmount) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.purchaseAmount = purchaseAmount;
        setDiscountLevel();
    }

    public double buyProduct(double price) {
        double priceAfterdiscount = price - price * discountLevel;
        purchaseAmount += priceAfterdiscount;
        setDiscountLevel();
        return priceAfterdiscount;

    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel() {
        if (purchaseAmount >= 2000) {
            discountLevel = 0.10;
        } else if (purchaseAmount >= 1500) {
            discountLevel = 0.07;
        } else if (purchaseAmount >= 1000) {
            discountLevel = 0.06;
        } else if (purchaseAmount >= 500) {
            discountLevel = 0.05;
        } else {
            discountLevel = 0;
        }
    }

    @Override
    public String toString() {
        return " Name: " + getName() + ", CustomerNumber:" + getCustomerNumber() + ", Address: "
                + getAddress() + ", isMailingList: " + isOnMalling() + ", getPhoneNumber: " + getPhoneNumber()
                + " , PurchaseAmount: " + purchaseAmount + ", discountLevel: " + discountLevel;
    }
    
}
