package net.thaitech.main.client;

import net.thaitech.main.adapter.*;

public class Client {
    public static void main(String[] args) {
        // Khởi tạo hệ thống thanh toán cũ
        OldPaymentSystem oldSystem = new OldPaymentSystem();

        // Sử dụng adapter để chuyển đổi giao diện
        PaymentGateway paymentGateway = new PaymentAdapter(oldSystem);

        // Thực hiện thanh toán bằng giao diện mới
        paymentGateway.pay("100");
    }
}
