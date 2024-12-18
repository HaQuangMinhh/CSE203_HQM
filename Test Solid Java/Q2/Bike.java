public class Bike implements IDrivable , IPassengerCarrier, IVehicle {
    @Override
    public void Drive() {
        System.out.println("Using the Bike to drive");
        
    }

    @Override
    public void getPassengerCapacity() {
        System.out.println("Carrying Passengers by Bike");
    }

    @Override
    public void GetDescription() {
        System.out.println("Bike is highly nice");
        
    }
    


}
