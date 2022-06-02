package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Locator for Desktops
    private By _desktops = By.xpath("//h2/a[@href='/desktops']");

    //Locator for Notebooks
    private By _notebooks = By.xpath("//img[@title='Show products in category Notebooks']");

    //Locator for Computer verification text
    private By _verificationOfComputers = By.xpath("//div[@class='page-title']/h1");






    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Methods <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Method to click on Desktop option
    public void desktops()
    {
    clickElement(_desktops);
    }

    //Method for click on Notebooks
    public void notebooks ()
    {
        clickElement(_notebooks);
    }

    //Method for assert verification that user is on Computers page
    public void verificationUserIsOnComputersPage ()
    {
        //Assert Verification that user is on computers page
        assertExpectedEqualsActual("Computers",_verificationOfComputers,"You are not on computers page");
    }











}
