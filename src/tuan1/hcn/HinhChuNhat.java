package tuan1.hcn;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    //dong goi
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double cD)throws Exception {
        if (cD > 0) {
            this.chieuDai = cD;
        } else {
            throw new Exception("cd  > 0");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    //khoi tao ham

    public HinhChuNhat(double cD, double chieuRong) throws Exception{
        if(cD > 0){
            this.chieuDai = cD;
        } else {
            throw new Exception("cd > 0");
        }
        this.chieuRong = chieuRong;
    }
    public HinhChuNhat(){

    }
    public double getDT(){
        return this.chieuDai * this.getChieuRong();
    }

    public static void main(String[] args) throws Exception {
    //khoi tao doi tuong
        HinhChuNhat h1 = new HinhChuNhat(3, 6);
    //xuat thong tin
        System.out.println("Chieu dai hinh chu nhat:"+h1.getChieuDai());
        System.out.println("Chieu rong hinh chu nhat:"+h1.getChieuRong());
        System.out.println("Dien tich hcn: "+h1.getDT());
    }
}


