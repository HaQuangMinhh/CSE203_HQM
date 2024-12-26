public class Main {


    public static void main(String[] args) {
        
        // Standard Shipping 
        ShippingService standard = new StandardShipping("S202", "Hoang", "Minh", 5); 
        System.out.println("Standard Shipping Cost: " + standard.calculateCost());

        standard.setShippingStatus("In Transit");
        System.out.println("Status: " + standard.getShippingStatus());


        // Express
        ShippingService express = new ExpressShipping( "A121" , "Lucky", "hehe", 10  );
        System.out.println("Express Shipping cost: " + express.calculateCost());

        express.setShippingStatus("Delivered");
        System.out.println("Status: " + express.getShippingStatus()); 
    }


}
