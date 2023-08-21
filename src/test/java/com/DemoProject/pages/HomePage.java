package com.DemoProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HomePage extends BasePage{

    @FindBy(css = "#js-site-search-input")
    public WebElement searchField;
    @FindBy(xpath = "//button[@class='btn btn-link js-search-validate']")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[@class='btn btn-default btn-block closeColorBox'])[6]")
    public WebElement informationPop_up;






}



