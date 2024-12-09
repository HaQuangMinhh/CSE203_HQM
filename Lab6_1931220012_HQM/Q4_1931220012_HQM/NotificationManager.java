public class NotificationManager  {
    private INotificationService NotificationService ;

    // Constructor injection: Dependency is passed in the constructor
    public NotificationManager (INotificationService notificationService) {
        NotificationService = notificationService ; 
    }

    public void sendMessge (String message ) {
        NotificationService.send(message);
    }
    
}
