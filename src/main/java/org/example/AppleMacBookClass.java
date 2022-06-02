package org.example;

import org.openqa.selenium.By;

public class AppleMacBookClass extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Locators <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Locator for assert verification Apple Mac Book pro 13inch get text
    private By _verifyUserOnAppleMacBookPro = By.xpath("//div[@class='product-name']/h1");

    //Locator for add to cart button Apple macBook Pro
    private By _addToCartButtonAppleMacBookPro = By.xpath("//button[@id='add-to-cart-button-4']");







    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void verificationUserOnAppleMacBookPro13inch ()
    {
        assertExpectedEqualsActual("Apple MacBook Pro 13-inch",_verifyUserOnAppleMacBookPro,"You are not on Apple MacBook pro");
    }


    public void addToCartAppleMacBookPro ()
    {
        clickElement(_addToCartButtonAppleMacBookPro);
    }


}
