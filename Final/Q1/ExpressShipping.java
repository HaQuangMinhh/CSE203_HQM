public class ExpressShipping extends ShippingService  {

    public ExpressShipping ( String trackingID, String senderName, String receiverName, double packageWeight) {
        super(trackingID, senderName, receiverName, packageWeight) ; 
    }

    @Override
    public double calculateCost() {
        
        return 10 + 2 * getPackageWeight() ;
    }

}
