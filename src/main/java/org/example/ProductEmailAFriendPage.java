package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriendPage  extends Utils{
    String expectedReferAFriendProductMsg = "Your massage has not  been sent.";
    String expectedEmailMassage = "All customers can use email a friend feature";

    private By _getProductName = By.xpath("//a[@class='product']");
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _enterMassage = By.xpath("//textarea[starts-with(@name,'Personal')]");
    private  By _clickOnSendEmailButton = By.name("send-email");
    private  By _getYourMassage = By.xpath("//div[@class=\"result\"]");
    private By _enterYourEmail = By.className("your-email");
    private By _getErrorMassage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li");


     String producName;
     String actualMassage;
    public void fillInEmailAFriendDetailsForRegisteredUser(){
        typeText(_enterFriendEmail,"rajpatel"+timestamp()+"@gmail.com");
        typeText(_enterMassage,"This book is grate");
        clickOnElement(_clickOnSendEmailButton);
        producName = getTextFromElement(_getProductName);
        System.out.println("My product name is "+producName);
        actualMassage = getTextFromElement(_getYourMassage);
        System.out.println("Massage is "+actualMassage);
        Assert.assertEquals(actualMassage,expectedReferAFriendProductMsg,"Your Massage has been not send");

    }
    public void fillInEmailAFriendDetailsForNonRegisteredUser(){
        //enter friend email
        typeText(_enterFriendEmail,"rajpatel"+timestamp()+"@gmail.com");
        //enter your email
        typeText(_enterYourEmail,"bh23@gmail.com");
        //click on send email
        clickOnElement(_clickOnSendEmailButton);
        String actualMassage = getTextFromElement(_getErrorMassage);
        System.out.println("Error Massage: "+actualMassage);
        Assert.assertEquals(actualMassage,expectedEmailMassage,"All customers can use email a friend feature");






    }


}

