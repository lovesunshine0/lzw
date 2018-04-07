package com.cn.course.util;

import java.sql.Timestamp;

public class TimeUtil {

    public static String currentTimeStr() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static long currentTime() {
        return System.currentTimeMillis();
    }

    public static Timestamp currentDate() {
        return new Timestamp(System.currentTimeMillis());
    }
}
