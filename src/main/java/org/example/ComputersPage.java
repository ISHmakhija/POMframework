package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils
{
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOCATORS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Locator for Desktops
    private By _desktops = By.xpath("//h2/a[@href='/desktops']");






    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Methods <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Method to click on Desktop option
    public void desktops()
    {
    clickElement(_desktops);
    }











}
