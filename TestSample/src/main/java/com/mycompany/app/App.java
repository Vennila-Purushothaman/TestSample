package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
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
        return mobileNo;
    }

}
