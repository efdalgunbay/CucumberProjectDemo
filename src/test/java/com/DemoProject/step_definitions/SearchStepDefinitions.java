package com.DemoProject.step_definitions;

import com.DemoProject.pages.HomePage;
import com.DemoProject.pages.SearchPage;
import com.DemoProject.utilities.Constants;
import com.DemoProject.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchStepDefinitions {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Given("User Enters Search Word in Search")
    public void userEntersSearchWordinSearch() {
        ReusableMethods.retryingFindClick();
        homePage.searchField.sendKeys(Constants.searchProduct1);
        ReusableMethods.waitFor(1);
    }
    @Given("User Sees Product Types Searched For")
    public void userSeesProductTypesSearchedFor() {

        searchPage.getSearchItemList();
    }

    @Given("Clicks on Search User Button")
    public void clicksonSearchUserButton() {
        ReusableMethods.clickFunction(homePage.searchButton);
        ReusableMethods.waitFor(1);
    }
    @Then("Sees Product Types Searched For")
    public void seesProductTypesSearchedFor() {
        searchPage.getSearchItemList1();
    }

    @Given("User Sees Popular Title")
    public void userSeesPopularTitle() {
        searchPage.popularproducttitle.isDisplayed();
        ReusableMethods.waitFor(3);
    }

    @Given("Doesn't type anything in the search box")
    public void DoesnTypeAnythingintheSearchBox() {
        homePage.searchField.sendKeys("");
    }
    @Then("Checks whether a call can be made")
    public void checksWhetherCallCanBeMade() {
        searchPage.searchMsg();
    }


    @Given("User Enters a Single Letter to Search in Search")
    public void userEntersSingleLettertoSearchinSearch() {
        searchPage.searchProductBySingleLetter();
    }
}


