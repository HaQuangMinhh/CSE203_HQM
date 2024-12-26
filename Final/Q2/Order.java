public class Order {

    private int id ; 
    private double cost ; 
    private DiscountStrategy discountStrategy ; 
    private PaymentMethod paymentMethod ;
    
    
    public Order(int id, double cost, DiscountStrategy discountStrategy, PaymentMethod paymentMethod) {
        this.id = id;
        this.cost = cost;
        this.discountStrategy = discountStrategy;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder() {
        double finalCost = discountStrategy.applyDiscount(cost);
        System.out.println("Finall cost after discount: " + finalCost);
        paymentMethod.processPayment(finalCost);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    } 
}
