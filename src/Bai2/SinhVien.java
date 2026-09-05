package Bai2;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;
    //contructors
    public SinhVien(){
        this(1, "chưa có", 0.0f, 0.0f);
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        setMaSV(maSV);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }
    //getter setter

    public int getMaSV() {
        return this.maSV;
    }

    public void setMaSV(int maSV) {
        if (maSV > 0){
            this.maSV = maSV;
        } else {
            throw new IllegalArgumentException("Lỗi: Mã Sinh viên phải lớn hơn 0!");
        }
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        if (hoTen != null && !hoTen.trim().isEmpty()){
            this.hoTen = hoTen;
        } else {
            this.hoTen = "";
        }
    }

    public float getDiemLT() {
        return this.diemLT;
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0.0 && diemLT <= 10.0){
            this.diemLT = diemLT;
        } else {
            throw new IllegalArgumentException("Lỗi: Nhập điểm trong khoảng (0.0-10.0)!");
        }
    }

    public float getDiemTH() {
        return this.diemTH;
    }

    public void setDiemTH(float diemTH) {
        if (diemTH >= 0.0 && diemTH <= 10.0){
            this.diemTH = diemTH;
        } else {
            throw new IllegalArgumentException("Lỗi: Nhập điểm trong khoảng (0.0-10.0)!");
        }
    }
    //hàm tính trung bình
    public double getdiemTB(){
        return (getDiemLT()+getDiemTH())/2;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-30s %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, getdiemTB());
    }
}
