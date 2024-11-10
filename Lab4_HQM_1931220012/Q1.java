import java.time.LocalDate;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee("Minh", "2000", LocalDate.of(2024, 11, 6)) ; 

        System.out.println(employee);
        System.out.println("--------------------------------------------------");
        // Production Worker
        ProductionWorker productionWorker = new ProductionWorker("Minh", "2001",LocalDate.of(2024, 11, 6) , 1 , (double) 5000 );

        System.out.println(productionWorker);
        System.out.println("--------------------------------------------------");

        double sallaryAnnually = 7000000 ;

        ShiftSupervisor shiftSupervisor = new ShiftSupervisor("Minh2", "2000", LocalDate.of(2024, 11, 6), sallaryAnnually , (double) 500.000 );
        System.out.println(shiftSupervisor);

        System.out.println("--------------------------------------------------");

        // Team Leader
        TeamLeader teamLeader = new TeamLeader("Minh", "2001",LocalDate.of(2024, 11, 6) , 1 , (double) 5000 , 480.100 , 6 , 3);

        System.out.println(teamLeader);

        System.out.println("--------------------------------------------------");
        // Essay Class

        

    }

}
