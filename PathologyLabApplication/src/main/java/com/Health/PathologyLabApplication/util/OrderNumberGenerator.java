package com.Health.PathologyLabApplication.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderNumberGenerator {

    public static String generate() {

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        return "LAB-" + timestamp;
    }
}