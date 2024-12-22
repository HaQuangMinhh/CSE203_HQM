public class TimeSlot {

    private String StartTime ; 
    private String EndTime ;
    
    public TimeSlot(String startTime, String endTime) {
        StartTime = startTime;
        EndTime = endTime;
    }





    
    public String getStartTime() {
        return StartTime;
    }
    public void setStartTime(String startTime) {
        StartTime = startTime;
    }
    public String getEndTime() {
        return EndTime;
    }
    public void setEndTime(String endTime) {
        EndTime = endTime;
    }


    @Override
    public String toString() {
        return StartTime + " - " + EndTime  ; 
    } 
}
