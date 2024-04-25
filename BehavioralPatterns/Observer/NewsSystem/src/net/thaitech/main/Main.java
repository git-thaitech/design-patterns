package net.thaitech.main;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        new EmailSubscriber("Alice", newsAgency);
        new EmailSubscriber("Bob", newsAgency);

        newsAgency.setNews("Breaking News: Java Design Patterns Simplified!");
    }
}
