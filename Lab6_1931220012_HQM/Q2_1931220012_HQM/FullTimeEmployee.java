public class FullTimeEmployee extends Employee {

    private double Salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        Salary = salary;
    }

    @Override
    public double calculatePay() {
        return Salary; // return Full salary cố định
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Full Time Employee : " + "Name : " + getName() + ", Salary: " + Salary + ", total: " + calculatePay();
    }

}
