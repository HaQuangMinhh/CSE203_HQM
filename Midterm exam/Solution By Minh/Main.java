package Solution;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 

        RetailItem laptop = new RetailItem("Laptop", (double)1200, 50);
        RetailItem mobile = new RetailItem("Mobile", (double) 450, 10); 

        System.out.println("----Available RetailItems-----");
        System.out.println(laptop);
        System.out.println(mobile);

        System.out.println("-------Adding 4 Laptops to Cart------------");
        int quantity1 = 4 ; 
        laptop.restock(quantity1);
        System.out.println(laptop);
        
        System.out.println("-------Adding 2 Mobiles to Cart------------");
        int quantity2 = 2 ;
        mobile.restock(quantity2);
        System.out.println(mobile);

        System.out.println("-----------------------------------------------------");
        // Equals 
        RetailItem computer = new RetailItem("Computer", ( double )550, 600);

        System.out.println(laptop.compareTwoItem(computer));

        System.out.println("-----------------------------------------------------");
        // CartItem Class
        CartItem computer1 = new CartItem(computer, 400);
        CartItem anotherItem = new CartItem(mobile, 250); 

        computer1.getInfor();
        System.out.println("-----------------------------------------------------");
        System.out.println(anotherItem.compareTwoItem(computer1));
        System.out.println("-----------------------------------------------------");

        // Total Price 
        System.out.println(anotherItem.getTotalPrice());
        System.out.println("-----------------------------------------------------");

        // Customer Class

        Customer customer1 = new Customer("Minh Ha", "hehe@gmail.com");
        
        // Test các hàm trong Customer 

        // Tạo thêm để test hàm customer
        RetailItem retailItem1 = new RetailItem("Macbook", 450.0, 123);
        RetailItem retailItem2 = new RetailItem("Macbook Pro", 890.0, 100);

        // Thêm các sản phẩm vào giỏ hàng 
        CartItem cartItem1 = new CartItem(retailItem1, 400);
        CartItem cartItem2 = new CartItem(retailItem2, 200);

        // Use add To Cart 
        customer1.addToCart(cartItem1);
        customer1.addToCart(cartItem2);

        // System Out
        System.out.println("Customer's cart: ");
        customer1.viewCart();

        System.out.println("==========================================================================");
        
        // Updated to Cart
        customer1.updateCart(cartItem1, 100);
        System.out.println("Updated Quantity of customer: " );
        customer1.viewCart();
        
        System.out.println("==========================================================================");
        
        // Remove cả cái 
        // customer1.removeFromCart(cartItem1);
        // customer1.removeFromCart(cartItem2);
        // customer1.viewCart();
        System.out.println("==========================================================================");

        // added lại 
        customer1.addToCart(cartItem1);
        customer1.addToCart(cartItem2);

        System.out.println("==========================================================================");
        // Xóa tên thôi 
        if ( customer1.removeFromCart(cartItem1)) {
            System.out.println("Successfully remove item: " + retailItem1.getName() );
        } else {
            System.out.println("Failed remove this item.");
        }

        System.out.println("==========================================================================");
        customer1.viewCart();

        System.out.println("==========================================================================");
        
        // Trở lại bài tập theo lộ trình 
        // Add to Cart
        Customer customer2 = new Customer("Minh Ha 2", "vippro@gmail.com");

        System.out.println("-----------------------Adding 4 Laptops to Cart---------------------");
        addToCart(customer2, laptop , 4 );
        
        System.out.println("-----------------------Adding 2 Mobiles to Cart---------------------");
        addToCart(customer2, mobile , 2 );

        System.out.println("-----------------------Adding 2 more mobiles to Cart----------------");
        addToCart(customer2, mobile , 2);


        System.out.println("----------Viewing Cart-----------------");
        viewCart(customer2);


        System.out.println("-------Checking out------------");
        System.out.println("-------------Checout Summary---------------");
        checkOut(customer2);
        








    }

    public static void checkOut ( Customer customer) {
        List<CartItem> cart = customer.getCart(); 
        double subTotal = 0 ; 
        for ( CartItem cartItem : cart ) {
            cartItem.getInfor();
            subTotal += cartItem.getTotalPrice1();
        }
        System.out.println("Subtotal: " + subTotal);
    }


    public static void addToCart ( Customer cus , RetailItem retailItem , int quantity ) {
        if ( retailItem.purchase(quantity) ) {
            CartItem cartItem = new CartItem(retailItem, quantity);
            cus.addToCart(cartItem);
        }
    }

    public static void viewCart (Customer customer ) {
        System.out.println("Your Cart: ");
        List<CartItem> cart = customer.getCart() ; 
        
        for ( CartItem cartItem : cart ) {
            cartItem.getInfor();
        }
    }

   



}
