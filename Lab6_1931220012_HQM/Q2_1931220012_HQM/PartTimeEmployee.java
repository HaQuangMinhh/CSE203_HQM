public class PartTimeEmployee extends Employee {

    private double HourlySalary;
    private double HoursWorked;

    public PartTimeEmployee(String name, double hourlySalary, double hoursWorked) {
        super(name);
        HourlySalary = hourlySalary;
        HoursWorked = hoursWorked;
    }

    public double getHourlySalary() {
        return HourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        HourlySalary = hourlySalary;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return HourlySalary * HoursWorked;
    }

    @Override
    public String toString() {
        return "Part Time Employee: " + " with the hours rate: " + HourlySalary + ", Hours worked : " + HoursWorked
                + ", total: " + calculatePay();
    }

}
