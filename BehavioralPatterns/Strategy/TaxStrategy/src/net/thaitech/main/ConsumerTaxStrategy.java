package net.thaitech.main;

public class ConsumerTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.10; // Giả sử thuế tiêu dùng là 10%
    }
}
