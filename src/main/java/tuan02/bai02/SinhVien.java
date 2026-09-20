package tuan02.bai02;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this(1, "chưa có", 0.0f, 0.0f);
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        setMaSV(maSV);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        if (maSV > 0) {
            this.maSV = maSV;
        } else {
            throw new IllegalArgumentException("Lỗi: Mã Sinh viên phải lớn hơn 0!");
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        } else {
            this.hoTen = "";
        }
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0.0f && diemLT <= 10.0f) {
            this.diemLT = diemLT;
        } else {
            throw new IllegalArgumentException("Lỗi: Nhập điểm trong khoảng (0.0-10.0)!");
        }
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        if (diemTH >= 0.0f && diemTH <= 10.0f) {
            this.diemTH = diemTH;
        } else {
            throw new IllegalArgumentException("Lỗi: Nhập điểm trong khoảng (0.0-10.0)!");
        }
    }

    public double getDiemTB() {
        return (getDiemLT() + getDiemTH()) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-30s %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, getDiemTB());
    }
}
