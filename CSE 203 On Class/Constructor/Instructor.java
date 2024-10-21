public class Instructor {
    private String name;
    private String officeRoom;
    public Instructor(String name, String officeRoom) {
        this.name = name;
        this.officeRoom = officeRoom;
    }
    public Instructor(Instructor tInstructor) {
        this.name = tInstructor.name;
        officeRoom = tInstructor.officeRoom;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOfficeRoom() {
        return officeRoom;
    }
    public void setOfficeRoom(String officeRoom) {
        this.officeRoom = officeRoom;
    }
    @Override
    public String toString() {
        return "Instructor [name=" + this.getName() + ", officeRoom=" + officeRoom + "]";
    }
    
    
}
