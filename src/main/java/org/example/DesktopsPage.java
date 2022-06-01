package org.example;

import org.openqa.selenium.By;

public class DesktopsPage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Locator for add to cart button for build your own computer
    private By _addToCartButtonBuildYourOwnComputer = By.xpath("//button[contains(@onclick,'/addproducttocart/catalog/1/1/1')]");



    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Click on add to cart
    public void addToCartButtonBuildYourOwnComputer()
    {
        clickElement(_addToCartButtonBuildYourOwnComputer);

    }









}
