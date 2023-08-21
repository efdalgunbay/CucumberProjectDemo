package com.DemoProject.step_definitions;

import com.DemoProject.pages.FilterPage;
import com.DemoProject.utilities.Driver;
import com.DemoProject.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FilterStepDefinitions {
        FilterPage filterPage=new FilterPage();
        Actions actions=new Actions(Driver.getDriver());

        @Then("In stock checkbox in product listing, clicks")
        public void in_Stock_checkbox() {
            filterPage.instockCheckbox.click();

        }
        @Then("Checks that only items in stock are listed")
        public void checks_That_Only() {
            filterPage.instockCheckbox.isSelected();
            ReusableMethods.waitFor(1);

        }
    @And("Clicks the Deals checkbox in the product listing")
    public void cickTheDealsCheckbox() {
            filterPage.opportunitiesCheckbox.click();
            ReusableMethods.waitFor(1);

        }
    @Then("Checks that only Deals products are listed")
    public void ChecksThatOnlyDealsProductsAreListed() {
            filterPage.opportunitiesCheckbox.isSelected();

        }
        @Then("Brand checkbox ticks in product listing")
        public void brandCheckboxTicksinProductListing() {
            filterPage.activia.click();
            ReusableMethods.waitFor(3);
        }
        @Then("Checks that only selected branded products are listed")
        public void ChecksThatOnlySelected() {
            String displayText = filterPage.activiaIsDisplay.getText();
            System.out.println("FILTERED BRAND = " + displayText);
            Assert.assertTrue(filterPage.activiaIsDisplay.isDisplayed());
        }

        @Given("Makes any selections other than In Stock and discounted selections in the product listing")
        public void MakesAnySelectionsOtherThanInStockAndDiscountedSelectionsintheProductListing() {
            actions.moveToElement(filterPage.activiaLink);
            filterPage.activiaLink.click();
        }

        @When("Click the x next to the selection made in the Clear filters section")
        public void ClicktheNexttotheSelectionMadeintheClearFiltersSection() {
            filterPage.removeFilterIcon.click();        }

        @Then("Checks that the selection made is cleared")
        public void ChecksThattheSelectionMadeisCleared() {
            actions.moveToElement(filterPage.activiaLink);
            Assert.assertTrue(!filterPage.activiaLink.isSelected());
            System.out.println("Selected filter option is removed");
        }

    }


