
import java.util.*;

public class Customer {

    private String Name ; 
    private String Email ; 

    private List<CartItem> Cart ;

    // Constructor
    public Customer(String name, String email) {
        Name = name;
        Email = email;
        Cart = new ArrayList<>() ;
    }

    // AddToCart
    public void addToCart ( CartItem cartItem , int quantity ) {
        // nếu existing 
        for ( CartItem existingItem : Cart ) {
            if ( existingItem.getItem().CompareTwoItem(cartItem.getItem()) ) {
                // if item exists, increase the quantity 
                existingItem.setQuantity(existingItem.getQuantity()+ cartItem.getQuantity());
                System.out.println("Successfully added " + quantity + cartItem.getItem().getName() + " to the cart." );
                return ;
            }
        }
        // if item doesn't exist, add it to the cart
        Cart.add(new CartItem( cartItem.getItem() , quantity));
        System.out.println( "New item: " + cartItem.getItem().getName() + ", Price: " + cartItem.getItem().getPrice()  );
    }

    // Updated
    public void updatedCart ( CartItem item , int newQuantity) {
        for ( CartItem existingItem : Cart ) {
            if ( existingItem.getItem().CompareTwoItem(item.getItem()) ) {
                // Updated the quantity
                existingItem.setQuantity( newQuantity );
                System.out.println("Updated quantity for Mobiles.");
                System.out.println("Sucessfully updated the cart.");
                return ; 
            }
            System.out.println("item " + item.getItem().getName() + " not found in the cart");
        }

    }


    // Checkout 
    public void checkout() {
        if (Cart.isEmpty()) {
            System.out.println("Your cart is empty. Nothing to checkout.");
        } else {
            double total = 0;
            for (CartItem cartItem : Cart) {
                total += cartItem.getTotalPrice();
            }
            System.out.println("Total price for checkout: $" + total);
            Cart.clear();
            System.out.println("Thank you for your purchase! Your cart is now empty.");
        }
    }


    public void getInfor() {
        System.out.println("Customer Information:");
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        if (Cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart contents:");
            for (CartItem cartItem : Cart) {
                System.out.println(cartItem);
            }
        }

    }

    

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<CartItem> getCart() {
        return Cart;
    }

    public void setCart(List<CartItem> cart) {
        Cart = cart;
    }









    

    
    
}
