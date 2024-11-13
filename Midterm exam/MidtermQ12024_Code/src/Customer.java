import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<CartItem> cart;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        cart = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public List<CartItem> getCart() {
        return cart;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCart(List<CartItem> cart) {
        this.cart = cart;
    }

    public void addToCart(CartItem cartItem){
        for (CartItem cartItemInCart : cart) {
            if(cartItemInCart.equals(cartItem)){
                updateItemQuality(cartItem, cartItemInCart.getQuality() + cartItem.getQuality());
                return;
            }
        }
        cart.add(cartItem);
        System.out.println("added to the cart");
    }
    public boolean removeFromCart(CartItem cartItem){
        return cart.remove(cartItem);
    }
    public void viewCart() {
        for (CartItem cartItem : cart) {
            cartItem.getInfo();
        }
    }
    public void updateItemQuality(CartItem cartItem, int newQuantity){
        for (CartItem cartItemInCart : cart) {
            if(cartItemInCart.equals(cartItem)){
                cartItemInCart.setQuality(newQuantity);
                System.out.println("Updated quality");
            }
                
        }
    }
    
    
    
}
