package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    public void openBrowser() {
        //open the browser
        driver = new ChromeDriver();
        //type url
        driver.get("https://demo.nopcommerce.com/");
        //for browser open 10 second
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //for window maximize
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        //close browser
         driver.close();}


    }
