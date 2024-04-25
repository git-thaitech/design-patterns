- **OldPaymentSystem.java** có lẽ định nghĩa một hệ thống thanh toán cũ mà không tương thích với hệ thống mới.
- **PaymentAdapter.java** là adapter chuyển đổi giao diện của hệ thống thanh toán cũ để có thể làm việc với hệ thống mới, nó triển khai từ PaymentGateway.java
- **NewPaymentSystem.java** cũng triển khai bằng PaymentGateway.java, nhưng đã tương thích interface nên không cần adapter.
- **PaymentGateway.java** có thể là interface hoặc lớp trừu tượng định nghĩa cách thức hoạt động của một gateway thanh toán hiện đại.
- **Client.java** là phần của mã sử dụng adapter để tương tác với hệ thống thanh toán cũ như thể nó là một phần của hệ thống mới.

<img width="544" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/e5cfc626-de56-4c8f-907c-2b106370023f">


