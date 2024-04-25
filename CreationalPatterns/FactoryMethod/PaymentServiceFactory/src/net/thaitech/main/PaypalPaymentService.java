package net.thaitech.main;

//CreditCardPaymentService.java (Concrete Implementation)
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
