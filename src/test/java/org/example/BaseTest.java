package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    // create object by access modifiers
    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();
    }

    @AfterMethod
    public void tearDown() {
     //   driverManager.closeBrowser();

    }
}