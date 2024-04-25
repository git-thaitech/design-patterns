- WeatherStation là một Concrete Subject, giữ và quản lý danh sách các Observers (Display objects).
- Display là interface Observer, mà CurrentConditionsDisplay và - - - StatisticsDisplay triển khai để nhận cập nhật từ WeatherStation.
- Khi WeatherStation có sự thay đổi về nhiệt độ, nó sẽ thông báo cho tất cả Observers đã đăng ký. Mỗi Observer cập nhật dữ liệu của mình và hiển thị thông tin mới.
- Main chạy chương trình, tạo WeatherStation, và các Displays, sau đó cập nhật nhiệt độ vài lần.

<img width="843" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/6fffd325-87af-4cdf-9fe2-2e53c268a24f">
