package vn.edu.javaoop.bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        if (maHang != null && !maHang.trim().isEmpty()) {
            this.maHang = maHang;
        } else {
            this.maHang = "000";
            System.out.println("ERROR: Ma hang khong duoc de rong!");
        }
        setTenHang(tenHang);
        setDonGia(donGia);

        LocalDate now = LocalDate.now();
        if (ngaySanXuat != null && !ngaySanXuat.isAfter(now)) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = now;
        }

        if (ngayHetHan != null && !ngayHetHan.isBefore(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }

    public HangThucPham(String maHang) {
        this(maHang, "xxx", 0.0, LocalDate.now(), LocalDate.now());
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null && !tenHang.trim().isEmpty()) {
            this.tenHang = tenHang;
        } else {
            this.tenHang = "xxx";
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat != null && !ngaySanXuat.isAfter(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan != null && !ngayHetHan.isBefore(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        }
    }

    public boolean isHetHan() {
        return ngayHetHan.isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00VND");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ghiChu = isHetHan() ? "Hang het han" : "";

        return String.format("%-10s %-12s %20s %15s %15s %15s", maHang, tenHang, df.format(donGia),
                dtf.format(ngaySanXuat), dtf.format(ngayHetHan), ghiChu);
    }
}
