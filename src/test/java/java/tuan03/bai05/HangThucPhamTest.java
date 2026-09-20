package java.tuan03.bai05;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HangThucPhamTest {
    @Test
    void hangQuaHanTraVeTrue() {
        HangThucPham hang = new HangThucPham("001", "A", 1000,
                LocalDate.now().minusDays(3),
                LocalDate.now().minusDays(1));
        assertTrue(hang.isHetHan());
    }

    @Test
    void hangConHanTraVeFalse() {
        HangThucPham hang = new HangThucPham("002", "B", 1000,
                LocalDate.now().minusDays(1),
                LocalDate.now().plusDays(2));
        assertFalse(hang.isHetHan());
    }
}
