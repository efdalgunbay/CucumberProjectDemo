package com.DemoProject.pages;

import com.DemoProject.utilities.Driver;
import com.DemoProject.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PLPPage extends BasePage {
    @FindBy(css = ".form-control.cat-sorting-option")
    public WebElement smartSortOptions;

    }

