package org.example;
import org.openqa.selenium.By;


public class RegisterPage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>Locators<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    private By _maleRadioButton = By.xpath("//input[@id='gender-male']");

    private By _firstName = By.id("FirstName");

    private By _lastName = By.id("LastName");

    private By _dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");

    private By _birthMonth = By.xpath("//select[@name='DateOfBirthMonth']");

    private By _birthYear = By.xpath("//select[@name='DateOfBirthYear']");

    private By _emailAddress = By.id("Email");

    private By _password = By.id("Password");

    private By _confirmPassword = By.id("ConfirmPassword");

    private By _registerButton  = By.id("register-button");

    //Locator for Assert verification register
    private By _verificationOfRegisterPage = By.xpath("//div[@class='page-title']/h1");





    //>>>>>>>>>>>>>>>>>>>>>>>>>>Methods<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Method for assert verification for user is on register page
    public void verificationUserIsOnRegisterPage()
    {
        //Assert verification for register page
        assertExpectedEqualsActual("Register", _verificationOfRegisterPage,"You are NOT on REGISTER page");

    }

    //select on male radio button
    public void maleRadioButton()
    {
        //driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        clickElement(_maleRadioButton);
    }

    // enter firstname
    public void firstName()
    {
    // driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Allan");
    sendKeys(_firstName,"AllanBhai");
    }

    //enter last name
    public void lastName()
    {
        //driver.findElement(By.id("LastName")).sendKeys("Sugar");
        sendKeys(_lastName, "SugarBhai");
    }

    //Date of birth
    public void dateOfBirth()
    {
    selectDropdownByValue(_dateOfBirth,"2");
    }

    //Month of birth
    public void monthOfBirth()
    {
        selectDropdownByValue(_birthMonth, "9");
    }

    //Year of the birth
    public void yearOfBirth()
    {
        selectDropdownByValue(_birthYear, "1980");
    }

    //EMAIL address
    public void emailAddress()
    {
        //driver.findElement(By.id("Email")).sendKeys("easy123@mail.com");
        sendKeys(_emailAddress, "easy" + randomDate() + "@mail.com");
    }


    //password field
    public void password()
    {
        // driver.findElement(By.id("Password")).sendKeys("12345678");
        sendKeys(_password, "12345678");
    }


    //Confirm Password
    public void confirmPassword()
    {
        // driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        sendKeys(_confirmPassword, "12345678");
    }

    //click on Register button on the button of the page
    public void registerButton()
    {
        //driver.findElement(By.id("register-button")).click();
        clickElement(_registerButton);
    }

}
