import java.time.LocalDate;

public class TeamLeader extends ProductionWorker {

    private double BonusMonthly ; 
    private double TrainingHours ; 
    private double AttendedTrainingHours ;
    
    private ProductionWorker productionWorker ;
    
    public TeamLeader(String name, String number, LocalDate hireDate, int shift, Double payRate, double bonusMonthly,
            double trainingHours, double attendedTrainingHours) {
        super(name, number, hireDate, shift, payRate);
        BonusMonthly = bonusMonthly;
        TrainingHours = trainingHours;
        AttendedTrainingHours = attendedTrainingHours;
    }

    @Override
    public String toString() {
        FriendlyString convert = new FriendlyString();

        String friendlyStringShift = convert.getfriendlyStringShift( 2 ); 

        return "Name: " + getName() + " , Number: " + getNumber() + " , Day: " + getHireDate() + " , Shift: " + friendlyStringShift + " , Pay rate: "  + getPayRate() + ", Amount bonus monthly: " + BonusMonthly + " , Training hours: " + TrainingHours + "Attended Training Hours: " + AttendedTrainingHours ; 
    } 

    
    public double getBonusMonthly() {
        return BonusMonthly;
    }
    public void setBonusMonthly(double bonusMonthly) {
        BonusMonthly = bonusMonthly;
    }
    public double getTrainingHours() {
        return TrainingHours;
    }
    public void setTrainingHours(double trainingHours) {
        TrainingHours = trainingHours;
    }
    public double getAttendedTrainingHours() {
        return AttendedTrainingHours;
    }
    public void setAttendedTrainingHours(double attendedTrainingHours) {
        AttendedTrainingHours = attendedTrainingHours;
    }




    
}
