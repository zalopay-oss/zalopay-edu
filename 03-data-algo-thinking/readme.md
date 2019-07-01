# Data structures and algorithms

![](media/algos.jpg)


- [Data structures and algorithms](#data-structures-and-algorithms)
	- [1. Giới thiệu](#1-giới-thiệu)
		- [1.1 Mục tiêu](#11-mục-tiêu)
		- [1.2 Hình thức](#12-hình-thức)
		- [1.3 Báo cáo](#13-báo-cáo)
	- [2 Khái niệm](#2-khái-niệm)
		- [2.1 Cấu trúc dữ liệu](#21-cấu-trúc-dữ-liệu)
		- [2.2 Design Pattern](#22-design-pattern)
		- [2.3 Nguyên tắc lập trình](#23-nguyên-tắc-lập-trình)
	- [3. Bài tập](#3-bài-tập)
		- [3.1 Predictive text](#31-predictive-text)
		- [3.2 Hash Tables](#32-hash-tables)
		- [3.3 Tính thời gian xử lý khiếu nại](#33-tính-thời-gian-xử-lý-khiếu-nại)
	- [4. Tham khảo](#4-tham-khảo)

<!-- /code_chunk_output -->

## 1. Giới thiệu 

### 1.1 Mục tiêu

- Cung cấp kiến thức về lập trình.
- Củng cố nền tảng về cấu trúc dữ liệu và giải thuật.
- Làm quen với các design pattern phổ biến.
- Nắm vững nguyên lý lập trình cơ bản.
- Làm quen với Java (dùng Intellij và tạo project [Maven](Maven.md))

### 1.2 Hình thức

- Keyword: Định hướng cách thức nghiên cứu lý thuyết, viết report.
- Bài tập: Định hướng cách thực hành, sử dụng giải thuật cơ bản.
- Đồ án: Kết hợp giữa lý thuyết và thực hành để xây dựng một sản phẩm hoàn chỉnh.
- Module này thang điểm đánh giá là **10**.
- Mức điểm đánh giá:
    - `<= 6`: Chưa đạt, cần cải thiện kiến thức.
    - `>= 7`: Nắm được kiến thức và ứng dụng được.

### 1.3 Báo cáo

- Tạo repo cá nhân chứa note và code liên quan.
- Thời gian: `2 tuần`

## 2 Khái niệm

### 2.1 Cấu trúc dữ liệu

![DAS](https://cdn-images-1.medium.com/max/1024/1*9QRFQdpO2f59GsN2KsE9XA.png)

- `Probabilistic data structures` có tính chất thế nào? Nêu cách thức hoạt động của `Bloom Filters`, `Cuckoo Filters`, `Count Min Sketch`, `HyperLogLog`).
- `Trie` là gì? Ứng dụng như thế nào?

### 2.2 Design Pattern

![z](https://i0.wp.com/jasonroell.com/wp-content/uploads/2015/03/timthumb-php_.png?fit=620%2C310&ssl=1)

- Nêu 5 design pattern hay dùng (Dependency Injection, Factory, Singleton, Builder, ...)
- Code minh họa cho từng design pattern.

### 2.3 Nguyên tắc lập trình

![good](https://4.bp.blogspot.com/-VDVOIvGZx3s/WbK0fF3N0UI/AAAAAAAAeVU/JfxyN7avbloCcoR9C3I0Npj2etJKumBZgCLcBGAs/s1600/become-a-good-programmer.jpg)

Tìm hiểu các nguyên tắc sau:

- `SOLID`
- `DRY`
- `KISS`
- `YAGNI`
- Do the simplest thing that could possibly work

`Clean code` là gì? Nêu ít nhất 5 cách để clean code?


## 3. Bài tập

### 3.1 Predictive text

Cho dataset [Blog Authorship Corpus](https://github.com/niderhoff/nlp-datasets).

Làm chương trình Java cung cấp 2 tính năng:

- Kiểm tra 1 từ có nằm trong dataset không? 
- Gợi ý những từ giống với từ **input** mà có trong dataset (gần giống như cách Google instant search gợi ý). Sự gần giống giữa các từ do em tự định nghĩa nhưng phải hợp lý.

**Yêu cầu**:

- Phải hiện thực ít nhất `2 cách` với tính năng kiểm tra từ tồn tại.
- Tìm cách tối ưu chương trình với các cấu trúc dữ liệu mà em đã học được ở trên.
- `Benchmark` cho phần kiểm tra từ.
- Sử dụng ít nhất `2 design pattern`.
- `Không được import lib` có sẵn(được `copy source` hiện thực nhưng sẽ có hỏi về cách hoạt động).
- Phần gợi ý phải gợi ý `ít nhất 5` từ gần giống với input đầu vào.
- Tự định nghĩa cách hiện `output`.
- Nhớ viết chương trình như một `Good Programmer`

**Tip**: Nên định nghĩa 1 interface là `Dictionary` với method `public boolean contains(String word)` để implement lại.

### 3.2 Hash Tables

- Tham khảo [repo sau](https://github.com/jamesroutley/write-a-hash-table).
- Viết lại hoàn toàn bằng Java một hash table tương tự.
- Hiện thực ít nhất 3 cách giải quyết đụng độ.

### 3.3 Tính thời gian xử lý khiếu nại

Hiện tại, bộ phần CS(Customer Service) sẽ nhận các khiếu nại từ người dùng và trả lời các khiếu nại đó. Để người dùng không phải chờ câu trả lời quá lâu, chúng ta phải đảm bảo người dùng sẽ nhận câu trả lời trong thời gian tối đa là 8 tiếng làm việc. Vì vậy, cần một chương trình tính `thời gian từ lúc nhận khiếu nại đến khi khiếu nại được giải quyết` để biết bộ phận CS làm việc có hiệu quả.

Giờ làm việc được tính từ `8h30` tới `12h` với buổi sáng và `13h30` đến `18h` với buổi chiều. CS sẽ làm nguyên ngày từ thứ 2 đến thứ 6, riêng thứ 7 sẽ chỉ làm buổi sáng.

Trong folder `ticket-sla` là 1 project java đã được `init` sẵn. Bạn hãy hiện thực hàm `calculate` ở class `SlaServiceImpl`. Sau đó, các bạn thêm testcase trong `SlaServiceTest` để kiểm tra tính đúng sai của hàm đã viết.

`Lưu ý`:

- Đây là 1 bài toán thực tế nên không có bất kì giới hạn nào.
- Nếu có bất kì thắc mắc nào, vui lòng liên hệ `thinhda`.
- `Benchmark` cho hàm `calculate`.

## 4. Tham khảo

- [Principles of Good Programming](https://www.artima.com/weblogs/viewpost.jsp?thread=331531)
- [Programming Principles](https://github.com/webpro/programming-principles#avoid-premature-optimization)
- [Clean code](https://gitlab.zalopay.vn/zalopay-freshers/onboarding/tree/master/books/tech/skills)
- [Series 4 bài về Probabilistic data structures của Andrii Gakhov](https://www.slideshare.net/gakhov/presentations).
- [Awesome Algo](https://github.com/tayllan/awesome-algorithms).
- [Cracking the Coding Interview: 150 Programming Questions and Solutions](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/098478280X).
- [Data Structures and Algorithms in Java (2nd Edition)](https://www.amazon.com/Data-Structures-Algorithms-Java-2nd/dp/0672324539).
- [jupyter](jupyter.md)
