public class PushNotificationService implements INotificationService {

    @Override
    public void send(String message) {
        System.out.println("Push Notification: " + message);
    }

}
