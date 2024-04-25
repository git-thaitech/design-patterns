- **OldPaymentSystem.java** có lẽ định nghĩa một hệ thống thanh toán cũ mà không tương thích với hệ thống mới.
- **PaymentAdapter.java** là adapter chuyển đổi giao diện của hệ thống thanh toán cũ để có thể làm việc với hệ thống mới.
- **PaymentGateway.java** có thể là interface hoặc lớp trừu tượng định nghĩa cách thức hoạt động của một gateway thanh toán hiện đại.
- **Client.java** là phần của mã sử dụng adapter để tương tác với hệ thống thanh toán cũ như thể nó là một phần của hệ thống mới.

<img width="1014" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/2302131b-6099-477f-afb4-74a566c34186">

