package vn.edu.java.tuan01.bai01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HinhChuNhatTest {
    @Test
    void tinhDienTichDung() {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(3, 4);
        assertEquals(12.0, hinhChuNhat.getDT(), 0.0001);
    }

    @Test
    void chieuRongKhongHopLeSeNémLoi() {
        assertThrows(IllegalArgumentException.class, () -> new HinhChuNhat(3, 0));
    }
}
