package net.thaitech.main;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // Không áp dụng giảm giá
    }
}
