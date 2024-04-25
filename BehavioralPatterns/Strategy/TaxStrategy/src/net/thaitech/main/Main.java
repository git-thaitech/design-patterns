package net.thaitech.main;

public class Main {
    public static void main(String[] args) {
        TaxStrategy consumerTax = new ConsumerTaxStrategy();
        TaxStrategy corporateTax = new CorporateTaxStrategy();
        TaxStrategy importTax = new ImportTaxStrategy();

        System.out.println("Consumer Tax on $100: " + consumerTax.calculateTax(100));
        System.out.println("Corporate Tax on $100: " + corporateTax.calculateTax(100));
        System.out.println("Import Tax on $100: " + importTax.calculateTax(100));
    }
}
