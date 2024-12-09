public class Q4Main {

    public static void main(String[] args) {
        
        //Email
        INotificationService emailService = new EmailService(); 
        NotificationManager notificationManager = new NotificationManager(emailService);

        notificationManager.sendMessge("Message via email");

        // SMS
        INotificationService smsService = new SMSService();
        notificationManager = new NotificationManager(smsService); 

        notificationManager.sendMessge("Message via SMS");

        // Push 
        INotificationService push = new PushNotificationService();
        notificationManager = new NotificationManager(push);

        notificationManager.sendMessge("Message via push");
 
    }

}
