package org.example;

import org.openqa.selenium.By;

public class NotebooksPage extends Utils
{
//method for assert verification for user is on Notebooks page
    public void verificationForNotebooksPage()
    {
        assertVerificationWithUrl("https://demo.nopcommerce.com/notebooks","You are not on correct page");
    }

    //Method for clicking on Apple MacBook Pro
    public void appleMacBookPro13InchAddToCartButton()
    {
        clickElement(By.xpath("//h2/a[@href='/apple-macbook-pro-13-inch']"));
    }







}
