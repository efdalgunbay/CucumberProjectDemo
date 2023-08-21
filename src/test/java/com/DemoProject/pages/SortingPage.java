package com.DemoProject.pages;

import com.DemoProject.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPage extends BasePage{

    @FindBy(css = ".item-price.js-variant-discounted-price")
    public static List<WebElement> products;

    public static void compareDescendingPrice() throws IOException {

        System.out.println("products.size() = " + products.size());

        for (WebElement allProductsList : products) {

        }
        List<Integer> productNumbers1 = new ArrayList<>();
        List<Integer> productNumbers2 = new ArrayList<>();

        if (products.size() < 2) {
            System.out.println("The number of products in stock is less than 2. Comparison not possible");
        }
        for (WebElement product : products) {
            String priceText1 = product.getText().trim();

            String priceText2 = priceText1.replace(",", "")
                    .replace("TL", "").trim();

            int price = Integer.parseInt(priceText2);
            productNumbers1.add(price);
            productNumbers2.add(price);
        }

        System.out.println("productNumbers1 = " + productNumbers2);
        Collections.sort(productNumbers1);
        Collections.reverse(productNumbers1);
        System.out.println("productNumbers1 = " + productNumbers1);
        Assert.assertEquals("Sort Descending feature does not work: FAIL", productNumbers2, productNumbers1);
        System.out.println("Sort Descending feature works");
    }
    public static void compareAscendingPrice() throws IOException {

        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector(".item-price.js-variant-discounted-price"));
        System.out.println("products.size() = " + products.size());

        for (WebElement allProductsList : products) {

        }

        List<Integer> productNumbers1 = new ArrayList<>();
        List<Integer> productNumbers2 = new ArrayList<>();

        if (products.size() < 2) {
            System.out.println("The number of products in stock is less than 2. Comparison not possible");

        }

        for (WebElement product : products) {
            String priceText1 = product.getText().trim();
            String priceText2 = priceText1.replace(",", "")
                    .replace("TL", "").trim();

            int price = Integer.parseInt(priceText2);
            productNumbers1.add(price);
            productNumbers2.add(price);
        }

        System.out.println("productNumbers1 = " + productNumbers2);
        Collections.sort(productNumbers1);
        System.out.println("productNumbers1 = " + productNumbers1);
        Assert.assertEquals("Ascending Sort not working: FAIL", productNumbers2, productNumbers1);
        System.out.println("Ascending Sort feature works");

    }

}
