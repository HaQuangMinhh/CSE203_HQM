
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;

    private Logger() {
        // resources
    }

    // method get instance 
    public static Logger getInstance() {
        if (instance == null) {
            // Nếu chưa có thể hiện nào, tạo mới
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages with a timestamp
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + message);
    }

}
