package Lab2.Problem2;

import java.time.LocalDate;
import java.util.*;

import Lab2.Problem1.Customer;

public class Main {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = sc.nextLine(); 

        System.out.println("Your address: ");
        String address = sc.nextLine(); 

        System.out.println("Your phone: ");
        String phone = sc.nextLine(); 

        Customer customer = new Customer(name, address, phone);

        System.out.println("=============================================");
        System.out.println(customer);
        System.out.println("=============================================");



        // PriceQuote 
        PriceQuote priceQuote = new PriceQuote();
        
        priceQuote.setCostIngredients(5.96);
        priceQuote.setLaborCharges(500.30);

        double totalCost = priceQuote.calculateTotalCost(); 
        
        String priceInfor = "Ingredients cost: " + priceQuote.getCostIngredients() 
        + "\nLabor Charges: " + priceQuote.getLaborCharges() 
        + "\nDelivery Fee: " + priceQuote.getDeliveryFee() 
        + "\nTax Sales: " + priceQuote.getSalesTax() 
        + "\nTotal Cost: " + totalCost ;   
        

        System.out.println("=============================================");
        System.out.println( priceInfor );
        System.out.println("=============================================");


        // Baker
        Baker baker = new Baker();

        System.out.println("Type Cake: ");
        String typeCake = sc.nextLine();
        baker.setTypeCake(typeCake); 

        System.out.println("Tier numbers: ");
        int numTiers = sc.nextInt(); 
        baker.setNumTiers(numTiers);

        baker.setEvenDate( LocalDate.of(2024, 11, 29) );

        String bakerInfor = "Type Cake: " + baker.getTypeCake() + "\nTier numbers: " + baker.getNumTiers() + "\nEvent date: " + baker.getEvenDate() ; 
        
        System.out.println("=============================================");
        System.out.println(bakerInfor);
        System.out.println("=============================================");

         

        

    }


}
