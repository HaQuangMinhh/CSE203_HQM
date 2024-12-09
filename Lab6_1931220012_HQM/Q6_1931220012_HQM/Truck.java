
public class Truck implements IDrivable, ICargoCarrier {

    @Override
    public void drive() {
        System.out.println("Driving the truck");
    }

    @Override
    public void carryCargo() {
        System.out.println("Carrying cargo through truck");
    }

}
