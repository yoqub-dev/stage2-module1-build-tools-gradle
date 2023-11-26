package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return StringUtils.isPositiveNumber(str) && Integer.parseInt(str) > 0;
    }
}
