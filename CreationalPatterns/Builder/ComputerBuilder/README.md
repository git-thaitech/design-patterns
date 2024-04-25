- **Computer.java**: Tệp này định nghĩa một lớp Computer với một lớp lồng Builder bên trong. Lớp Builder này là một ví dụ điển hình của mẫu Builder, nơi nó cung cấp các phương thức để thiết lập từng phần của đối tượng Computer (như CPU, RAM, v.v.). Khi tất cả các phần được thiết lập xong, phương thức build() sẽ được gọi để tạo ra đối tượng Computer cuối cùng.
- **Main.java**: Đây là tệp chứa phương thức main, nơi mà mẫu Builder được sử dụng để tạo một đối tượng Computer. Trong ví dụ này, đối tượng Computer được xây dựng với các chi tiết cụ thể như loại CPU, dung lượng RAM, v.v., được chỉ định thông qua chuỗi gọi các phương thức trên Builder.

<img width="1021" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/29d3f427-8f84-455f-b67c-0b8aaf1d44f7">
