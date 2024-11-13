import java.util.*;
public class Demo {
    public static void main(String[] args) {
        RetailItem laptop = new RetailItem("Laptop", 1200, 50);
        RetailItem mobile = new RetailItem("Mobile", 450, 10);

        Customer customer = new Customer("Tien Nguyen", "aa@gmail.com");
        System.out.println("----Available RetailItems-----");
        System.out.println(laptop);
        System.out.println(mobile);
        System.out.println("---adding 4 laptop to cart---");
        addToCart(customer, laptop, 4);
        System.out.println("---adding 2 mobile to cart---");
        addToCart(customer, mobile, 2);
        System.out.println("---adding 2 mobile to cart---");
        addToCart(customer, mobile, 2);
        System.out.println("---viewing the cart");
        viewCart(customer);
        System.out.println("---Checking out---");
        checkout(customer);
                
    }

    public static void viewCart(Customer customer) {
        List<CartItem> cart = customer.getCart();
        for (CartItem cartItem : cart) {
            cartItem.getInfo();
        }
    }
    public static void checkout(Customer customer){
        System.out.println("------checking out-------");
        System.out.println("---cart items---");
        List<CartItem> cart = customer.getCart();
        double subTotal = 0;
        for (CartItem cartItem : cart) {
            cartItem.getInfo();
            subTotal += cartItem.getTotalPrice();
        }
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Your checkout code: " + UUID.randomUUID());
    }
   

    public static void addToCart(Customer c, RetailItem retailItem, int quality){
        if(retailItem.purchase(quality)){
            CartItem cartItem = new CartItem(retailItem, quality);
            c.addToCart(cartItem);
            
            
        }
        else{
            System.out.println("not enough");
            
        }
    }
}
