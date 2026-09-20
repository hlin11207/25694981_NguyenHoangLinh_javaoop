package java.tuan02.bai02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SinhVienTest {
    @Test
    void tinhDiemTrungBinhDung() {
        SinhVien sv = new SinhVien(1, "A", 8.0f, 6.0f);
        assertEquals(7.0, sv.getDiemTB(), 0.0001);
    }

    @Test
    void diemKhongHopLeSeNémLoi() {
        assertThrows(IllegalArgumentException.class, () -> new SinhVien(1, "A", 11.0f, 5.0f));
    }
}
