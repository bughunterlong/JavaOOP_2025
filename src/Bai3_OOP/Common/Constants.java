package Bai3_OOP.Common;

public class Constants {
    public static String browser = "Chrome";
    public static boolean report = true;
    public static boolean headless = false;


    public void getConstants(){
        System.out.println("The current browser is: " + browser);
        System.out.println("The status of report is: " + report);
        System.out.println("The status of headless is: " + headless);
    }


    public String getBrowser() {
        return browser;
    }
}
