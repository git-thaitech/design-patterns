package net.thaitech.main;

public class ImportTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.15; // Giả sử thuế nhập khẩu là 15%
    }
}
