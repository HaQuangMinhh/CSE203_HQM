public class NewsAgency extends Subject {

    public void publishNews ( String news ) {
        System.out.println("NewsAgency published: " + news);
        notifySubscriber(news);
    }

}
