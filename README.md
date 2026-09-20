# 25694981_NguyenHoangLinh_javaoop

Project được sắp xếp theo cấu trúc Maven chuẩn, phục vụ các bài tập Java OOP theo từng tuần.

## Cấu trúc tổng quát

```text
src/
├── main/
│   └── java/
│       └── java/
│           ├── tuan01/
│           │   └── baiXX/
│           ├── tuan02/
│           │   └── baiXX/
│           └── tuanXX/
│               └── baiXX/
└── test/
    └── java/
        └── java/
            ├── tuan01/
            │   └── baiXX/
            ├── tuan02/
            │   └── baiXX/
            └── tuanXX/
                └── baiXX/
```

- Mã nguồn chính được đặt trong `src/main/java`.
- Mỗi bài tập được tổ chức theo tuần và số bài, ví dụ: `java/tuan01/bai01`.
- Các bài kiểm thử tương ứng được đặt trong `src/test/java`.
- Khi thêm bài mới, tạo thư mục theo mẫu:
  - `src/main/java/java/tuanXX/baiYY`
  - `src/test/java/java/tuanXX/baiYY`

Danh sách class cụ thể trong từng bài sẽ được cập nhật riêng khi bài tập hoàn thành.

## Yêu cầu môi trường

- Java 17
- Maven 3.8+

## Lệnh build/test

```bash
mvn compile
mvn test
```
