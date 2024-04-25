- NewsAgency là một Concrete Subject, giữ danh sách các Subscriber.
- Subscriber là interface Observer, mà EmailSubscriber triển khai để nhận cập nhật từ NewsAgency.
- Khi NewsAgency có tin tức mới, nó sẽ thông báo cho tất cả các Subscriber đã đăng ký. Mỗi Subscriber cập nhật dữ liệu của mình và hiển thị thông tin mới.
- Main chạy chương trình, tạo NewsAgency, và các EmailSubscriber, sau đó cập nhật tin tức.
<img width="627" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/64d1cc19-8569-45d9-9e14-402941d9c1fd">
