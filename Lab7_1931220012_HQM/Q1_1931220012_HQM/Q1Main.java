
public class Q1Main {

    public static void main(String[] args) {

        // Show logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // check two loggers
        System.out.println("Are both instances in the same:  " + (logger1 == logger2));

        // Write log with different notification 
        logger1.log("Application started");

        logger2.log("User logged successfully");

    }
}
