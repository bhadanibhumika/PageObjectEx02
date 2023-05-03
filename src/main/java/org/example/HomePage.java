package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HomePage extends Utils {
    static String expectedErrorMassage = "Your vote was successfully.";
    static String expecerMassageForVote ="User can not vote";
  private   By _registerButton = By.className("ico-register");
  private By _goodRadioButton = By.id("pollanswers-2");;
  private By _voteButton = By.xpath("//button[text()='Vote']");
  private By _verifyErrorVoteMassage = By.xpath("//div[@class=\"poll-vote-error\"]");
  private By _loginButton = By.xpath("//a[text()='Log in' ]");
  private By _digitalDownloads = By.xpath("//img[@alt='Picture for category Digital downloads']");
  private By _voteResult = By.className("poll-total-votes");
  private By _addToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
  private By _electronicsLink = By.xpath("//div[@class=\"master-wrapper-page\"]/div[2]/ul[1]/li[2]/a[@href=\"/electronics\"]");
  private  By _firstProduct = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]");
  private  By _close = By.xpath("//span[@class= \"close\"]");
  private  By _secondProduct = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[4]/div/div[2]/div[3]/div[2]/button[2]");
  private  By _greenPopupWindow = By.xpath("//div[@id=\"bar-notification\"]/div/p/a");
    public void clickOnRegisterButton() {
        //click on register link
        clickOnElement(_registerButton);
    }
    public void clickOnGoodRadioButton(){
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }
    public void clickOnVote(){
      // click on vote button
        clickOnElement(_voteButton);
    }
    public void verifyUserShouldNotAbleToVote(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"poll-vote-error\"]")));
        //get error massage
        String actualMassage = getTextFromElement(_verifyErrorVoteMassage);
        System.out.println("Error Massage:"+actualMassage);
        Assert.assertEquals(actualMassage,expectedErrorMassage,"Your vote was successfully.");

    }
    public void clickOnLogInButton(){
        //click on login button
       clickOnElement(_loginButton);

    }
    public  void clickOnDigitalDownloads(){
        // click on digital download link
        clickOnElement(_digitalDownloads);

    }
    public void verifyUsershouldBeAbleTovoteSuccessfully(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pollanswers-2']")));
        String actualMassage =getTextFromElement(_voteResult);
        System.out.println("Massage for vote: "+actualMassage);
        Assert.assertEquals(actualMassage,expecerMassageForVote,"User can not vote");
    }
    public void clickOnAddToCartButton(){
        // click on apple macbook
        clickOnElement(_addToCartButton);

    }
    public void clickOnElecronics(){
        //click on Electronics link
        clickOnElement(_electronicsLink);
    }
    public void varifyCompareTwoProducts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

       //click on first product
        clickOnElement(_firstProduct);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"bar-notification\"]/div/p/a")));

        //close pop up window
//        clickOnElement(_close);
        //click on second product
        clickOnElement(_secondProduct);
        //wait until  green pop up window is gone
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"bar-notification\"]/div/p/a")));
        //click green pop up window
        clickOnElement(_greenPopupWindow);

    }

}