package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


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

    //Locator for verification only register user can vote
    private By _verificationOnlyRegisterUserCanVote = By.id("block-poll-vote-error-1");

    //Locator for verification
    private By _verificationUserVotedSuccessfully = By.xpath("//span[@class='poll-total-votes']");

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // click on register button method
    public void clickOnRegisterLink()
    {
        //driver.findElement(By.className("ico-register")).click();
        clickElement(_registerLink);
    }

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

    //Method for assert verification that user only register user can vote
    public void verificationOnlyRegisterUsersCanVote ()
    {
        //Assert verification for vote condition "Only registered users can vote."
        String expectedMessage = "Only registered users can vote.";
        String actualMessage = driver.findElement(_verificationOnlyRegisterUserCanVote).getText();
        Assert.assertEquals(actualMessage,expectedMessage,"voting fail");
    }


    //Method for assert verification for user voted successfully
    public void verificationUserVotedSuccessfully ()
    {
        //Assert verification that user has voted successfully
        String expected = " vote(s)...";
        String actual = driver.findElement(_verificationUserVotedSuccessfully).getText().replaceAll("\\d+","");
        Assert.assertEquals(actual,expected,"this is wrong");

    }

}
