package net.thaitech.main;

public class EmailSubscriber implements Subscriber {
    private String name;

    public EmailSubscriber(String name, NewsAgency newsAgency) {
        this.name = name;
        newsAgency.addSubscriber(this);
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
