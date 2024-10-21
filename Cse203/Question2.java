
import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user to create availably
        RetailedItem item = new RetailedItem("Jacket", 12, 59.95);

// User input 
        System.out.println("User input the quantity: ");
        int quantity = sc.nextInt();

        // show Units on hand trong vỏ item 
        System.out.println("Quantity in Units On Hand : " + item.getUnitsOnHand());

        // check condition
        if (quantity < item.getUnitsOnHand()) {
            CashRegister cashRegister = new CashRegister(item, quantity);

            System.out.println(cashRegister);

        } else {
            System.out.println("We don't enough items in Units On Hand");
        }

    }

}
