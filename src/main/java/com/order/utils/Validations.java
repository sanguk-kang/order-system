package com.order.utils;

public class Validations {

    public static boolean checkStrLength(int min, int max, String str) {
        if (str.length() >= min && str.length() <= max ) return true;
        return false;
    }

}
