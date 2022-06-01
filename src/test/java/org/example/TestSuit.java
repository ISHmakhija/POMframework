package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    //>>>>>>>>>>>>>>>>>>>>>>> OBJECTS CREATED <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    RegisterPage registerPage = new RegisterPage();

    HomePage homePage = new HomePage();

    RegisterResultPage registerResultPage = new RegisterResultPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    EmailAFriendPage emailAFriendPage= new EmailAFriendPage();

    ComputersPage computersPage = new ComputersPage();

    DesktopsPage desktopsPage = new DesktopsPage();


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   METHODS  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //All your test cases

    @Test  //TEST CASE FOR BUILT YOUR OWN COMPUTER & ADD TO SHOPPING CART

    public void userShouldAbleToAddBuiltYourOwnComputerToShoppingCart()
    {
        //Click on computers on HOMEPAGE
      //  clickElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/computers']"));
        homePage.computers();

        //Assert Verification that user is on computers page
        assertExpectedEqualsActual("Computers",By.xpath("//div[@class='page-title']/h1"),"You are not on computers page");


        //Click on Desktop
       // clickElement(By.xpath("//h2/a[@href='/desktops']"));
        computersPage.desktops();


        //Assert verification for user is on correct page
        assertExpectedEqualsActual("Desktops",By.xpath("//div[@class='page-title']/h1"),"You are on wrong page");

        //Click on add to cart
        //clickElement(By.xpath("//button[contains(@onclick,'/addproducttocart/catalog/1/1/1')]"));
        desktopsPage.addToCartButtonBuildYourOwnComputer();



        //Assert Verification Point for correct product name
        assertExpectedEqualsActual("Build your own computer",By.xpath("//h1[contains(text(),'Build your own computer')]"),"You are on the wrong product");

        //Select 2.2Ghz Processor from dropdown
        //selectDropdownByValue(By.id("product_attribute_1"),"1");
        buildYourOwnComputerPage.processorSelection();

        //Select 2GB RAM from dropdown
       // selectDropdownByValue(By.id("product_attribute_2"),"3");
        buildYourOwnComputerPage.ramSelection();

        //Click on HDD 320gb radio button
       // clickElement(By.id("product_attribute_3_6"));
        buildYourOwnComputerPage.hddSelection();

        //Click on OS Vista Premium radio button
       // clickElement(By.id("product_attribute_4_9"));
        buildYourOwnComputerPage.osVistaPremium();

        //Click on Acrobat reader Software
       // clickElement(By.id("product_attribute_5_11"));
        buildYourOwnComputerPage.acrobatReaderSoftware();

        //Click on Total Commander
        //clickElement(By.id("product_attribute_5_12"));
        buildYourOwnComputerPage.totalCommanderSoftware();

        //Click on Add to Cart button
       // clickElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        buildYourOwnComputerPage.addToCartButton();

        //By.xpath("//div[@class='bar-notification success']")


        //Click on Shopping cart
       // clickElement(By.xpath("//span[@class=\"cart-label\"]"));
        buildYourOwnComputerPage.shoppingCart();

        //Assert point to verify Shopping cart
        assertExpectedEqualsActual("Shopping cart",By.linkText("Shopping cart"),"You are on wrong webpage");

        //Assert point to verify correct product in the shopping cart
        assertExpectedEqualsActual("Build your own computer",By.xpath("//a[@class=\"product-name\"]"),"You have added wrong product int the basket");

    }

    @Test // TEST CASE FOR REFER PRODUCT TO FRIEND VIA EMAIL

    public void userShouldBeAbleToReferProductToFriendViaEmail()
    {
        //Registration Process
        userShouldBeAbleToRegisterSuccessfully();

        //Click on NopCommerce logo for homepage
        homePage.nopeCommerceLogoClick();
        //clickElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

        //Assert method for user is on correct page
        homePage.verificationUserIsOnHomepage();

        //Clicking on Build your own computer
        homePage.buildYourOwnComputerLink();
        //clickElement(By.xpath("//h2/a[@href=\"/build-your-own-computer\"]"));

        //Assert Verification for build your own computer webpage
        buildYourOwnComputerPage.verificationAssertForBuildYourOwnComputerPage();

        //Click on  Email a friend
        buildYourOwnComputerPage.emailAFriend();
        //clickElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

        // Assert Verification for email a friend Page
        assertExpectedEqualsActual("Email a friend",By.xpath("//div[@class='page-title']/h1"),"You are on wrong page");

        //Enter friend's email address
        emailAFriendPage.friendEmailAddress();
        //sendKeys(By.xpath("//input[@id='FriendEmail']"),"ecoguru@gmail.com");


        //Enter Personal Message
        emailAFriendPage.personalMessage();
        //sendKeys(By.xpath("//textarea[@class=\"your-email\"]"),"You can buy this product. Kind regards, Ish");

        //Click on SEND EMAIL button
        emailAFriendPage.sendEmail();
      //  clickElement(By.xpath("//button[@name=\"send-email\"]"));

        //Assert Verification for message sent
        assertExpectedEqualsActual("Your message has been sent.",By.xpath("//div[@class='result']"),"Your Email message has NOT sent to your friend");


    }

    @Test //TEST CASE FOR USER SHOULD BE ABLE TO CHANGE CURRENCY FROM USD TO EURO

    public void userShouldBeAbleToChangeCurrencyFromUsdToEuro()
    {
        // Assert verification for user is on the Homepage
        homePage.verificationUserIsOnHomepage();

        //Select Euro from Dropdown Menu in currency section on the homepage
       homePage.changeOfCurrencyUsdToEuro();


        //Go to Product & verify change of price for build your own computer in euros
        homePage.verifyChangeOfPriceForBuildYourOwnComputer();


    }


    @Test //TEST CASE FOR USER BE ABLE TO REGISTER SUCCESSFULLY

    public void userShouldBeAbleToRegisterSuccessfully()
    {
        // click on register button from homepage
        homePage.clickOnRegisterLink();

        //Assert verification for register page
        assertExpectedEqualsActual("Register",By.xpath("//div[@class='page-title']/h1"),"You are NOT on REGISTER page");

        //select on male radio button
        registerPage.maleRadioButton();


        // enter firstname
        registerPage.firstName();


        //enter last name
        registerPage.lastName();

        //Date of birth
       registerPage.dateOfBirth();

        //Month of birth
        registerPage.monthOfBirth();

        //Year of the birth
       registerPage.yearOfBirth();

        //EMAIL address
        registerPage.emailAddress();

        //password field
        registerPage.password();

        //Confirm Password
        registerPage.confirmPassword();

        //click on Register button on the button of the page
        registerPage.registerButton();

        //verification assert point for user registered successfully
        registerResultPage.verificationOfRegistrationCompleted();


    }

    @Test
    public void userShouldBeAbleToVoteSuccessfully()
    {
        //Assert Point User is on HomePage
        homePage.verificationUserIsOnHomepage();

        //Click on Good Radio Button
        homePage.goodRadioButton();

        //Click on Vote button
        homePage.voteButton();


        //Assert verification for vote condition "Only registered users can vote."
       //assertExpectedEqualsActual("Only registered users can vote.",By.xpath("//ul[@class='poll-options']/following::div[@class='poll-vote-error']"),"Its not matching");

        String expectedMessage = "Only registered users can vote.";
        String actualMessage = driver.findElement(By.id("block-poll-vote-error-1")).getText();
        Assert.assertEquals(actualMessage,expectedMessage,"voting fail");

        //calling method for registration
        userShouldBeAbleToRegisterSuccessfully();

        //click on nope commerce logo
        homePage.nopeCommerceLogoClick();

        //click  on good radio button
        homePage.goodRadioButton();

        //click on vote
        homePage.voteButton();

        //Assert verification that user has voted successfully
        String expected = " vote(s)...";
        String actual = driver.findElement(By.xpath("//span[@class='poll-total-votes']")).getText().replaceAll("\\d+","");
        Assert.assertEquals(actual,expected,"this is wrong");




    }




}
