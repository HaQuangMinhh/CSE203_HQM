package Lab2.Problem4;

import java.util.*;
import java.time.LocalDate; // Import thư viện LocalDate

import Lab2.Problem1.Customer;
public class Main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Customer 
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

        // Photographer 

        Photographer photographer = new Photographer();

        photographer.setSession("wedding");
        photographer.setSessionDuration(3);
        photographer.setDate( LocalDate.of(2024, 12 , 16) );

        String photographerInfor = "Session: " + photographer.getSession() + "\nSession Duration: " + photographer.getSessionDuration() + " months" + "\nDate: " + photographer.getDate() ; 

        System.out.println("=============================================");
        System.out.println(photographerInfor);
        System.out.println("=============================================");


        // Confirmation 
        Confirmation confirmation = new Confirmation(); 

        System.out.println("Session Fee: ");
        double baseSessionFee = sc.nextDouble();
        confirmation.setBaseSessionFee(baseSessionFee);

        System.out.println("Editting Charges: ");
        double edittingCharges = sc.nextDouble(); 
        confirmation.setEdittingCharges(edittingCharges);

        double totalCost = confirmation.calculateTotalCost();

        String confirmationInfor = "Session Fee: " 
        + confirmation.getBaseSessionFee() 
        + "\nEditting Charges: " + confirmation.getEdittingCharges() 
        + "\nTax Rate: " + confirmation.getSalesTax() 
        + "\nTotal Cost: " + totalCost ;

        System.out.println("=============================================");
        System.out.println(confirmationInfor);
        System.out.println("=============================================");


        

    }


}
