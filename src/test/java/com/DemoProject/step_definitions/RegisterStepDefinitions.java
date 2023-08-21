package com.DemoProject.step_definitions;

import com.DemoProject.pages.LoginPage;
import io.cucumber.java.en.Given;

public class RegisterStepDefinitions {

    LoginPage loginPage=new LoginPage();



    @Given("Please enter phone number text is displayed")
    public void pleaseEnterPhoneNumberTextisDisplayed(){
        loginPage.verifyUnSuccessLogin1();
    }



}




