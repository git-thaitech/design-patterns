package net.thaitech.main;

public class CorporateTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.20; // Giả sử thuế doanh nghiệp là 20%
    }
}
