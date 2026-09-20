package tuan01.bai01;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        setChieuDai(chieuDai);
        setChieuRong(chieuRong);
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            throw new IllegalArgumentException("Chiều dài phải > 0");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            throw new IllegalArgumentException("Chiều rộng phải > 0");
        }
    }

    public double getDT() {
        return chieuDai * chieuRong;
    }
}
