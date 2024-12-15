
public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00; // thêm 3.5 là Whipped Cream
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Whipped Cream";
    }

}
