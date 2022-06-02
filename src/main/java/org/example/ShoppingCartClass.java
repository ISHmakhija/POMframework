package org.example;

import org.openqa.selenium.By;

public class ShoppingCartClass extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Locator for assert verification of user is on shopping cart page
   private By _verificationAssertShoppingCart = By.linkText("Shopping cart");

    //Locator for shopping cart sign
   private By _shoppingCart = By.xpath("//span[@class='cart-label']");

   //Locator for assert verification for Apple Macbook pro in the shopping cart
    private By _verificationMacBookProInShoppingCart = By.xpath("//a[@class='product-name']");

    //Locator for assert verification for quantity of two
    private By _verificationOfQtyOf2 = By.xpath("//input[@value='2']");









    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Method for clicking on shopping cart
    public void shoppingCartClick()
    {
        clickElement(_shoppingCart);
    }

    //Assert verification for user is on shopping cart page
    public void verificationUserOnShoppingCart()
    {
        assertExpectedEqualsActual("Shopping cart",_verificationAssertShoppingCart,"You are not on shopping cart page.");
    }


    //Method for  assert verification of Apple MacBook Pro 13-inch added to cart
    public void verificationOfAppleMacBookProAddedToCart ()
    {
        assertExpectedEqualsActual("Apple MacBook Pro 13-inch", _verificationMacBookProInShoppingCart,"Wrong or No product added to cart");
    }

    //Method for assert Verification for quantity of 2 pieces
    public void verificationOfQty2InShoppingCart ()
    {
        assertExpectedEqualsActual("2",_verificationOfQtyOf2," No or Wrong quantity entered.");
    }







}
