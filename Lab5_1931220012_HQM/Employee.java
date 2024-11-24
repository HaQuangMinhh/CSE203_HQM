public class Employee {

    private int EmployeeId ; 
    private String EmployeeName ;
    
    
    public Employee(int employeeId, String employeeName) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
    }

    
    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    @Override
    public String toString() {
        return "EmployeeId : " + EmployeeId + ", Employee Name: " + EmployeeName ;
    } 


}
