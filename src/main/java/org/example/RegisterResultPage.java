package org.example;

import org.openqa.selenium.By;


public class RegisterResultPage extends Utils
{
    private By _yourRegistrationCompleted = By.className("result");

    private By _continueButton = By.xpath("//a[@class='button-1 register-continue-button']");

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // Assert Confirmation for REGISTRATION successful method.
    public void verificationOfRegistrationCompleted()
    {
        //Assert confirmation & verification for registration successful
         assertExpectedEqualsActual("Your registration completed",_yourRegistrationCompleted,"Your Registration is Not completed");

    }

    public void continueButton()
    {
        clickElement(_continueButton);
    }

}
