package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Utils extends BasePage{
    public static void clickOnElement(By by) {
         driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void selectElementByValue(By by,String value){

       Select select = new Select(driver.findElement(by));
       select.selectByValue(value);
    }
    public static void selectElementByText(By by, String text){
       Select select = new Select(driver.findElement(by));
       select.selectByVisibleText(text);
    }
    public  static void selectElementByIndex(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }
    public static void waitForClickable(By by,int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    // Reusable method for explicit wait with condition URL matches
    public static void explicitWaitUrlMatches(String url) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlMatches(url));
    }
    // Reusable method for explicit wait to wait until condition of visibility of element is matched
    public static void explicitWaitVisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Reusable method for explicit wait to wait until condition of Invisibility of Element located is matched
    public static void explicitWaitInvisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    // Reusable method for explicit wait to wait until condition of Text to be present in element located is matched
    public static void explicitWaitTextToBePresentInElementLocated(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }
    public static void scrollviewElement(By by){
        WebElement element = driver.findElement(by);
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        System.out.println(element.getText());

    }
}
