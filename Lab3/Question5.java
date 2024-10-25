import java.util.Scanner;

public class Question5 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        // input from user's cars
        // System.out.println("input the make:");
        // String make = sc.nextLine();

        // System.out.println("input the model: ");
        // String model = sc.nextLine();

        // System.out.println("input the color: ");
        // String color = sc.nextLine();

        // System.out.println("input the license number ");
        // String licenseNumber = sc.nextLine();

        // System.out.println("input the parked minutes");
        // int minutesParked = sc.nextInt();

        // ParkedCar car = new ParkedCar(make, model, color, licenseNumber, minutesParked) ; 

        // Set cứng 
        // Set xe đã đỗ 120 phút
        ParkedCar car = new ParkedCar("Toyota", "Camry", "Red", "XYZ123", 121); 

        // create hàm đã mua minutes from ParkingMeter
        ParkingMeter parkingMeter = new ParkingMeter(60);

        // Create a police man
        PoliceOfficer policeOfficer = new PoliceOfficer("Tuan", "hehe111" );

        // Check xe and đã mua minutes if vượt thì phạt
        ParkingTicket parkingTicket = policeOfficer.checkCar(car, parkingMeter);

        // Out the information
        if ( parkingTicket != null ) {
            System.out.println( "Car :" + "\n" + parkingTicket.getPackedCarInfor() );

            // Fine nhiu 
            System.out.println("Fine : " + parkingTicket.getFine() );
            
            // Xử lí bởi ai 
            System.out.println("Resolve by: " + parkingTicket.getOfficerName()  +" with " + parkingTicket.getOfficerBadge() );

        } else {
            System.out.println("No ticket, yeah");
        }
        

    }

}
