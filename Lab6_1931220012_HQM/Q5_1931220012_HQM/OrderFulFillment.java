public class OrderFulFillment implements IOrderFulfillment {

    @Override
    public void fulfillOrder(Order order) {
        System.out.println("Fulfilling order : " + order.getId() );

        order.setStatus("Completed"); 
        
        System.out.println("Order fullfill successfully ");
    }

}
