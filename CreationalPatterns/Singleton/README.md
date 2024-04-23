# Singleton Pattern

## Giới thiệu
Mẫu thiết kế Singleton là một mẫu thiết kế phần mềm được sử dụng để đảm bảo một lớp chỉ có một thể hiện duy nhất, và cung cấp một điểm truy cập toàn cục đến thể hiện đó. Điều này là hữu ích trong các trường hợp nơi bạn cần đảm bảo rằng chỉ có một đối tượng được tạo ra, để kiểm soát các tài nguyên chung, như kết nối cơ sở dữ liệu hoặc cài đặt cấu hình của ứng dụng.

## Mục đích sử dụng
Mẫu Singleton thường được sử dụng để quản lý các nguồn tài nguyên chia sẻ, như:
- Kết nối cơ sở dữ liệu.
- Cấu hình toàn cục của ứng dụng.
- Bộ nhớ cache chung.

## Lợi ích khi sử dụng Singleton
### Đảm bảo duy nhất
Singleton đảm bảo rằng một lớp chỉ có một thể hiện, giúp tránh tạo đối tượng không cần thiết hoặc lặp lại.

### Truy cập toàn cục
Singleton cung cấp một điểm truy cập toàn cục đến thể hiện của nó, làm cho việc quản lý và truy cập vào các nguồn tài nguyên chung trở nên thuận tiện hơn.

### Quản lý tài nguyên hiệu quả
Việc sử dụng một thể hiện duy nhất cho phép các ứng dụng tiết kiệm tài nguyên và cải thiện hiệu suất bằng cách tránh tải tài nguyên nhiều lần.

## Các bước để tạo một lớp Singleton
1. **Khởi tạo biến thể hiện duy nhất**: Tạo một biến `private static` để lưu trữ thể hiện duy nhất của lớp.
2. **Ẩn constructor của lớp**: Đặt constructor của lớp thành `private` để ngăn việc tạo thể hiện mới từ bên ngoài lớp.
3. **Tạo phương thức truy cập**: Cung cấp một phương thức `public static` để truy cập thể hiện duy nhất của lớp. Phương thức này kiểm tra xem thể hiện đã được tạo hay chưa trước khi trả về nó.
4. **Xử lý tình huống đa luồng (nếu cần thiết)**: Đảm bảo rằng phương thức truy cập là thread-safe, sử dụng kỹ thuật khóa hoặc khởi tạo kép.

## Ví dụ
Dưới đây là một ví dụ về cách tạo một lớp Singleton trong Java:
```java
public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Code khởi tạo kết nối cơ sở dữ liệu
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
