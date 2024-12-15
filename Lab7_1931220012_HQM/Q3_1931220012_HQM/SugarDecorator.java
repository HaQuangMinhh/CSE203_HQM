
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {

        return super.getCost() + 2.5; // thêm 2.5 cho sugar
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Sugar";
    }

}
