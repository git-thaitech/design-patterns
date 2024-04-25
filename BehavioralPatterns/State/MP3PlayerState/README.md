- State là một interface mà PlayingState, PausedState, và StoppedState (Concrete State) triển khai.
- Mỗi Concrete State triển khai phương thức pressPlay, pressStop thực hiện hành động cụ thể và chuyển đổi đến trạng thái tiếp theo.
- MP3PlayerContext duy trì một tham chiếu (một object State ở property) đến trạng thái hiện tại và cung cấp một phương thức pressPlay để chuyển đổi trạng thái.
- Main tạo một instance của MP3PlayerContext, và gọi pressPlay, pressStop để xem cách trạng thái thay đổi.

<img width="777" alt="image" src="https://github.com/git-thaitech/design-patterns/assets/72333463/4940e9d1-a636-4e09-ac7b-16c119318c10">
