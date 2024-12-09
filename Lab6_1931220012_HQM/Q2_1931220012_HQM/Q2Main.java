import java.util.ArrayList;

public class Q2Main {

    public static void main(String[] args) {

        // Liskov Substitution Principle yêu cầu rằng các lớp con phải có khả năng thay
        // thế lớp cha mà không làm gián đoạn tính đúng đắn của chương trình.

        Employee fullTimeEmployee1 = new FullTimeEmployee("MinhVip", 5000000);

        System.out.println(fullTimeEmployee1);

        Employee partTimeEmployee2 = new PartTimeEmployee("MinhPro", 30000, 10);

        System.out.println(partTimeEmployee2);

        // Method 2 LSP 
        ArrayList<Employee> employeeList = new ArrayList<>() ; 
        employeeList.add(fullTimeEmployee1); 
        employeeList.add(partTimeEmployee2); 

        for ( var employee : employeeList ) {
            System.out.println("Name: " + employee.getName() + ", " + employee.calculatePay() ); 
        }

    }

}
