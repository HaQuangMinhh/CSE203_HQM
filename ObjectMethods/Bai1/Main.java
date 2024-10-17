package Bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> studentList = new ArrayList<>(); 

        studentList.add(new Student("1", "Minh", 10 )); 
        studentList.add(new Student("2", "Hoang", 50)); 

        // Calculate average score in students 
        double sum = 0 , count = 0 ; 

        for (Student student : studentList) {
            sum += student.getScore(); 
        }
        double Avg = sum / studentList.size(); 
        System.out.println("Avg: " + Avg);

        // Find the name of student who has the highest score 
        Student highestStudent = studentList.get(0);


        for ( Student student : studentList ) {
            if ( student.getScore() > highestStudent.getScore() ) {
                highestStudent = student ; 
            }
        }

        System.out.println("The student with the highest score: " + highestStudent.getName() 
        + "\nWith the name: " + highestStudent.getScore() );


    }


}
