public abstract class ShippingService {
    
    private String trackingID ; 
    private String senderName ; 
    private String receiverName ; 
    private double packageWeight ; 
    private String shippingStatus ;
    
    
    public ShippingService(String trackingID, String senderName, String receiverName, double packageWeight) {
        this.trackingID = trackingID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.packageWeight = packageWeight;

        this.shippingStatus = "Pending" ; 
    }

    public abstract double calculateCost() ;     // Method abstract 

    public String getTrackingID() {
        return trackingID;
    }
    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }
    public String getSenderName() {
        return senderName;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public double getPackageWeight() {
        return packageWeight;
    }
    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }
    public String getShippingStatus() {
        return shippingStatus;
    }
    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    } 

    

}
