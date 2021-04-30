package com.ispeakbetter.base;

import com.ispeakbetter.pages.*;

public class PageManager {
    public static LoginPage loginPage;
    public static ContactPage contactPage;
    public static HomePage homepage;
    public static SignUpPage signUpPage;



    public static void initialize(){
        loginPage = new LoginPage();
        contactPage = new ContactPage();
        signUpPage = new SignUpPage();
        homepage = new HomePage();

    }
}