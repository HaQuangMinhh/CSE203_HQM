
public class Q3Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        // add milk , sugar , whipped cream
        coffee = new MilkDecortor(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        // In mô tả + giá 
        System.out.println(" Description: " + coffee.getDescription());

        System.out.println("Price: " + coffee.getCost());

    }
}
