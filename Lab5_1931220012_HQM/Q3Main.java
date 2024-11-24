public class Q3Main {
    

    public static void main(String[] args) {
        
        Employee Minh = new Employee(1, "Minh");
        Employee Duy = new Employee(2, "Duy"); 
        Employee Tuan = new Employee(3, "Tuan");

        EmployeeMap employeeMap = new EmployeeMap() ; 

        System.out.println("-----------------Add Employee----------------");
        employeeMap.addEmployee(Minh);
        employeeMap.addEmployee(Duy);
        employeeMap.addEmployee(Tuan);

        System.out.println("-------------Search Employee----------------");
        
        Employee result = employeeMap.findEmployeeById(5); 
        System.out.println(result);


        employeeMap.removeEmployeeById(1);; 
        
    }


}
