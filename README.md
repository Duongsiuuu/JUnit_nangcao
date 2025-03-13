# JUnit Nâng Cao

Dự án này tập trung vào việc nâng cao kiến thức về việc test trong Java sử dụng JUnit. Bao gồm các kỹ thuật test nâng cao như mock data, test coverage, parameterized tests, v.v.

## Yêu cầu
- Java 8+
- Maven/Gradle
- JUnit 5
- Mockito (nếu cần)

## Cài đặt
1. Clone repository:
   ```sh
   git clone https://github.com/Duongsiuuu/JUnit_nangcao.git
   ```
2. Import vào IDE (IntelliJ IDEA, Eclipse, VS Code,...)
3. Đảm bảo các dependency đã được cài đặt trong `pom.xml` hoặc `build.gradle`

## Cách sử dụng
- Chạy tất cả test:
  ```sh
  mvn test
  ```
- Chạy test cụ thể:
  ```sh
  mvn -Dtest=TenClassTest test
  ```
  Hoặc trong Gradle:
  ```sh
  ./gradlew test --tests "TenClassTest"
  ```

## Tính năng
- Viết test case với JUnit 5
- Dùng Mockito để mock dependencies
- Parameterized tests
- Test coverage với Jacoco
- CI/CD với GitHub Actions (nếu có)

## Góp ý
Mọi ý kiến đóng góp vui lòng tạo pull request hoặc issue trên GitHub.

## License
Dự án được phát hành theo MIT License.

