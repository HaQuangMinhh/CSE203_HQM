public class CruiseShip extends Ship {

    private int maxPassengers;


    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }


    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }



    @Override
    public String toString() {
        return "Name: " + getName() + ", Max passengers: " + maxPassengers + " passenger";
    }

    

}
