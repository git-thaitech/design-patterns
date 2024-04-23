package net.thaitech.factorymethod;

//PaymentServiceFactory.java (Factory Class)
public class PaymentServiceFactory {
    public static PaymentService getPaymentService(String type) {
        switch (type) {
            case "credit":
                return new CreditCardPaymentService();
            case "paypal":
                return new PaypalPaymentService();
            default:
                throw new IllegalArgumentException("Unknown payment type " + type);
        }
    }

    public static void main(String[] args) {
        PaymentService service = PaymentServiceFactory.getPaymentService("credit");
        service.processPayment(100.0);

        service = PaymentServiceFactory.getPaymentService("paypal");
        service.processPayment(200.0);
    }
}
