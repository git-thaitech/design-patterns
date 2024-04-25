package net.thaitech.main.client;

import net.thaitech.main.adapter.OldPaymentSystem;
import net.thaitech.main.adapter.PaymentAdapter;
import net.thaitech.main.adapter.PaymentGateway;
import net.thaitech.main.adapter.NewPaymentSystem;

public class Client {
    public static void main(String[] args) {
        PaymentGateway oldPaymentViaAdapter = new PaymentAdapter(new OldPaymentSystem());
        oldPaymentViaAdapter.pay("100");

        PaymentGateway newPaymentSystem = new NewPaymentSystem();
        newPaymentSystem.pay("150");
    }
}
