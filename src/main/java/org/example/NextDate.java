package org.example;

public class NextDate {
    public static boolean isValidDate(int d, int m, int y) {
        // Kiểm tra năm nhuận
        boolean leapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);

        // Kiểm tra tháng và ngày hợp lệ
        if (m < 1 || m > 12 || d < 1 || (m == 2 && leapYear && d > 29) || (m == 2 && !leapYear && d > 28) || (m == 4 || m == 6 || m == 9 || m == 11) && d > 30 || d > 31) {
            return false;
        }
        return true;
    }
    public static String calculateNextDate(int d, int m, int y) {
        // Tính toán ngày tiếp theo
        if (isValidDate(d, m, y)) {
            int d0, m0, y0;
            d0 = d;
            m0 = m;
            y0 = y;

            if (d < 28 || (d == 28 && m != 2) || (d == 28 && m == 2 && ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)))) {
                d0 = d + 1;
                m0 = m;
                y0 = y;
            } else if (d == 28 && m == 2 && ((y % 4 != 0) || (y % 100 == 0 && y % 400 != 0))) {
                d0 = 1;
                m0 = 3;
                y0 = y;
            } else if (d == 29 && m == 2) {
                d0 = 1;
                m0 = 3;
                y0 = y;
            } else if(d == 29 && m != 2) {
                d0 = d + 1;
            } else if (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
                d0 = 1;
                m0 = m + 1;
                y0 = y;
            } else if (d == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)) {
                d0 = 1;
                m0 = m + 1;
                y0 = y;
            } else if (d == 30 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)) {
                d0 = d + 1;
            } else if (d == 31 && m == 12) {
                d0 = 1;
                m0 = 1;
                y0 = y + 1;
            }

            // Trả về chuỗi đại diện cho ngày tiếp theo
            return d0 + "-" + m0 + "-" + y0;
        } else {
            // Trả về "Invalid Date" nếu ngày không hợp lệ
            return "Invalid Date";
        }
    }
}
