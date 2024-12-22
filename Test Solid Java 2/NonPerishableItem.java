
public class NonPerishableItem extends Item  {

    public NonPerishableItem(String name, int quantity, Float price) {
        super(name, quantity, price);
    }


    @Override
    public void getDescription() {

        System.out.println("Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice()  );
    }




}
