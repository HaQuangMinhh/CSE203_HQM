import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Available  Retail Items ------------");
        RetailItem item1 = new RetailItem("1. Laptop", (double) 1200, 50);
        RetailItem item2 = new RetailItem("2. Mobile", (double) 450, 10);

        System.out.println(item1);
        System.out.println(item2);

        System.out.println("--------------------------------------------------");
        // Show Quantity in Item
        System.out.println("Quantity in Stock: " + item1.getQuantityInStock() );
        
        System.out.println("User input quantity, you purchase: ");
        int quantity1 = sc.nextInt();

        // check condition 
        if ( item1.purchase( quantity1 ) ) {
            System.out.println("Quantity purchased: " + quantity1);
        } else {
            System.out.println("purchase failed");
        }

        // Show lại còn bao nhiu 
        System.out.println("The item remaining: " + item1.getQuantityInStock());

        System.out.println("--------------------------------------------------");
        // Restock
        System.out.println("User input quantity, you restock: ");
        int quantity2 = sc.nextInt();

        item1.restock(quantity2);
        System.out.println(item1);

        System.out.println("--------------------------------------------------");
        
        // Equals ( between two item available )
        // if ( item1.equals(item2) ) {
        //     System.out.println("item1 and item2 are equal");
        // } else {
        //     System.out.println("item1 and item2 are not equal");
        // }

        // Equals ( RetailItem anotherItem )
        RetailItem anotherItem = new RetailItem("3. Smart Mobile", 500.0, 50);

        System.out.println("item 1 compared with another Item: " + item1.CompareTwoItem(anotherItem));
        System.out.println("--------------------------------------------------");


        // Class 2 : CartItem 
        CartItem cartItem1 = new CartItem(item1, 90);
        CartItem cartItem2 = new CartItem(item2, 110);

        // Equals 
        System.out.println("cartItem1 with cartItem2: " + cartItem1.equals(cartItem2) );

        System.out.println("--------------------------------------------------");
        
        // Get total Price 
        System.out.println(cartItem1);
        System.out.println(cartItem2);

        System.out.println("--------------------------------------------------");

        // Class customer
        Customer customer = new Customer("Minh", "hehe@123");

        customer.addToCart(cartItem1, 4);
        customer.addToCart(cartItem2, 2);

        
        System.out.println(customer);
        System.out.println("--------------------------------------------------");

        customer.updatedCart(cartItem2, 400);

        System.out.println(customer);

        customer.getInfor();

    }
}
