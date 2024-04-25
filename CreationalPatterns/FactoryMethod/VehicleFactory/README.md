- Các lớp như **BicycleFactory**, **CarFactory**, và **TruckFactory** đều thực thi giao diện **VehicleFactory** và định nghĩa cách tạo các đối tượng cụ thể như **Bicycle**, **Car**, và **Truck**.
- Lớp Vehicle là một giao diện hoặc lớp trừu tượng mô tả một phương tiện nói chung.
- Mỗi lớp cụ thể như **Bicycle**, **Car**, và **Truck** thực thi hoặc kế thừa **Vehicle** để định nghĩa các đặc tính riêng của chúng.
- Trong **Main.java**, các factory cụ thể được sử dụng để tạo các đối tượng phương tiện mà không cần biết chi tiết về lớp cụ thể được tạo ra.

<img width="1019" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/71b444cd-1489-44b1-ab1e-075aabcaad46">
