
public class Bike implements IDrivable, IPassengerCarrier {

    @Override
    public void drive() {
        System.out.println("Driving the bike");
    }

    @Override
    public void carryPassenger() {
        System.out.println("Carrying passenger through the bike ");
    }

}
