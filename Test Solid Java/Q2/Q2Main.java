import java.util.ArrayList;

public class Q2Main {

    public static void main(String[] args) {
        
        Car car = new Car();

        car.Drive();
        ( (Car) car ).getPassengerCapacity(); 

        System.out.println("-------------------------");

        Bike bike = new Bike(); 
        bike.Drive();
        ( (Bike) bike ).getPassengerCapacity();

        //------------------------------------
        System.out.println("-------------------------");

        truck Truck = new truck(); 
        Truck.Drive();
        ( (truck) Truck ).GetCargoCapacity();

        // -------------------------------- 2.2 ----------------------------------
        System.out.println("---------------2.2----------");

        ArrayList<IVehicle> vehicles = new ArrayList<>();  // LSP 
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(Truck);
        
        for ( var vehicle : vehicles ) {
            vehicle.GetDescription();
        }
    }


}
