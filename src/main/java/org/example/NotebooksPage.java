package org.example;

import org.openqa.selenium.By;

public class NotebooksPage extends Utils
{
    //Method for assert verification user is on correct URL
    public void verificationForNotebooksPage()
    {
        assertVerificationWithUrl("https://demo.nopcommerce.com/notebooks","You are NOT on correct page");
    }

    //Click on Apple MacBook pro 13inch
    public void appleMacBookPro13InchAddToCartButton()
    {
        clickElement(By.xpath("//h2/a[@href='/apple-macbook-pro-13-inch']"));
    }

    //Method verification user is on Apple MacBook pro 13inch page
    public void verificationUserOnAppleMacBookPro13inch()
    {
        assertVerificationWithUrl("https://demo.nopcommerce.com/apple-macbook-pro-13-inch","You are on wrong page");
    }

    //Method for click on Add to Cart
    public void addToCartAppleMacBookPro()
    {
        clickElement(By.xpath("//button[@id='add-to-cart-button-4']"));
    }

    //Method for clicking on shopping cart
    public void shoppingCartClick()
    {
        clickElement(By.xpath("//span[@class='cart-label']"));
    }
}
