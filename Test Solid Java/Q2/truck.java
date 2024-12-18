public class truck implements IDrivable , ICargoCarrier, IVehicle {

    @Override
    public void Drive() {
        System.out.println("Using the truck to drive");
        
    }

    @Override
    public void GetCargoCapacity() {
        System.out.println("Carrying Cargo Capacity by truck");
        
    }

    @Override
    public void GetDescription() {
        System.out.println("Truck is very beautiful");
    }


}
