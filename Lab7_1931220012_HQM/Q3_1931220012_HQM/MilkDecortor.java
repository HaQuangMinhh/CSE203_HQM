
public class MilkDecortor extends CoffeeDecorator {

    public MilkDecortor(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5; // thêm 1.5 cho sữa
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " + Mlik";
    }

}
