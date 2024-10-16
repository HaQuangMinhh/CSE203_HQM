package Lab2.Problem1;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("User input your name: ");
        String name = sc.nextLine();
        
        System.out.println("Your address: ");
        String address = sc.nextLine(); 

        System.out.println("Your phone: ");
        String phone = sc.nextLine(); 

        Customer customer = new Customer(name , address , phone); 

        System.out.println( customer );
        System.out.println("==========================================");


                // C2 set cứng 
        // customer.setName("Han Van Lam");
        // customer.setAddress("Tran Hung Dao Street");
        // customer.setPhone("0572247855241");

        // String infor = "Customer: " + customer.getName() + ",Address: " + customer.getAddress() + ",Phone: " + customer.getPhone();

        // System.out.println( infor );


        // PET 
        Pet pet = new Pet();

        pet.setBreed("Gold");
        pet.setAge(20);
        pet.setWeight(25.9);
        
        String petInfor = "Breed: " + pet.getBreed() + ", Age: " + pet.getAge() + " year, Weight: " + pet.getWeight();

        System.out.println(petInfor);
        System.out.println("================================================");


        // Service 

        Service service = new Service() ; 
        service.setCareCharges(500) ; 
        service.setGroomingService(90); 

        // TAX = 5%

        double salesTax = 0.05 ; 
        String serviceInfor = "Care Charges: " + service.getCareCharges() + "\nGrooming Service: " + service.getGroomingService() + "\nTax (5%): " + salesTax + "\nTotal ( with tax ): " + service.getTotalCost()  ; 

        System.out.println(serviceInfor);




    }

}
