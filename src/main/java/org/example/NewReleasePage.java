package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewReleasePage extends Utils

{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Locator for get text Nope commerce new release text
    private By _newReleaseGetText = By.xpath("//div[@class='page-title']/h1");

    //Locator for click
    private By _click = By.xpath("//input[@id='AddNewComment_CommentTitle']");

    //Locator for comment
    private By _comment = By.xpath("//textarea[@class='enter-comment-text']");

    //Locator for click on New comment button
    private By _newCommentbutton = By.xpath("//button[contains(text(),'New comment')]");

    //Locator for assert verification for comment added successfully
    private By _commentAddedSuccessfully = By.xpath("//div[@class='result']");




    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Assert verification method for url
    public void assertVerificationForURL()
    {
        assertVerificationWithUrl("https://demo.nopcommerce.com/nopcommerce-new-release","URL is NOT Matching");
    }

    //Assert Verification for Get text on New Release Page
    public void assertVerificationForGetText()
    {
        assertExpectedEqualsActual("nopCommerce new release!",_newReleaseGetText ,"You are Not on New release Page");
    }

    //Send keys For Title
    public void titleSendKeys()
    {
        sendKeys(_click,"Mr J.D");
    }

    //Method for send keys in comment area
    public void commentSendKeys ()
    {
        sendKeys(_comment,"Please Mind the Gap Between The Train & The Platform");
    }

    //Click on submit button
    public void newCommentButton ()
    {
        clickElement(_newCommentbutton);
    }

    //method for assert verification that message is added successfully
    public void assertCommentAddedSuccessfully()
    {
        assertExpectedEqualsActual("News comment is successfully added.",_commentAddedSuccessfully,"Comment is NOT added");
    }

    //method for array list comments verification
    public void titleNameVerification()
    {
        ArrayList<String> beforeTitleList = new ArrayList<>();

        //declaring list of name titles with locators
        List<WebElement> elementList = driver.findElements(By.xpath("//strong[@class='comment-text']"));


        for (WebElement e : elementList)
        {
            beforeTitleList.add(e.getText());
        }

        System.out.println(beforeTitleList);

        //declaring list of elements again to compare with
        ArrayList<String> afterTitleList = new ArrayList<>();

        for (String s: beforeTitleList) {
            afterTitleList.add(s);
        }

        System.out.println(afterTitleList);


        Assert.assertTrue(afterTitleList.equals(beforeTitleList),"Your titles in the comment section is NOT matching");

    }

    //method for verification of comments left
    public void commentLeftVerification ()
    {
        ArrayList<String> beforeTitleList = new ArrayList<>();

        //declaring list of name titles with locators
        List<WebElement> elementList = driver.findElements(By.xpath("//p[@class='comment-text']"));


        for (WebElement e : elementList)
        {
            beforeTitleList.add(e.getText());
        }

        System.out.println(beforeTitleList);

        //declaring list of elements again to compare with
        ArrayList<String> afterTitleList = new ArrayList<>();

        for (String s: beforeTitleList) {
            afterTitleList.add(s);
        }

        System.out.println(afterTitleList);


        Assert.assertTrue(afterTitleList.equals(beforeTitleList),"Your COMMENTS left in the comment section is NOT matching");

    }

}
