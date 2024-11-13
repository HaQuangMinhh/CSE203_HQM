package Solution;
import java.util.*;

public class Customer {
    
    private String Name ; 
    private String Email ; 
    private List<CartItem> cart ;
    
    
    public Customer( String name, String email ) {
        Name = name;
        Email = email;
        this.cart = new ArrayList<>() ;
    }

    public void addToCart( CartItem cartItem  ) {
        for ( CartItem cartItemInCart : cart ) {
            
            if ( cartItemInCart.compareTwoItem(cartItem) ) {
                updateCart(cartItem, cartItemInCart.getQuantity() + cartItem.getQuantity() );
                cartItemInCart.setQuantity( cartItemInCart.getQuantity() + cartItem.getQuantity() );
            
                System.out.println("Updated quantity for " + cartItem.getRetailItem().getName() );
                System.out.println("Successfully updated the cart");
                return ; 
            }
        }
        cart.add(cartItem);
        System.out.println("Successfully added " + cartItem.getQuantity() +" " +cartItem.getRetailItem().getName() + " to the cart ");
    }


    public void updateCart ( CartItem cartItem , int newQuantity  ) {
        for ( CartItem cartItemInCart : cart ) {
            if ( cartItemInCart.equals(cartItem) ) {
                cartItemInCart.setQuantity(newQuantity);
                System.out.println("Successfully updated the cart");
            }
        }
    }

    public void viewCart() {
        for( CartItem cartItem : cart ) {
            cartItem.getInfor();
        }

    }

    public boolean removeFromCart ( CartItem cartItem ) {
        return cart.remove(cartItem);
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
        return cart;
    }
    public void setCart(List<CartItem> cart) {
        this.cart = cart;
    }

    


}
