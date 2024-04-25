- **PaymentService.java**: Định nghĩa một giao diện PaymentService cho các dịch vụ thanh toán khác nhau.
- **CreditCardPaymentService.java** và **PaypalPaymentService.java**: Cung cấp các lớp cụ thể thực thi giao diện PaymentService, đại diện cho các dịch vụ thanh toán qua thẻ tín dụng và PayPal.
- **PaymentServiceFactory.java**: Đây là lớp factory thực thi logic để tạo ra các đối tượng PaymentService cụ thể tùy thuộc vào các tham số đầu vào, như loại thanh toán.
- **Main.java**: Sử dụng PaymentServiceFactory để tạo ra các dịch vụ thanh toán và gọi các phương thức thanh toán, minh họa cách sử dụng Factory Method để tạo các đối tượng một cách linh hoạt.

<img width="1019" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/5426492b-ead3-4773-b87c-057abda9581d">
