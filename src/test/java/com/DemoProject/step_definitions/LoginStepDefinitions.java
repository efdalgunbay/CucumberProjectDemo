package com.DemoProject.step_definitions;


import com.DemoProject.pages.LoginPage;
import com.DemoProject.utilities.ConfigReader;
import com.DemoProject.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();



    @Given("Enter a valid number in Your Mobile Number")
    public void enteraValidNumberinYourMobileNumber() {

        loginPage.loginPhoneNumberBox.sendKeys(ConfigReader.getProperty("phone_number"));
    }
    @Given("Click the Sign In button")
    public void clicktheSignInButton() {
        loginPage.loginButton2.click();
    }

    @When("Click the OK button")
    public void clicktheOKButton() {
        loginPage.otpConfirmButton.click();

        ReusableMethods.waitFor(1);
    }

    @Given("Enter an invalid number in Your Mobile Number")
    public void enteraninvalidNumberinYourMobileNumber() {
        loginPage.loginPhoneNumberBox.sendKeys(ConfigReader.getProperty("invalid_phone_number"));
    }
    @Given("An error message appears when an invalid number is entered")
    public void errorMessageAppearsWhenanInvalidNumberisEntered(){
        loginPage.verifyUnSuccessLogin();
    }
    @Given("Enters an invalid Otp code in the SMS Confirmation Code section")
    public void EntersanInvalidOtpCodeintheSMSConfirmationCodeSection() {
        loginPage.otpCodeTextBox.sendKeys(ConfigReader.getProperty("invalid_otp_code"));
    }
    @Given("Invalid SMS confirmation error message appears")
    public void invalidSMSConfirmationErrorMessageAppears(){

        loginPage.HataliOtpMesaji.isDisplayed();
    }
    }



