package net.thaitech.main;

public class Ticket {
    private double basePrice;
    private DiscountStrategy discountStrategy;

    public Ticket(double price, DiscountStrategy strategy) {
        this.basePrice = price;
        this.discountStrategy = strategy;
    }

    public double getPrice() {
        return discountStrategy.applyDiscount(basePrice);
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }
}
