public abstract class Employee {

    private String Name;

    public Employee(String name) {
        Name = name;
    }

    public abstract double calculatePay();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
