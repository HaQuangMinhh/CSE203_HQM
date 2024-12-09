public class OrderValidation implements IOrderValidation {

    @Override
    public boolean validate(Order order) {
        
        if (order.getItem().isEmpty()) {
            System.out.println("No items in the List");
            return false ; 
        } 

        if (order.getTotalAmount() <= 0 ) {
            System.out.println("Total price is invalid");
            return false ; 
        }

        System.out.println("Order Validation passed");
        return true ; 
        
    }

}
