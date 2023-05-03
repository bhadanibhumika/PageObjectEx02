package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils {
    private By _email = By.xpath("//input[contains(@class,\"email\")]");
    private By _password = By.xpath("//input[contains(@class,\"password\")]");
    private By _clickOnLogInButton = By.xpath("//button[text()='Log in']");
    public void enterLogInDetails(){
        //type email
        typeText(_email,"shama112@gmail.com");
        //type password
        typeText(_password,"Test1234");
        //click on login button
        clickOnElement(_clickOnLogInButton);
    }


}
