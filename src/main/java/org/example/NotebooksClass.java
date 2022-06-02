package org.example;

import org.openqa.selenium.By;

public class NotebooksClass extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>LOCATORS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


    //Locator for assert verification get text of Notebooks
    private By _notebooksAssert = By.xpath("//div[@class='page-title']/h1");

    //Locator for Add to cart button Apple MacBook Pro 13inch
    private By _AppleMacBookProAddToCart = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/4/1/1\"),!1']");





    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void verificationForNotebooksPage()
    {
        assertExpectedEqualsActual("Notebooks", _notebooksAssert,"You are not on Notebooks");
    }

    public void appleMacBookPro13InchAddToCartButton()
    {
        clickElement(_AppleMacBookProAddToCart);
    }




}
