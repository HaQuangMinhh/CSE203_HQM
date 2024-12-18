public class Car implements IDrivable , IPassengerCarrier , IVehicle{

    @Override
    public void Drive() {
        System.out.println("Using the Car to drive");
        
    }

    @Override
    public void getPassengerCapacity() {
        System.out.println("Carrying Passengers by car");
        
    }

    @Override
    public void GetDescription() {
        System.out.println("Car is very beautiful");
        
    }

}
