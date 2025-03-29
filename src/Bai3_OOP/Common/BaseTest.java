package Bai3_OOP.Common;

public class BaseTest extends Constants{
     String Url = "https://cms.anhtester.com/login";
     String username = "admin@example.com";
     String password = "123456";
     String blogsystem = "//blogsystem_xpath";
     String category = "//category_xpath";
     String addNewCatory_button = "//addNewCatory_button_xpath";
     String categoryName_input = "categoryName_input_xpath";
     String save_button = "save_button_xpath";

    public String getUrl() {
        return Url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBlogsystem() {
        return blogsystem;
    }

    public String getCategory() {
        return category;
    }

    public String getAddNewCatory_button() {
        return addNewCatory_button;
    }

    public String getCategoryName_input() {
        return categoryName_input;
    }

    public String getSave_button() {
        return save_button;
    }

    public void createDriver(){
       super.getConstants();
    }
    public void closeDriver(){
        System.out.println("The current browser after close is: " + super.getBrowser());
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.createDriver();
        baseTest.closeDriver();
    }
}
