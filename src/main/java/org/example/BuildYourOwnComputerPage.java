package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils
{

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Locator for Build your own computer text
    private By _BuildYourOwnComputer = By.xpath("//div[@class=\"product-name\"]/h1");

    //Locator for email a friend
    private By _emailAFriend = By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");

    //Locator for processor selection
    private By _processorSelection = By.id("product_attribute_1");

    //Locator for RAM selection
    private By _ramSelection = By.id("product_attribute_2");

    //Locator for HDD selection
    private By _hddSelection = By.id("product_attribute_3_6");

    //Locator for OS vista premium radio button
    private By _osVistaPremium = By.id("product_attribute_4_9");

    //Locator for acrobat reader
    private By _acrobatReader = By.id("product_attribute_5_11");

    //Locator for Total commander software
    private By _totalCommander = By.id("product_attribute_5_12");

    //Locator for add to cart button
    private By _addTocartButton = By.xpath("//button[@id='add-to-cart-button-1']");

    //Locator for shopping cart
    private By _shoppingCart = By.xpath("//span[@class=\"cart-label\"]");

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


    //Method Assert Verification for build your own computer webpage
    public void verificationAssertForBuildYourOwnComputerPage()
    {
        assertExpectedEqualsActual("Build your own computer",_BuildYourOwnComputer,"You selected wrong product");

    }

    //Method for clicking email a friend product referral
    public void emailAFriend()
    {
        //Enter friend's email address
        clickElement(_emailAFriend);
    }

    //Select 2.2Ghz Processor from dropdown
    public void processorSelection()
    {
        selectDropdownByValue(_processorSelection, "1");
    }

    //Select 2GB RAM from dropdown
    public void ramSelection()
    {
        selectDropdownByValue(_ramSelection,"3");
    }

    //Click on HDD 320gb radio button
    public void hddSelection()
    {
        clickElement(_hddSelection);
    }

    //Click on OS Vista Premium radio button
    public void osVistaPremium()
    {
        clickElement(_osVistaPremium);
    }

    //Click on Acrobat reader Software
    public void acrobatReaderSoftware()
    {
        clickElement(_acrobatReader);
    }

    //Click on Total Commander
    public void totalCommanderSoftware()
    {
    clickElement(_totalCommander);
    }

    //Click on Add to Cart button
    public void addToCartButton()
    {
        clickElement(_addTocartButton);
    }

    //Click on Shopping cart
    public void shoppingCart()
    {
        clickElement(_shoppingCart);
    }

}
