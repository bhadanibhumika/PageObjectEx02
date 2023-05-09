package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FaceBookPage extends Utils{
    private By _close = By.xpath("//div[@aria-label='Close']");
    private By _allowcookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
   private By _loginElements = By.cssSelector("form#login_form");
    private By _fbEmail = By.xpath("//input[@type='email']");
    private By _fbPassword = By.xpath("//input[@type='password']");
    private By _fbLoginButton = By.xpath("//div[@aria-label='Accessible login button']");

    public void verifyFacebookpage() {
        // Store the window handle of the main window
        String mainWindowHandle = driver.getWindowHandle();
        // Switch to the child window
        for (String childWindowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(childWindowHandle);
        }
        //all actions on child window
        String currentURL = driver.getCurrentUrl();
        System.out.println("child window URL"+currentURL);
        Assert.assertEquals(currentURL, "https://www.facebook.com/nopCommerce");
        clickOnElement(_allowcookies);
        clickOnElement(_close);

        if (driver.findElement(_fbEmail).isDisplayed()) {
            System.out.println("Element Email is Visible");
        } else {
            System.out.println("Element Email is InVisible");
        }

        if (driver.findElement(_fbPassword).isDisplayed()) {
            System.out.println("Element Password is Visible");
        } else {
            System.out.println("Element Password is InVisible");
        }

        if (driver.findElement(_fbLoginButton).isDisplayed()) {
           System.out.println("Element Log in is Visible");
       }
        else
        {
            System.out.println("Element Log in is InVisible");
        }

        //switch back to main window
        driver.switchTo().window(mainWindowHandle);
    }



}
