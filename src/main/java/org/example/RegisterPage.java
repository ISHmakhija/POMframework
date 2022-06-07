package org.example;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegisterPage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>Locators<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Locator for selecting Male Radio button
    private By _maleRadioButton = By.xpath("//input[@id='gender-male']");

    //Locator for First name
    private By _firstName = By.id("FirstName");

    //Locator for last name
    private By _lastName = By.id("LastName");

    //Locator for date of Birth
    private By _dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");

    //Locator for date of Month
    private By _birthMonth = By.xpath("//select[@name='DateOfBirthMonth']");

    //Locator for Birth Year
    private By _birthYear = By.xpath("//select[@name='DateOfBirthYear']");

    //Locator for email address
    private By _emailAddress = By.id("Email");

    //Locator for password
    private By _password = By.id("Password");

    //Locator for confirm password
    private By _confirmPassword = By.id("ConfirmPassword");

    //Locator for Registration Button
    private By _registerButton  = By.id("register-button");


    //Object creation for LoadProp
    LoadProp loadProp = new LoadProp();



    //>>>>>>>>>>>>>>>>>>>>>>>>>>Methods<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


    //select on male radio button
    public void maleRadioButton()
    {
        clickElement(_maleRadioButton);
    }

    // enter firstname
    public void firstName()
    {
    sendKeys(_firstName,loadProp.getProperty("firstname"));
    }

    //enter last name
    public void lastName()
    {
        sendKeys(_lastName, loadProp.getProperty("lastname"));
    }

    //Date of birth
    public void dateOfBirth()
    {
    selectDropdownByValue(_dateOfBirth, loadProp.getProperty("dateOfBirth"));
    }

    //Month of birth
    public void monthOfBirth()
    {
        selectDropdownByValue(_birthMonth, loadProp.getProperty("monthOfBirth"));
    }

    //Year of the birth
    public void yearOfBirth()
    {
        selectDropdownByValue(_birthYear, loadProp.getProperty("yearOfBirth"));
    }

    //EMAIL address
    public void emailAddress()
    {
        sendKeys(_emailAddress, loadProp.getProperty("emailFirstPart") + randomDate() + loadProp.getProperty("emailSecondPart"));
    }


    //password field
    public void password()
    {
        sendKeys(_password, loadProp.getProperty("password"));
    }


    //Confirm Password
    public void confirmPassword()
    {

        sendKeys(_confirmPassword, loadProp.getProperty("confirmPassword"));
    }

    //click on Register button on the button of the page
    public void registerButton()
    {
        clickElement(_registerButton);
    }

}
