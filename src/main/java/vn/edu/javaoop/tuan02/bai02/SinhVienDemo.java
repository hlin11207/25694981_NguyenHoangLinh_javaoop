package vn.edu.javaoop.tuan02.bai02;

import java.util.Scanner;

public class SinhVienDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(25694981, "Nguyễn Hoàng Linh", 10.0f, 10.0f);
        SinhVien sv2 = new SinhVien(25691872, "Trần Huy Khánh", 7.0f, 8.0f);
        SinhVien sv3 = new SinhVien();

        System.out.println("Nhập mã số sinh viên của sinh viên sv3:");
        int maSV = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập họ và tên của sinh viên sv3:");
        String hoTen = sc.nextLine();

        System.out.println("Nhập điểm lý thuyết của sinh viên sv3:");
        float diemLT = sc.nextFloat();

        System.out.println("Nhập điểm thực hành của sinh viên sv3:");
        float diemTH = sc.nextFloat();

        sv3.setMaSV(maSV);
        sv3.setHoTen(hoTen);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-8s %-30s %10s %10s %10s%n", "masv", "hoten", "diemLT", "diemTH", "diemTB");

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
    }
}
