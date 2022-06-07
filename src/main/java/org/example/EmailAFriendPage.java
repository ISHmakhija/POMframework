package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils
{

    //Locator for Build your own computer
    private By _emailAFriend = By.xpath("//div[@class='page-title']/h1");

    //Locator for Friend's Email address
    private By _friendEmailAddress = By.xpath("//input[@id='FriendEmail']");

    //Locator for your email address
    private By _yourEmailAddress = By.xpath("//input[@class=\"your-email\"]");

    //Locator for personal message
    private By _personalMessage = By.xpath("//textarea[@class=\"your-email\"]");

    //Locator for send email button
    private By _sendEmail = By.xpath("//button[@name=\"send-email\"]");

    //Locator for assert verification for email message sent successfully
    private By _verificationForEmailSentSuccessfully = By.xpath("//div[@class='result']");








    //Method for assert verification of email a friend page for Build your own computer
    public void verificationAssertEmailAFriend()
    {
        // Assert Verification for email a friend Page
        assertExpectedEqualsActual("Email a friend",_emailAFriend ,"You are on wrong page");

    }

    //Method for entering friend email address
    public void friendEmailAddress()
    {
        sendKeys(_friendEmailAddress,"ecoguru@gmail.com");
    }


    //Enter Personal Message
    public void personalMessage()
    {
        sendKeys(_personalMessage, "You can buy this product. Kind regards, Ish");
    }

    //Click on SEND EMAIL button
    public void sendEmail()
    {
    clickElement(_sendEmail);
    }

    //Method for assert verification for email being sent successfully
    public void verificationEmailSentSuccessfully ()
    {
        //Assert Verification for message sent
        assertExpectedEqualsActual("Your message has been sent.",_verificationForEmailSentSuccessfully,"Your verification fail for email message sent");
    }





}
