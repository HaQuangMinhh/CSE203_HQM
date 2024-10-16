package Lab2.Problem2;

import java.time.LocalDate;

public class Baker {

    private String typeCake ; 
    private int numTiers ; 
    private LocalDate evenDate ; 

    public Baker() {}

    
    public String getTypeCake() {
        return typeCake;
    }
    public void setTypeCake(String typeCake) {
        this.typeCake = typeCake;
    }
    public int getNumTiers() {
        return numTiers;
    }
    public void setNumTiers(int numTiers) {
        this.numTiers = numTiers;
    }
    public LocalDate getEvenDate() {
        return evenDate;
    }
    public void setEvenDate(LocalDate evenDate) {
        this.evenDate = evenDate;
    } 

    

}
