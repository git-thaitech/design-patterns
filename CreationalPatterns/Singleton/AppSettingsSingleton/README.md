- Tệp **AppSettings.java** triển khai mẫu thiết kế **Singleton**. Mẫu này đảm bảo rằng chỉ có một thể hiện duy nhất của lớp **AppSettings** được tạo ra trong suốt vòng đời của chương trình.
- Lớp này sẽ có một trường tĩnh để tham chiếu đến thể hiện duy nhất và cung cấp một phương thức tĩnh **getInstance()** để truy cập thể hiện này.
- Phương thức **getInstance()** kiểm tra xem thể hiện đã tồn tại hay chưa, nếu chưa, nó sẽ tạo một thể hiện mới. Điều này đảm bảo rằng mọi lời gọi đến **getInstance()** đều trả về cùng một đối tượng, và do đó, tất cả các phần của mã có thể chia sẻ và sử dụng một cấu hình chung.

<img width="1017" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/aafb2c46-0fae-4200-b48c-0a64bd11dc22">
