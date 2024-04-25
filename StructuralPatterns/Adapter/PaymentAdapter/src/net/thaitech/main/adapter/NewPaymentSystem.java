package net.thaitech.main.adapter;

public class NewPaymentSystem implements PaymentGateway {
    @Override
    public void pay(String amount) {
        System.out.println("Paying " + amount + " using New Payment System.");
    }
}
