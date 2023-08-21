package com.DemoProject.step_definitions;

import com.DemoProject.pages.HomePage;
import com.DemoProject.pages.PLPPage;
import com.DemoProject.pages.SortingPage;
import com.DemoProject.utilities.Constants;
import com.DemoProject.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SortingStepDefinitions {
    HomePage homePage =new HomePage();
    PLPPage plpPage=new PLPPage();
    SortingPage sortingPage=new SortingPage();

    @Given("User clicks Search box on Home Page")
    public void user_Click_Search() {
        ReusableMethods.retryingFindClick();
    }
    @Given("Writes the name of the product he wants to search")
    public void write_the_name() {
        homePage.searchField.sendKeys(Constants.searchProduct);
    }
    @Given("Click the search button")
    public void click_search_click() {

        homePage.searchButton.click();
        try {
            homePage.informationPop_up.click();
        } catch (Exception e) {
            System.out.println("No notification pop-ups");
        }
    }
    @When("Click on Highest Price in Smart Sort in product listing")
    public void clickonHighestPriceinSmartSortinProductListing() {
        Select sl=new Select(plpPage.smartSortOptions);
        sl.selectByVisibleText("En Yüksek Fiyat");
    }
    @Then("Checks that items are sorted from high to low price")
    public void checksThatitemsareSortedFromHightoLowPrice() {

        try {
            sortingPage.compareDescendingPrice();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @When("Click on the Lowest Price selection in Smart Sort in the product listing")
    public void clickontheLowestPriceSelectioninSmartSortintheProductListing() {
        Select sl=new Select(plpPage.smartSortOptions);
        sl.selectByVisibleText("En Düşük Fiyat");
    }
    @Then("Checks that items are sorted from low to high price")
    public void checksThatitemsareSortedFromLowtoHighPrice() {
        try {
            sortingPage.compareAscendingPrice();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
