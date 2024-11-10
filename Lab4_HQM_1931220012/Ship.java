public class Ship {

    private String Name ; 
    private String Year ;
    
    
    

    public Ship(String name, String year) {
        Name = name;
        Year = year;
    }


    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getYear() {
        return Year;
    }
    public void setYear(String year) {
        Year = year;
    }



    @Override
    public String toString() {
        return "Name: " + Name + " , Year: " + Year ;
    } 


}
