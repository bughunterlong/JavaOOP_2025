package Bai3_OOP.Testcases;

import Bai3_OOP.Common.BaseTest;

public class Testcases extends BaseTest {
    public void Login(){
        super.createDriver();
        System.out.println("Navite to URL: " + super.getUrl());
        System.out.println("Step 1: Input username: " + super.getUsername());
        System.out.println("Step 2: Input password: " + super.getPassword());
        System.out.println("Step 3: Click Login");
        super.closeDriver();
    }
    public void addCategory(){
        super.createDriver();
        System.out.println("Wait for elements visbile hoặc Thread.sleep()");
        System.out.println("Step 1: Click blog systems: " +super.getBlogsystem());
        System.out.println("Step 2: Click category: " +super.getCategory());
        System.out.println("Step 3: Click add new category: " +super.getAddNewCatory_button());
        System.out.println("Step 4: Input category name: " +super.getCategoryName_input());
        System.out.println("Step 5: Click Save: " +super.getSave_button());
        System.out.println("Verify new name category show on screen after add new");
        super.closeDriver();
    }

    public static void main(String[] args) {
        Testcases tc = new Testcases();
        tc.Login();
        System.out.println("=================");
        tc.addCategory();
        
    }
}
