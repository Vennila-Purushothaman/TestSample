package com.mycompany.app;

public class Util {
    public static Integer add(Integer a, Integer b) {
        if (a == null) {
            return null;
        }
        if (b == null) {
            return null;
        }
        return a + b;
    }
    public static String getBaseUrl() {
        return "http://catchmycity.com";
    }
    public static String generateStoreDetails(String mobileNo) {
        String baseUrl = Util.getBaseUrl();
        return baseUrl + "/" + mobileNo;
    }
}