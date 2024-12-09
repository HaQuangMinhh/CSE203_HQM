public class SMSService implements INotificationService {

    @Override
    public void send(String message) {
        System.out.println("SMS sending: " + message);
    }

}
