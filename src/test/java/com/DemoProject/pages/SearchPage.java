package com.DemoProject.pages;

import com.DemoProject.utilities.Constants;
import com.DemoProject.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage {
    HomePage homePage=new HomePage();


     @FindBy(css = ".ui-menu-item")
     public List<WebElement>searchItemList;

     @FindBy(css = ".item-name")
     public List<WebElement>searchItemList1;


    @FindBy(className = "seg-qa-title")
    public WebElement popularproducttitle;


    @FindBy(css= "div[id='cboxLoadedContent'] p")
    public WebElement informationAboutsearchMsg;


    public List<String> getSearchItemList(){
        List<String>itemList=new ArrayList<>();
        for (WebElement el:searchItemList
             ) {
            itemList.add(el.getText());
        }
        String searchProduct =Constants.searchProduct1;
        System.out.println("SearchProduct = " + searchProduct);
        System.out.println("First Item    = " + itemList.get(0));


        Assert.assertTrue(itemList.get(0).contains("Peynir"));


        return itemList;

    }

    public List<String> getSearchItemList1(){
        List<String>itemList1=new ArrayList<>();
        for (WebElement el:searchItemList1
        ) {
            itemList1.add(el.getText());
        }
        String searchProduct =Constants.searchProduct1;
        System.out.println("SearchProduct = " + searchProduct);
        System.out.println("First Item    = " + itemList1.get(0));
        Assert.assertTrue(itemList1.get(0).contains("Peynir"));

        return itemList1;

    }

    public void searchMsg(){
        String aboutSearchMsgText = informationAboutsearchMsg.getText();
        System.out.println("Single Letter for searching :"+Constants.singleLetter);
        System.out.println("aboutSearchMsgText = " + aboutSearchMsgText);
        Assert.assertTrue(informationAboutsearchMsg.isDisplayed());
    }

    public void searchProductBySingleLetter(){
        ReusableMethods.waitFor(2);
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.singleLetter);
        ReusableMethods.waitFor(1);
    }

}
