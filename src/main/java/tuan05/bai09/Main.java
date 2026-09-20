package tuan05.bai09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //khởi tạo danh sách
        System.out.println("Nhập sức chứa tối đa của danh sách công nhân: ");
        int n = Integer.parseInt(sc.nextLine());
        DanhSachCongNhan ds = new DanhSachCongNhan(n);

        int chon;
        do {
            System.out.println("======QUẢN LÝ CÔNG NHÂN======");
            System.out.println("1. Thêm một công nhân");
            System.out.println("2. Xuất toàn bộ thông tin công nhân");
            System.out.println("3. Tính số lượng công nhân hiện tại");
            System.out.println("4. Xuất công nhân làm trên 200 sản phẩm");
            System.out.println("5. Sắp xếp giảm dần theo số sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                chon = -1; // Gán giá trị không hợp lệ để vào nhánh default
            }

            switch (chon){
                case 1:
                    try {
                        System.out.print("Nhập mã công nhân: ");
                        int ma = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập họ: ");
                        String ho = sc.nextLine();
                        System.out.print("Nhập tên(tên lót(nếu có)): ");
                        String ten = sc.nextLine();
                        System.out.print("Nhập số sản phẩm: ");
                        int soSP = Integer.parseInt(sc.nextLine());

                        // Khởi tạo đối tượng dựa trên dữ liệu vừa nhập
                        CongNhan cn = new CongNhan(ma, ho, ten, soSP);

                        if (ds.themCN(cn)) {
                            System.out.println("=> Thêm công nhân thành công!");
                        } else {
                            System.out.println("=> Thêm thất bại (Danh sách đã đầy)!");
                        }
                    } catch (Exception e) {
                        System.out.println("=>Lỗi: Dữ liệu nhập vào không hợp lệ!");
                    }
                    break;

                case 2:
                    ds.inDSCN();
                    break;
                case 3:
                    System.out.println("=>Số lượng công nhân hiện tại " + ds.tinhSLCN());
                    break;
                case 4:
                    ds.xuatTren200();
                    break;
                case 5:
                    ds.sapXepGiamDanTheoSoSP();
                    break;
                case 0:
                    System.out.println("=> Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chọn lại!");
            }
        } while (chon != 0);

        sc.close();
    }
}
