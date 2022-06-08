package org.example;

import org.openqa.selenium.By;

public class AppleMacBookProPage extends Utils{

    //Method verification user is on correct MacBook Pro page
    public void verificationUserOnAppleMacBookPro13inch()
    {
        assertVerificationWithUrl("https://demo.nopcommerce.com/apple-macbook-pro-13-inch","You are not on macBook Page");
    }


    //method for clicking on Add to cart button for macBook pro
public void addToCartAppleMacBookPro()
{
    clickElement(By.xpath("//button[@id='add-to-cart-button-4']"));
}

//Method for clicking on Shopping cart button
public void shoppingCartClick()
{
    clickElement(By.xpath("//span[@class='cart-label']"));
}


}
