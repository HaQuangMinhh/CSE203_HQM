public class Main {

    public static void main(String[] args) {
        // Khi bạn theo dõi một kênh tin tức, bất cứ khi nào có bài viết mới, bạn sẽ nhận được thông báo.

        NewsAgency newsAgency = new NewsAgency(); 

        Observer email = new EmailSubscriber() ; 
        Observer sms = new SMSSubscriber() ; 

        newsAgency.addObserver(email);
        newsAgency.addObserver(sms);

        newsAgency.publishNews("Breaking News!");

        System.out.println("---------------------------------------");
        //  Test method 
        Subject subject = new Subject() ; 

        subject.addObserver(email);
        subject.addObserver(sms);

        // Check notify Observer
        System.out.println("Update observers: ");
        subject.notifySubscriber("Test ne");

        // Check removeObserver
        subject.removeObserver(sms);
        System.out.println("After removing Email");
        subject.notifySubscriber("Second test ");;


    }
}
