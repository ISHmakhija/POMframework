package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {
    ///////////////////////Static reusable methods////////////////////////////

    //Driver Send Keys Method

    public static void sendKeys(By by, String text) //Send Keys
    {
        driver.findElement(by).sendKeys(text);
    }

    //Driver Click Method

    public static void clickElement(By by) //Driver clicking on element with locator
    {
        driver.findElement(by).click();
    }

    //Driver get Text from Element Method

    public static void getTextElement(By by) //Driver get text with locator
    {
        driver.findElement(by).getText();
    }

    //Random date Method

    public static String randomDate()   //Date & Time generation method
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMYyyyHHMmSs");
        return formatter.format(date);
    }

    //Explicit wait method for Element to be clickable

    public static void driverWaitUnTillElementToBeClickable(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();

    }

    //Explicit wait method for Element contains URL Fraction

    public static void driverWaitUnitElementContainsUrlFraction(By by,int time,String FractionUrl)
    {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait1.until(ExpectedConditions.urlContains("FractionUrl"));
    }

    //Explicit wait method for Element for Presence of element located

    public static void driverWaitUntilPresenceOfElementLocated(By by,int time)
    {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait2.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    //Explicit wait method for Elements Title Contains

    public static void driverWaitUntilElementsTitleContains(int time,String TitleContains)
    {
        WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait4.until(ExpectedConditions.titleContains(TitleContains));

    }


    //Explicit wait method for wait until contains full URL

    public static void driverWaitUntilContainsUrl(int time,String url)
    {

        WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait5.until(ExpectedConditions.urlContains(url));

    }

    //Explicit wait method for Invisibility of WebElement

    public static void driverWaitUntilInvisibilityOfWebElement( int time, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    //Explicit wait method for Element to be Selected

    public static void driverWaitUntilToBeSelected(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }

    //Explicit method for get Text

    public static void driverWaitUntilGetText (int time, By by, String textValue)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.textToBe(by,textValue));

    }

    //Method for select from dropdown menu by VALUE

    public static void selectDropdownByValue(By by,String value)
    {
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByValue(value);
    }

    //Method for Assert Equals for comparing Actual v/s Expected Result

    public static void assertExpectedEqualsActual(String expected,By by,String errorMessage)
    {
        String expectedResult = expected;
        String actualResult = driver.findElement(by).getText();
        Assert.assertEquals(expectedResult,actualResult,errorMessage);
    }

    //Method for select from dropdown menu by Visible TEXT

    public static void selectDropdownByText(By by, String textValue)
    {
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByVisibleText(textValue);
    }

    // Method for taking screenshots
    public static void takeSnapshot(String filename)
    {

        //Convert web driver object to take screenshot

        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        // call getScreenshot as method to create image file

        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

        // copy file at destination
        try{
            FileUtils.copyFile(scrFile,new File("Screenshots\\"+filename+randomDate()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
