package Bai5.tuan3;

import java.time.LocalDate;
public class main {
	public static void main(String[] args) {
		HangThucPham tp1 = new HangThucPham("001", "Gao", 100000.0, 
				LocalDate.of(2018, 7, 10), 
				LocalDate.of(2018, 7, 10));
		
		HangThucPham tp2 = new HangThucPham("002", "Mi", 5000.0,
				LocalDate.of(2025, 3, 1),
				LocalDate.of(2026, 12, 1));
		
		HangThucPham tp3 = new HangThucPham("003", "Nuoc", 10000.0,
				LocalDate.of(2017, 3, 1),
				LocalDate.of(2018, 3, 1));
		
		
		System.out.printf("%-10s %-12s %20s %15s %15s %15s\n", "MaHang", "TenHang", "DonGia", "NgaySanXuat", "NgayHetHan", "GhiChu");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println(tp1);
		System.out.println(tp2);
		System.out.println(tp3);
		
	}

}
