
public class Q6Main {

    public static void main(String[] args) {

        IDrivable car = new Car();
        IDrivable truck = new Truck();
        IDrivable bike = new Bike();

        car.drive();
        ((Car) car).carryPassenger();

        System.out.println("----------------------------");
        truck.drive();
        ((Truck) truck).carryCargo();

        System.out.println("----------------------------");
        bike.drive();
        ((Bike) bike).carryPassenger();

    }

}
