- State là một interface mà PlayingState, PausedState, và StoppedState triển khai.
- Mỗi Concrete State triển khai phương thức pressPlay, thực hiện hành động cụ thể và chuyển đổi đến trạng thái tiếp theo.
- MP3PlayerContext duy trì một tham chiếu đến trạng thái hiện tại và cung cấp một phương thức pressPlay để chuyển đổi trạng thái.
- Main tạo một instance của MP3PlayerContext, và gọi pressPlay để xem cách trạng thái thay đổi.

<img width="852" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/d056a0de-8e8a-47ca-9926-42fd61f54355">
