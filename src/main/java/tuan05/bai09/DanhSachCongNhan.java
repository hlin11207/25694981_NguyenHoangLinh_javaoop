package tuan05.bai09;

public class DanhSachCongNhan {
    private CongNhan[] dscn;
    private int count;


    //Phương thức khởi tạo n phần tử cho lớp DanhSachCongNhan
    public DanhSachCongNhan(int n){
        this.dscn = new CongNhan[n];
        this.count = 0;
    }

    //Phương thức thêm một công nhân vào danh sách, thêm thành công nếu kích thước còn cho phép.
    public boolean themCN(CongNhan cn){
        if (cn == null || count >= dscn.length){
            return false;
        }
        dscn[count] = cn;
        count ++;
        return true;
    }

    //phương thức xuất toàn bộ thông tin nhân viên
    public void inDSCN(){
        if (count == 0){
            System.out.println("Danh sách công nhân hiện đang trống!");
            return;
        } else {
            System.out.println("Danh Sách Công Nhân: ");
            for (int i = 0; i < count; i++) {
                System.out.println(dscn[i].toString());
            }
        }
    }

    //phương thức tính số lượng công nhân trong danh sách
    public int tinhSLCN(){
        return count;
    }

    //phương thức xuất thông tin các công nhân làm trên 200 sản phẩm
    public void xuatTren200(){
        boolean coCongNhan = false;

        System.out.println("--- CÔNG NHÂN LÀM TRÊN 200 SẢN PHẨM ---");
        for (int i = 0; i < count; i++){
            if (dscn[i].getmSoSP() > 200){
                System.out.println(dscn[i].toString());
                coCongNhan = true;
            }
        }
        if (!coCongNhan){
            System.out.println("Không có công nhân nào làm trên 200 sản phẩm.");
        }
    }

    //Phương thức sắp xếp công nhân theo số sản phẩm giảm dần.
    public void sapXepGiamDanTheoSoSP(){
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (dscn[i].getmSoSP() < dscn[j].getmSoSP()){
                    CongNhan temp = dscn[i];
                    dscn[i] = dscn[j];
                    dscn[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách công nhân giảm dần theo số sản phẩm.");
    }
}
