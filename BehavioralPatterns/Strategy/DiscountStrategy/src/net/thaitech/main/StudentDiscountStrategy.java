package net.thaitech.main;

public class StudentDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // Giảm giá 20%
    }
}
