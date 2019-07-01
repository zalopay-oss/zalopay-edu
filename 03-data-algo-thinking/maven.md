## Giới thiệu về Maven

[Apache Maven](https://maven.apache.org/) là một công cụ quản lý dự án phần mềm dựa trên khái niệm về project object model (POM) kèm theo một build lifecycle framework hoàn chỉnh.

Maven hỗ trợ developer quản lý các vấn đề sau của một dự án:

- Build.
- Documentation.
- Reporting.
- Dependencies.
- SCMs.
- Releases.
- Distribution.
- Mailing list.

Nói ngắn gọn, Maven đơn giản và chuẩn hóa quy trình build một project. Cấu trúc thư mục của một project Maven nên được bố trí như sau:

| **Item**           | **Default**                   |
| ------------------ | ----------------------------- |
| Source code        | ${basedir}/src/main/java      |
| Resources          | ${basedir}/src/main/resources |
| Tests              | ${basedir}/src/test           |
| Complied byte code | ${basedir}/target             |
| Distributable JAR  | ${basedir}/target/classes     |

## Cài đặt

Tham khảo ở [đây](https://www.tutorialspoint.com/maven/maven_environment_setup.htm). Nếu bạn sử dụng `Intellij` thì đã có plugin Maven được tích hợp sẵn.

Cách sử dụng Maven plugin trong Intellij ở [đây](https://www.youtube.com/watch?v=pt3uB0sd5kY).

## Maven - POM

POM (viết tắt của Project Object Model) chứa đựng thông tin về project và chi tiết cấu hình khác để build project. Một số cấu hình có thể quy định trong POM như sau:

- project dependencies
- plugins
- goals
- build profiles
- project version
- developers
- mailing list

Tham khảo thêm ở [đây](https://www.tutorialspoint.com/maven/maven_pom.htm).

## Build Lifecycle

Maven Build Lifecycle là một chuỗi các giai đoạn, quy định thứ tự các goal được thực thi. Hướng dẫn cơ bản tham khảo ở [đây](https://www.tutorialspoint.com/maven/maven_build_life_cycle.htm).

## Tham khảo

- [Apache Maven](https://maven.apache.org/).
- [Maven Tutoralspoint](https://www.tutorialspoint.com/maven).