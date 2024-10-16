
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Address: ");
        String address = sc.nextLine();

        System.out.println("Phone number:  ");
        String phone = sc.nextLine();

        Customer customer = new Customer(name, address, phone);

        System.out.println("==========================================================");
        System.out.println(customer.toString());
        System.out.println("==========================================================");

        // Car
        Car car = new Car();
        car.setMake("Ford");
        car.setModelCar("Camry");
        car.setRentalPeriod(7);
        car.setMileageLimit(295.55);

        String carInfor = "Make: " + car.getMake() + "\nModel Car: " + car.getModelCar() + "\nRental Period: "
                + car.getRentalPeriod() + "\nMileage Limit: " + car.getMileageLimit();

        System.out.println("==========================================================");
        System.out.println(carInfor);
        System.out.println("==========================================================");

        // Rental Agreement
        RentalAgreement rentalAgreement = new RentalAgreement(); 

        System.out.println("Base Rental Fee:  ");
        double rentalFee = sc.nextDouble();
        rentalAgreement.setBaseRentalFee( rentalFee );

        System.out.println("Mileage Fee:  ");
        double mileageFee = sc.nextDouble();
        rentalAgreement.setMileageFee(mileageFee);

        // System.out.println("Tax Rate: ");
        // double taxRate = sc.nextDouble(); 
        // rentalAgreement.setTaxRate( taxRate );
        
        double TotalCost = rentalAgreement.calculateTotalCost();

        String rentalInfor = "Base Rental Fee: " + rentalAgreement.getBaseRentalFee() 
        + "\nMileage Fee: " + rentalAgreement.getMileageFee() 
        + "\nTax rate: " + rentalAgreement.getTaxRate()
        + "\nTotal Cost: " +  TotalCost ;

        System.out.println(rentalInfor);
        

    }

}
