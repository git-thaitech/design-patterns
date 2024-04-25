Mẫu thiết kế **Facade** cung cấp một giao diện đơn giản để tương tác với một hệ thống phức tạp. Trong trường hợp này, có các lớp quản lý khách hàng, đơn hàng và sản phẩm, cùng với một lớp **Order** để biểu diễn thông tin đơn hàng. **ECommerceFacade** đóng vai trò như một điểm tương tác duy nhất giữa hệ thống e-commerce và client, ẩn đi các chi tiết phức tạp và tương tác nội bộ giữa các lớp quản lý khác nhau. Facade giúp đơn giản hóa quá trình sử dụng hệ thống bằng cách giảm thiểu số lượng tương tác và phụ thuộc trực tiếp giữa các phần của mã nguồn.

- **ECommerceFacade.java** cung cấp một giao diện đơn giản để thao tác trên các hệ thống phức tạp hơn phía sau nó, như quản lý đơn hàng và quản lý sản phẩm.
- Các lớp như **CustomerManagementSystem.java**, **OrderManagementSystem.java**, và **ProductManagementSystem.java** đều xử lý nghiệp vụ chi tiết trong từng phần của hệ thống thương mại điện tử.
- **Order.java** đại diện cho một đơn hàng, có chứa thông tin về khách hàng và sản phẩm.
**Client.java** là phần mà người dùng cuối tương tác với hệ thống thông qua facade, đơn giản hóa cách họ sử dụng hệ thống.

<img width="1015" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/0c35f69d-6d93-4705-944b-9b912b2a25be">
