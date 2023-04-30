package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class HomePage extends Utils {
    static String expectedErrorMassage = "Your vote was successfully.";
  private   By _registerButton = By.className("ico-register");
  private By _goodRadioButton = By.id("pollanswers-2");;
  private By _voteButton = By.xpath("//button[text()='Vote']");
  private By _verifyErrorVoteMassage = By.xpath("//div[@class=\"poll-vote-error\"]");
    public void clickOnRegisterButton() {
        //click on register link
        clickElement(_registerButton);
    }
    public void clickOnGoodRadioButton(){
        //click on good radio button
        clickElement(_goodRadioButton);
    }
    public void clickOnVote(){
      // click on vote button
        clickElement(_voteButton);
    }
    public void verifyUserShouldNotAbleToVote(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"poll-vote-error\"]")));
        //get error massage
        String actualMassage = getTextFromElement(_verifyErrorVoteMassage);
        System.out.println("Error Massage:"+actualMassage);
        Assert.assertEquals(actualMassage,expectedErrorMassage,"Your vote was successfully.");

    }

}