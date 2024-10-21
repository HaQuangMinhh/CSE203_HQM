public class Course {
    private Instructor instructor;
    private String id;
    private double fee;
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Course(Instructor instructor, String id) {
        this.instructor = instructor;
        this.id = id;
    }

    public Instructor getInstructor() {
        // return instructor;
        return new Instructor(instructor);
    }
    
}
