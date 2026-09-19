# 25694981_NguyenHoangLinh_javaoop

Project đã được sắp xếp lại theo cấu trúc Maven chuẩn, giữ nguyên mục đích các bài tập Java OOP.

## Cấu trúc

- `src/main/java/vn/edu/javaoop/bai01`: bài hình học (`HinhChuNhat`, `HinhTron`, `ToaDo`) và demo.
- `src/main/java/vn/edu/javaoop/bai02`: bài `SinhVien` và demo.
- `src/main/java/vn/edu/javaoop/bai05`: bài `HangThucPham` và demo.
- `src/test/java`: test đơn vị tối thiểu.

## Ghi chú về ToaDo

Repository hiện tại không có `ToaDo.java` trong lịch sử có thể khôi phục. Vì vậy đã bổ sung implementation tối thiểu tương thích với cách dùng trong `HinhTron`:
- `new ToaDo(String, double, double)`
- `getTen()`

## Yêu cầu môi trường

- Java 17
- Maven 3.8+

## Lệnh build/test

```bash
mvn compile
mvn test
```

## Chạy demo

Chạy demo hình chữ nhật:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.bai01.HinhChuNhatDemo"
```

Chạy demo hình tròn:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.bai01.HinhTronDemo"
```

Chạy demo sinh viên:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.bai02.SinhVienDemo"
```

Chạy demo hàng thực phẩm:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.bai05.HangThucPhamDemo"
```
