package net.thaitech.main;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers;
    private String news;

    public NewsAgency() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifySubscribers();
    }
}
