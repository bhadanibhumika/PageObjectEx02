package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends  Utils{
    static String expectedMassage = "Your Product Name is not match";
    private By _clockOnProduct = By.xpath("//a[@class=\"product-name\"]");

    public void clickOnProductName(){

        //get name of product Leica T Mirrorless Digital Camera
        String actualProductName = getTextFromElement(_clockOnProduct);
        System.out.println("Product Name is "+actualProductName);
        Assert.assertEquals(actualProductName,expectedMassage,"Your Product Name is not match");




    }
}
