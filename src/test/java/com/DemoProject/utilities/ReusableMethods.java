package com.DemoProject.utilities;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import static java.lang.Thread.sleep;

public class ReusableMethods {




    public static WebElement clickFunction(WebElement clickElement) {

        waitForClickablility(clickElement, 3);

        clickElement.click();
        return clickElement;
    }


    public static void waitFor(int sec) {
        try {
            sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void closeCerez() {
        WebElement cerez = Driver.getDriver().findElement(By.xpath("//button[@id='banner-accept-button']"));
        if (cerez.isEnabled()) {
            Driver.getDriver().findElement(By.xpath("//button[@id='banner-accept-button']")).click();
        }

    }

    public static boolean retryingFindClick() {
        boolean result = false;
        int attempts = 0;
        while (attempts < 2) {
            try {
                Driver.getDriver().findElement(By.xpath("//input[@id='js-site-search-input']")).click();
                result = true;
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        return result;
    }

}