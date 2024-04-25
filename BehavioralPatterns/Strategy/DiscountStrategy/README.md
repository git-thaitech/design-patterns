Interface Strategy
Interface TaxStrategy định nghĩa một phương thức calculateTax(double income). Đây là phương thức mà tất cả các chiến lược cụ thể phải triển khai để tính toán thuế dựa trên thu nhập đầu vào. Interface này cho phép bạn sử dụng nhiều chiến lược giảm giá khác nhau một cách linh hoạt mà không cần sửa đổi code sử dụng các chiến lược đó.

Concrete Strategies
Mỗi lớp Concrete Strategy như ConsumerTaxStrategy, CorporateTaxStrategy, và ImportTaxStrategy triển khai TaxStrategy interface và cung cấp một phiên bản cụ thể của phương thức calculateTax. Đây là những chi tiết của từng chiến lược:

ConsumerTaxStrategy: Áp dụng một mức thuế tiêu dùng cụ thể, ví dụ 10% của thu nhập.
CorporateTaxStrategy: Áp dụng một mức thuế doanh nghiệp, ví dụ 20% của thu nhập.
ImportTaxStrategy: Áp dụng một mức thuế nhập khẩu, ví dụ 15% của thu nhập.
Mỗi chiến lược này được định nghĩa để xử lý các tình huống thuế khác nhau, cho phép TaxCalculator thích nghi với các yêu cầu thuế mà không cần thay đổi nội dung của nó.

Context (TaxCalculator)
TaxCalculator đóng vai trò là context. Nó giữ một tham chiếu đến TaxStrategy và có thể thay đổi chiến lược của nó tại thời điểm chạy. Context không tính toán thuế trực tiếp mà ủy thác nhiệm vụ này cho chiến lược thuế mà nó giữ. Điều này được thực hiện thông qua phương thức calculateTax, nó chỉ đơn giản là gọi phương thức calculateTax của chiến lược hiện tại.