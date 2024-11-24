
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = sc.nextLine();

        // split
        String[] words = name.split("\\s+");

        Set<String> eachWord = new HashSet<String>();

        for (var show : words) {
            eachWord.add(show);
        }

        System.out.println("Unique Words in ascending order: ");
        for (var show : eachWord) {
            System.out.print(show + " ");
        }

    }

}
