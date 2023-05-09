package org.example;

import org.openqa.selenium.By;

public class RegisterPage  extends Utils{
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private  By _email = By.name("Email");
    private By _password = By.id("Password");
    private By _conformPassword = By.name("ConfirmPassword");
    private By _clickRegisterButton = By.name("register-button");
    private By _dayOfBirth = By.cssSelector("select[name='DateOfBirthDay']");
    private By _monthOfBirth = By.cssSelector("select[name='DateOfBirthMonth']");
    private By _yearOfBirth = By.cssSelector("select[name='DateOfBirthYear']");
    public void enterRegistrationDetails() {
        typeText(_firstName, "raj");
        //type last name
        typeText(_lastName, "patel");
        //select dropdown Day
        selectElementByValue(_dayOfBirth,"8");
        //select dropdown month
        selectElementByIndex(_monthOfBirth,1);
        //select dropdown year
        selectElementByText(_yearOfBirth,"1996");
        //type email
        typeText(_email, "shama112@gmail.com");
        //type password
        typeText(_password, "Test1234");
        //type  conform password
        typeText(_conformPassword, "Test1234");
        //click on register button
        clickOnElement(_clickRegisterButton);


    }



}
