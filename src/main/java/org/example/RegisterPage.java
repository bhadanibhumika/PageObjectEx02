package org.example;

import org.openqa.selenium.By;

public class RegisterPage  extends Utils{
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private  By _email = By.name("Email");
    private By _password = By.id("Password");
    private By _conformPassword = By.name("ConfirmPassword");
    private By _clickRegisterButton = By.name("register-button");
    public void enterRegistrationDetails() {
        typeText(_firstName, "raj");
        //type last name
        typeText(_lastName, "patel");
        //type email
        typeText(_email, "shama12@gmail.com");
        //type password
        typeText(_password, "Test1234");
        //type  conform password
        typeText(_conformPassword, "Test1234");
        //click on register button
        clickElement(_clickRegisterButton);

    }



}
