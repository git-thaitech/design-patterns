package net.thaitech.main.adapter;

public class PaymentAdapter implements PaymentGateway {
    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void pay(String amount) {
        oldPaymentSystem.makePayment(amount);
    }
}
