public class MainBai10 {

    public static void main(String[] args) {
        Ship ship = new Ship("Minh pro", "2025"); 
        
        CruiseShip cruiseShip = new CruiseShip("hehe", "1980", 6000);

        CargoShip cargoShip = new CargoShip("hihi", "1988", 800000);

        // Ta gán vào mảng 
        Ship[] shipArray = new Ship[3];
        shipArray[0] = ship ; 

        shipArray[1] = cruiseShip ;
        shipArray[2] = cargoShip ;
        
        for ( Ship show : shipArray ) {
            System.out.println( show );
        }


    }
}
