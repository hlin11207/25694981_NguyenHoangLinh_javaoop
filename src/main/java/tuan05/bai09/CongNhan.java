package tuan05.bai09;

public class CongNhan {
    //khai báo thuộc tính
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP; //số sản phẩm > 0

    //constructor

    public CongNhan(String ma, String ten, int soSP) { //phương thức khởi tạo mặc định
        this.maCN = 1;
        this.mHo = "Chưa biết";
        this.mTen = "Chưa biết";
        this.mSoSP = 1;
    }

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP) throws Exception {    //phương thức khởi tạo đầy đủ
        setMaCN(maCN);
        setmHo(mHo);
        setmTen(mTen);
        setmSoSP(mSoSP);
    }
    //getter and setter


    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) throws Exception {
        if (maCN > 0){
            this.maCN = maCN;
        } else {
            throw new Exception("Lỗi: Mã công nhân không được nhỏ hơn 0!");
        }
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) throws Exception {
        if (mHo != null && !mHo.trim().isEmpty()) {
            this.mHo = mHo;
        } else {
            throw new Exception("Lỗi: Họ/Tên công nhân không được để trống");
        }
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) throws Exception {
        if (mTen != null && !mTen.trim().isEmpty()) {
            this.mTen = mTen.trim();
        } else {
            throw new Exception("Lỗi: Họ/Tên công nhân không được để trống!");
        }
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) throws Exception {
        if (mSoSP > 0) {
            this.mSoSP = mSoSP;
        } else {
            throw new Exception("Lỗi: Số sản phẩm phải lớn hơn 0!");
        }
    }


    public double tinhLuong(){
        if (getmSoSP() >= 1 && getmSoSP() <=199){
            return getmSoSP() * 0.5;
        } else if (getmSoSP() < 400) {
            return getmSoSP() * 0.55;
        } else if (getmSoSP() < 600) {
            return getmSoSP() * 0.6;
        } else {
            return getmSoSP() * 0.65;
        }
    }
    //phương thức trả vể toString


    @Override
    public String toString() {
        return "CongNhan[ " +
                "maCN=" + this.maCN +
                ", mHo='" + this.mHo + '\'' +
                ", mTen='" + this.mTen + '\'' +
                ", mSoSP=" + this.mSoSP +
                " ]";
    }
}


