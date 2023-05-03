package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    static String expectedRegistrationCompleteMsg = "Registration is not working.";
     private By _actualMassage = By.xpath("//div[@class='result']");

    public void verifyToUserShouldRegisterSuccessfully() {
        // get the massage
        String actualMassage = getTextFromElement(_actualMassage);
        // print for massage
        System.out.println(" massage is :" + actualMassage);
        //for match 2 result
        Assert.assertEquals(actualMassage, expectedRegistrationCompleteMsg, "Registration is not working");


    }
}
