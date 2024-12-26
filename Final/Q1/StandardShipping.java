public class StandardShipping extends ShippingService {

    public StandardShipping(String trackingID, String senderName, String receiverName, double packageWeight) {
        super(trackingID, senderName , receiverName , packageWeight) ; 

    }

    @Override
    public double calculateCost() {
        return 5 + getPackageWeight() ; // $5 base fee + $1 per kg
    }

    
}
