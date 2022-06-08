package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class HomePage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //locator for registration link
    private By _registerLink = By.className("ico-register");

    //Locator for Welcome to our store on HOMEPAGE
    private By _verificationUserIsOnHomepage = By.xpath("//div[@class='topic-block-title']/h2");

    //Locator for top right currency drop down
    private By _changeOfCurrency = By.xpath("//select[@id=\"customerCurrency\"]");

    //Locator for build your own computer price
    private By _priceOfBuildYourOwnComputer = By.xpath("//div[@style='width:100%']/following::div[3]/span[contains(text(),'€1032.00')]");

    // Locator to click on Nope commerce logo
    private By _nopeCommerceLogo = By.xpath("//img[@alt=\"nopCommerce demo store\"]");

    //Locator for build your own computer link
    private By _buildYourownComputerLink = By.xpath("//h2/a[@href=\"/build-your-own-computer\"]");

    //Locator for computers
    private By _computers = By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/computers']");

    //Locator for Good Radio Button
    private By _goodRadioButton = By.xpath("//input[@id='pollanswers-2']");

    //Locator for Vote Button
    private By _voteButton = By.xpath("//button[@id='vote-poll-1']");


    //Locator for FB nopeCommerce
    private By _fbNopeCommerce = By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");

    //Locator for clicking on details button
    private By _clickOnNopeCommerceReleaseDetailsButton = By.xpath(" //a[contains(text(),'nopCommerce new release!')]/following::div[2]");

    //Locator for search input area
    private By _searchInputBox = By.xpath("//input[@class='search-box-text ui-autocomplete-input']");

    //Locator for search button
    private By _searchButton = By.xpath("//button[@class='button-1 search-box-button']");

    //Locator for product tiltes
    private By _productsTitles = By.xpath("//h2[@class='product-title']");




    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // click on register button method
    public void clickOnRegisterLink()
    {
        //driver.findElement(By.className("ico-register")).click();
        clickElement(_registerLink);
    }


    //Method for Assert Verification User is on Homepage.
    public void verificationUserIsOnHomepage()
    {
        assertExpectedEqualsActual("Welcome to our store",_verificationUserIsOnHomepage,"User is NOT on HomePage");
    }

    // Method for change of currency from USD to Euro
    public void changeOfCurrencyUsdToEuro()
    {
        //Select Euro from Dropdown Menu in currency section on the homepage
        selectDropdownByText(_changeOfCurrency,"Euro");
    }

    // Method for Assert verification of change of price from USD to Euros on built on your computer
    public void verifyChangeOfPriceForBuildYourOwnComputer()
    {
        //Go to Product & verify change of price for build your own computer in euros
        assertExpectedEqualsActual("€1032.00",_priceOfBuildYourOwnComputer,"Your Price is Not changed to EUROs");

    }

    // method for clicking on NopeCommerce logo
    public void nopeCommerceLogoClick()
    {
        //Click on NopCommerce logo for homepage
        clickElement(_nopeCommerceLogo);
    }

    //Method for clicking on Build your own computer
    public void buildYourOwnComputerLink()
    {
        clickElement(_buildYourownComputerLink);
    }

    //Method for clicking on computers on homepage
    public void computers()
    {
        //Click on computers on HOMEPAGE
        clickElement(_computers);
    }

    // Method for Click on Good Radio Button
    public void goodRadioButton()
    {
        clickElement(_goodRadioButton);
    }

    //Method for Vote button
    public void voteButton ()
    {
        clickElement(_voteButton);
    }

    //Method for verification User Voted Successfully
    public void verificationUserVotedSuccessfully()
    {
        String actualMessage = driver.findElement(By.xpath("//span[@class='poll-total-votes']")).getText().replaceAll("\\d+","");

        String expectedMessage = " votes(s)...";

        Assert.assertEquals(expectedMessage,actualMessage,"Not voted successfully");
    }





    //Method for verification of Alert get text
    public void verificationForAlertTextAndAccept()
    {
        alertMethodForGetText();
    }

    //method for clicking on facebook
    public void fbNopeCommerce()
    {
     clickElement(_fbNopeCommerce);
    }

    //Method for clicking on New release Details Button
    public void clickOnNewReleaseDetailsButton()
    {
        clickElement(_clickOnNopeCommerceReleaseDetailsButton);
    }

    //Method for searching any product in search box from homepage
    public void productSearchFromSearchBarFromHomePage(String productName)
    {
        //send keys in search box
        sendKeys(_searchInputBox,productName);

        //click on the search button
        clickElement(_searchButton);

        //verifying all products
        List<WebElement> productTitles = driver.findElements(_productsTitles);
        for (WebElement e : productTitles){
            System.out.println(e.getText());
            Assert.assertTrue(e.getText().contains(productName));
        }

        assertVerificationWithUrl("https://demo.nopcommerce.com/search?q="+productName,"You are on wrong page");


    }



    }


