# 1. NextDateTest
- Chương trình nhập vào ngày hiện tại và in ra ngày tiếp theo trong tháng.
- Đây là báo cáo về việc thực hiện kiểm thử jUnit với chương trình NextDateTest, và thực hiện tính toán độ bao phủ với Coverage.
- Có kèm theo chương trình test để thực hiện kiểm thử lớp đã viết.
### Về lớp NextDate:
- Gồm 2 phương thức chính: `isValidDate()` và `calculateNextDate()`.
# 2. Môi trường Kiểm thử
- Ngôn ngữ lập trình: Java
- Framework kiểm thử: JUnit
- Công cụ tính toán độ bao phủ: Coverage
# 3. Ca kiểm thử
Dưới đây là các ca kiểm thử được thiết kế để kiểm tra tính đúng đắn của lớp NextDate:
### Thực hiện kiểm thử với phương thức `isValidDate()`: 
- Đầu tiên, thưc hiện test kiểm tra xem phương thức isValidDate() có hoạt động có chính xác hay không.
- Code minh họa cho các trường hợp kiểm thử:
```commandline
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
    
    // Test case cho ngày không hợp lệ (ngày 31 trong tháng 2)
    @Test
    public void testInvalidDayInFebruary() {
        assertFalse(NextDate.isValidDate(31, 2, 2024));
    }
    // Test case cho ngày không hợp lệ (ngày 29 trong tháng 2 năm không nhuận)
    @Test
    public void testInvalidDayInFebruaryNonLeapYear() {
        assertFalse(NextDate.isValidDate(29, 2, 2023));
    }
```
Và còn nhiều trường hợp khác, xem chi tiết hơn ở trong file `src/test/java/NextDateTest.java`
### Thực hiện kiểm thử với phương thức `calculateNextDate()`:
- Chúng tôi đã thử sử dụng phương pháp kiểm thử lớp tương đương, dưới đây là các giá trị đầu vào mà chúng tôi đã sử dụng trong kiểm thử lớp tương đương:

| Test Case ID | Day | Month | Year | Expected Output |
|--------------|-----|-------|------|-----------------|
| E1           | 15  | 4     | 2004 | 16-4-2004       |
| E2           | 15  | 4     | 2003 | 16-4-2003       |
| E3           | 15  | 1     | 2004 | 16-1-2004       |
| E4           | 15  | 1     | 2003 | 16-1-2003       |
| E5           | 15  | 2     | 2004 | 16-2-2004       |
| E6           | 15  | 2     | 2003 | 16-2-2003       |
| E7           | 29  | 4     | 2004 | 30-4-2004       |
| E8           | 29  | 4     | 2003 | 30-4-2003       |
| E9           | 29  | 1     | 2004 | 30-1-2004       |
| E10          | 29  | 1     | 2003 | 30-1-2003       |
| E11          | 29  | 2     | 2004 | 1-3-2004        |
| E12          | 29  | 2     | 2003 | Invalid Date    |
| E13          | 30  | 4     | 2004 | 1-5-2004        |
| E14          | 30  | 4     | 2003 | 1-5-2003        |
| E15          | 30  | 1     | 2004 | 31-1-2004       |
| E16          | 30  | 1     | 2003 | 31-1-2003       |
| E17          | 30  | 2     | 2004 | Invalid Date    |
| E18          | 30  | 2     | 2003 | Invalid Date    |
| E19          | 31  | 4     | 2004 | Invalid Date    |
| E20          | 31  | 4     | 2003 | Invalid Date    |
| E21          | 31  | 1     | 2004 | 1-2-2004        |
| E22          | 31  | 1     | 2003 | 1-5-2003        |
| E23          | 31  | 2     | 2004 | Invalid Date    |
| E24          | 31  | 2     | 2003 | Invalid Date    |
- Ngoài ra chúng tôi còn thêm một số test case nữa mà để có thể đạt được độ bao phủ mã là 100%, các test case được thêm vào là:
```commandline
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
```
# 4. Kết quả Kiểm thử
Tổng quan:
- Tổng số ca kiểm thử: 36
- Tổng số ca kiểm thử đã thành công: 36
- Tổng số ca kiểm thử thất bại: 0

Độ bao phủ:
- Độ bao phủ của mã nguồn: 100%
- Các phần mã đã được kiểm thử: Toàn bộ mã trong phương thức NextDate đã được kiểm thử.
##### Kết quả chạy test với Coverage:
![Tên ảnh](/img/coverage.JPG)
# 5. Kết luận
   Chương trình NextDateTest đã được kiểm tra và đạt hiệu suất tốt, với tất cả các ca kiểm thử đã thành công và độ bao phủ của mã nguồn đạt 100%. Điều này cho thấy rằng chương trình hoạt động đúng như mong đợi và có khả năng xử lý mọi trường hợp kiểm thử được xác định.

