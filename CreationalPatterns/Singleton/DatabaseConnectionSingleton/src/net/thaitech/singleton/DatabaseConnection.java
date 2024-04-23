package net.thaitech.singleton;

public class DatabaseConnection {
    // Khởi tạo một biến instance kiểu private static
    private static DatabaseConnection instance;

    // Constructor private để không cho phép khởi tạo từ bên ngoài lớp
    private DatabaseConnection() {
        // Giả sử đây là code để thiết lập kết nối cơ sở dữ liệu
        System.out.println("Database Connection Initialized");
    }

    // Phương thức public static để truy cập thể hiện duy nhất của lớp
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Phương thức để mô phỏng thao tác trên cơ sở dữ liệu
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

    // Main method để kiểm tra
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("INSERT INTO users (name) VALUES ('Alice')");

        System.out.println(db1 == db2); // Chứng minh db1 và db2 là cùng một instance
    }
}
