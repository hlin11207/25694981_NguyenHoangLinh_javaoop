# 25694981_NguyenHoangLinh_javaoop

Project đã được sắp xếp lại theo cấu trúc Maven chuẩn, giữ nguyên mục đích các bài tập Java OOP.

## Cấu trúc theo tuần

- Tuần 1 — Bài 1 (hình học): `src/main/java/vn/edu/javaoop/tuan01/bai01`
  - `HinhChuNhat`, `HinhChuNhatDemo`, `HinhTron`, `HinhTronDemo`, `ToaDo`
- Tuần 2 — Bài 2 (sinh viên): `src/main/java/vn/edu/javaoop/tuan02/bai02`
  - `SinhVien`, `SinhVienDemo`
- Tuần 3 — Bài 5 (hàng thực phẩm): `src/main/java/vn/edu/javaoop/tuan03/bai05`
  - `HangThucPham`, `HangThucPhamDemo`
- Test tương ứng đặt tại:
  - `src/test/java/vn/edu/javaoop/tuan01/bai01`
  - `src/test/java/vn/edu/javaoop/tuan02/bai02`
  - `src/test/java/vn/edu/javaoop/tuan03/bai05`

## Hướng dẫn thêm bài mới

Khi thêm bài ở tuần tiếp theo, tạo theo mẫu:

- `src/main/java/vn/edu/javaoop/tuan04/baiXX`
- `src/test/java/vn/edu/javaoop/tuan04/baiXX`

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
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.tuan01.bai01.HinhChuNhatDemo"
```

Chạy demo hình tròn:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.tuan01.bai01.HinhTronDemo"
```

Chạy demo sinh viên:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.tuan02.bai02.SinhVienDemo"
```

Chạy demo hàng thực phẩm:

```bash
mvn -q exec:java -Dexec.mainClass="vn.edu.javaoop.tuan03.bai05.HangThucPhamDemo"
```
