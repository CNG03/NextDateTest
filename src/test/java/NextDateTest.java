import static org.junit.Assert.*;
import org.junit.Test;
import org.example.NextDate;
public class NextDateTest {

    // Test case cho ngày hợp lệ
    @Test
    public void testValidDate() {
        assertTrue(NextDate.isValidDate(15, 4, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày lớn hơn 31)
    @Test
    public void testInvalidDay() {
        assertFalse(NextDate.isValidDate(32, 4, 2024));
    }

    // Test case cho ngày không hợp lệ (tháng không hợp lệ)
    @Test
    public void testInvalidMonth() {
        assertFalse(NextDate.isValidDate(15, 13, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày 31 trong tháng 2)
    @Test
    public void testInvalidDayInFebruary() {
        assertFalse(NextDate.isValidDate(31, 2, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày 30 trong tháng 2)
    @Test
    public void testInvalidDayInFebruaryLeapYear() {
        assertFalse(NextDate.isValidDate(30, 2, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày 29 trong tháng 2 năm không nhuận)
    @Test
    public void testInvalidDayInFebruaryNonLeapYear() {
        assertFalse(NextDate.isValidDate(29, 2, 2023));
    }

    // Test case cho ngày không hợp lệ (ngày 31 trong tháng 4)
    @Test
    public void testInvalidDayInApril() {
        assertFalse(NextDate.isValidDate(31, 4, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày 31 trong tháng 6)
    @Test
    public void testInvalidDayInJune() {
        assertFalse(NextDate.isValidDate(31, 6, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày 31 trong tháng 9)
    @Test
    public void testInvalidDayInSeptember() {
        assertFalse(NextDate.isValidDate(31, 9, 2024));
    }

    // Test case cho ngày không hợp lệ (ngày 31 trong tháng 11)
    @Test
    public void testInvalidDayInNovember() {
        assertFalse(NextDate.isValidDate(31, 11, 2024));
    }

    // Test các ngày theo kiểm thử lớp tương đương

    @Test
    public void testNextValidDate() {
        String nextDate = NextDate.calculateNextDate(15, 4, 2004);
        assertEquals("16-4-2004", nextDate);
    }

    @Test
    public void testNextValidDate1() {
        String nextDate = NextDate.calculateNextDate(15, 4, 2003);
        assertEquals("16-4-2003", nextDate);
    }

    @Test
    public void testNextValidDate2() {
        String nextDate = NextDate.calculateNextDate(15, 1, 2004);
        assertEquals("16-1-2004", nextDate);
    }

    @Test
    public void testNextValidDate3() {
        String nextDate = NextDate.calculateNextDate(15, 1, 2003);
        assertEquals("16-1-2003", nextDate);
    }

    @Test
    public void testNextValidDate4() {
        String nextDate = NextDate.calculateNextDate(15, 2, 2004);
        assertEquals("16-2-2004", nextDate);
    }

    @Test
    public void testNextValidDate5() {
        String nextDate = NextDate.calculateNextDate(15, 2, 2003);
        assertEquals("16-2-2003", nextDate);
    }

    @Test
    public void testNextValidDate6() {
        String nextDate = NextDate.calculateNextDate(29, 4, 2004);
        assertEquals("30-4-2004", nextDate);
    }

    @Test
    public void testNextValidDate7() {
        String nextDate = NextDate.calculateNextDate(29, 4, 2003);
        assertEquals("30-4-2003", nextDate);
    }

    @Test
    public void testNextValidDate8() {
        String nextDate = NextDate.calculateNextDate(29, 1, 2004);
        assertEquals("30-1-2004", nextDate);
    }

    @Test
    public void testNextValidDate9() {
        String nextDate = NextDate.calculateNextDate(29, 1, 2003);
        assertEquals("30-1-2003", nextDate);
    }

    @Test
    public void testNextValidDate10() {
        String nextDate = NextDate.calculateNextDate(29, 2, 2004);
        assertEquals("1-3-2004", nextDate);
    }

    @Test
    public void testNextInvalidDate() {
        String nextDate = NextDate.calculateNextDate(29, 2, 2003);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextValidDate11() {
        String nextDate = NextDate.calculateNextDate(30, 4, 2004);
        assertEquals("1-5-2004", nextDate);
    }

    @Test
    public void testNextValidDate12() {
        String nextDate = NextDate.calculateNextDate(30, 4, 2003);
        assertEquals("1-5-2003", nextDate);
    }

    @Test
    public void testNextValidDate13() {
        String nextDate = NextDate.calculateNextDate(30, 1, 2004);
        assertEquals("31-1-2004", nextDate);
    }

    @Test
    public void testNextValidDate14() {
        String nextDate = NextDate.calculateNextDate(30, 1, 2003);
        assertEquals("31-1-2003", nextDate);
    }

    @Test
    public void testNextInvalidDat1() {
        String nextDate = NextDate.calculateNextDate(30, 2, 2004);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextInvalidDat2() {
        String nextDate = NextDate.calculateNextDate(30, 2, 2003);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextInvalidDat3() {
        String nextDate = NextDate.calculateNextDate(31, 4, 2004);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextInvalidDat4() {
        String nextDate = NextDate.calculateNextDate(31, 4, 2003);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextValidDate15() {
        String nextDate = NextDate.calculateNextDate(31, 1, 2004);
        assertEquals("1-2-2004", nextDate);
    }

    @Test
    public void testNextValidDate16() {
        String nextDate = NextDate.calculateNextDate(31, 1, 2003);
        assertEquals("1-2-2003", nextDate);
    }

    @Test
    public void testNextInvalidDat5() {
        String nextDate = NextDate.calculateNextDate(31, 2, 2004);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextInvalidDat6() {
        String nextDate = NextDate.calculateNextDate(31, 2, 2003);
        assertEquals("Invalid Date", nextDate);
    }

    @Test
    public void testNextValidDate17() {
        String nextDate = NextDate.calculateNextDate(28, 2, 2023);
        assertEquals("1-3-2023", nextDate);
    }

    @Test
    public void testNextValidDate18() {
        String nextDate = NextDate.calculateNextDate(31, 12, 2023);
        assertEquals("1-1-2024", nextDate);
    }
}
