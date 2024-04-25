package net.thaitech.main;

public class SeniorDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.85; // Giảm giá 15%
    }
}
