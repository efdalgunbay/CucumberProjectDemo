package com.DemoProject.pages;

import com.DemoProject.utilities.ConfigReader;
import com.DemoProject.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id = "login_personal_phoneNumber")
    public WebElement loginPhoneNumberBox;

    @FindBy(css = "#loginBtn")
    public WebElement loginButton2;

    @FindBy(xpath= "//div[@id='confirm-login']//input[@id='confirmationCode']")
    public WebElement otpCodeTextBox;

    @FindBy(xpath = "(//button[@id='confirmOTPBtn'])[1]")
    public WebElement otpConfirmButton;

    @FindBy(xpath = "//span[@class='error-message']")
    public WebElement errorMsgText;

    @FindBy(css = "span[class='error-message']")
    public WebElement gecersizNumaraHataMesaji;
    @FindBy(css = "div[class='login-error-message error-message']")
    public WebElement HataliOtpMesaji;

    public String verifyUnSuccessLogin(){
        String invalidNumberMsg = gecersizNumaraHataMesaji.getText();
        System.out.println("invalidNumberMsg = " + invalidNumberMsg);
        Assert.assertTrue(gecersizNumaraHataMesaji.isDisplayed());
        return invalidNumberMsg;
    }
    public String verifyUnSuccessLogin1(){
        String errorNumberMsg = errorMsgText.getText();
        System.out.println("errorNumberMsg = " + errorNumberMsg);
        Assert.assertTrue(errorMsgText.isDisplayed());
        return errorNumberMsg;
    }

}

