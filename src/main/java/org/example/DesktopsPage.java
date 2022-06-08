package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Locator for add to cart button for build your own computer
    private By _addToCartButtonBuildYourOwnComputer = By.xpath("//button[contains(@onclick,'/addproducttocart/catalog/1/1/1')]");

    //Locator for verification User is on desktops page
    private By _userIsOnDesktopPage = By.xpath("//div[@class='page-title']/h1");


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Click on add to cart
    public void addToCartButtonBuildYourOwnComputer()
    {
        clickElement(_addToCartButtonBuildYourOwnComputer);

    }

    //Assert Method for user is on Desktop page
    public void verificationUserOnDesktops()
    {
        //Assert verification for user is on correct page
        assertExpectedEqualsActual("Desktops",_userIsOnDesktopPage,"You are on wrong page");

    }

    //Method for clicking on sort by & selecting Z to A option
    public void sortProductsByZtoAOption ()
    {
        selectDropdownByValue(By.xpath("//select[@id='products-orderby']"),"6");
    }



    //Method for product verification for products listed
    public void verificationMethodForProductsAreInZtoAOrder()
    {
        //declaring array Before lists

        ArrayList<String> beforeList = new ArrayList<>();

        //List of product title list
        List<WebElement> elementList = driver.findElements(By.xpath("//h2[@class='product-title']"));


        //running each for loop to get text from all the product in sequence
        for (WebElement e : elementList)
        {
            beforeList.add(e.getText());

        }

        System.out.println("List of products BEFORE sorting Z to A : "+beforeList);

        //Declaring array strings for after list
        ArrayList<String> afterList = new ArrayList<>();


        //running for each loop and storing value/Texts for comparison
        for (String after : beforeList)
        {
            afterList.add(after);

        }
        System.out.println("List of products AFTER sorting in filter option Z to A : "+afterList);

        //sorting after list
        Collections.sort(afterList);

        //For descending order
        Collections.reverse(afterList);

        //verification for before list and after list
        Assert.assertTrue(afterList.equals(beforeList),"Your sorting filter functionality Z to A, is NOT working correctly");



    }






}
