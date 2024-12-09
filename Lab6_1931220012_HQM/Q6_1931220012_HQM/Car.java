
public class Car implements IDrivable, IPassengerCarrier {

    @Override
    public void drive() {
        System.out.println("Driving the car, hehe");
    }

    @Override
    public void carryPassenger() {
        System.out.println("The car carries more Passengers");
    }

}
