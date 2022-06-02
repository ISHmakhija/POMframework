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

    NotebooksClass notebooksClass = new NotebooksClass();

    AppleMacBookClass appleMacBookClass= new AppleMacBookClass();

    ShoppingCartClass shoppingCartClass= new ShoppingCartClass();

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   METHODS  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //All your test cases

    @Test  //TEST CASE FOR BUILT YOUR OWN COMPUTER & ADD TO SHOPPING CART

    public void userShouldAbleToAddBuiltYourOwnComputerToShoppingCart()
    {
        //Click on computers on HOMEPAGE
        homePage.computers();

        //Assert Verification that user is on computers page
        computersPage.verificationUserIsOnComputersPage();

        //Click on Desktop
        computersPage.desktops();


        //Assert verification for user is on correct page
        desktopsPage.verificationUserOnDesktops();

        //Click on add to cart
        desktopsPage.addToCartButtonBuildYourOwnComputer();


        //Assert Verification Point for correct product name
        buildYourOwnComputerPage.verificationOfUserIsOnBuildYourOwnComputer();

        //Select 2.2Ghz Processor from dropdown
        buildYourOwnComputerPage.processorSelection();

        //Select 2GB RAM from dropdown
        buildYourOwnComputerPage.ramSelection();

        //Click on HDD 320gb radio button
        buildYourOwnComputerPage.hddSelection();

        //Click on OS Vista Premium radio button
        buildYourOwnComputerPage.osVistaPremium();

        //Click on Acrobat reader Software
        buildYourOwnComputerPage.acrobatReaderSoftware();

        //Click on Total Commander
        buildYourOwnComputerPage.totalCommanderSoftware();

        //Click on Add to Cart button
        buildYourOwnComputerPage.addToCartButton();


        //Click on Shopping cart
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
        registerPage.verificationUserIsOnRegisterPage();


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

        //Explicit waiting method for get text
        driverWaitUntilGetText(10,By.id("block-poll-vote-error-1"),"Only registered users can vote.");

        //Assert verification for vote condition "Only registered users can vote."
        homePage.verificationOnlyRegisterUsersCanVote();

        //calling method for registration
        userShouldBeAbleToRegisterSuccessfully();

        //click on nope commerce logo
        homePage.nopeCommerceLogoClick();

        //click  on good radio button
        homePage.goodRadioButton();

        //click on vote
        homePage.voteButton();

        //Assert verification that user has voted successfully
        homePage.verificationUserVotedSuccessfully();

    }

    @Test
    public void userShouldBeAbleToCheckoutAppleMacBookPro13Inches()
    {


        //click on computers
        homePage.computers();

        //Verification of computers page
        computersPage.verificationUserIsOnComputersPage();

        //click on notebooks
        computersPage.notebooks();

        //assert Verification user is on the notebooks page
        notebooksClass.verificationForNotebooksPage();

        //click on Apple MacBook Pro 13inch Add to cart Button
        notebooksClass.appleMacBookPro13InchAddToCartButton();

        //Assert Verification that user is on Apple MacBook Pro 13inch
        appleMacBookClass.verificationUserOnAppleMacBookPro13inch();

        //click on add to cart button for apple mac book pro
        appleMacBookClass.addToCartAppleMacBookPro();

        //Click on shopping cart
        shoppingCartClass.shoppingCartClick();

        //Assert Verification for shopping cart
        shoppingCartClass.verificationUserOnShoppingCart();

        //Assert verification Apple MacBook Pro 13-inch added to cart
        shoppingCartClass.verificationOfAppleMacBookProAddedToCart();

        //Explicit wait method for get text for Qty
       // driverWaitUntilGetText(10,By.xpath("//input[@value='2']"),"2");

        //driver click inside the qty box
        //clickElement(By.xpath("//input[@value='2']"));

        //Assert Verification of 2 Qty added in the shopping cart
        //shoppingCartClass.verificationOfQty2InShoppingCart();

        String expectedMessage = "2";
        String actualMessage = driver.findElement(By.xpath("//input[@value='2']")).getText();
        Assert.assertEquals(actualMessage,expectedMessage,"Qty is wrong");






    }




}
