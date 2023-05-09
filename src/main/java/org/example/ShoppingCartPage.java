package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends  Utils{
    static String expectedMassage = "Your Product Name is not match";
    static String expectedDetails = "No Details match";
    private By _clockOnProduct = By.xpath("//a[@class=\"product-name\"]");
    private By _computerDetail = By.cssSelector("td.product");
    private By _termsOfCheckBox = By.cssSelector("input#termsofservice");
    private By _checkOutButton = By.cssSelector("button#checkout");

    public void clickOnProductName(){

        //get name of product Leica T Mirrorless Digital Camera
        String actualProductName = getTextFromElement(_clockOnProduct);
        System.out.println("Product Name is "+actualProductName);
        //for compare actual and expected result
        Assert.assertEquals(actualProductName,expectedMassage,"Your Product Name is not match");


    }
    public void verifyBuildYourOwnComputerShoppingCart(){
        //verify  product details
       String actualComputerDetails = getTextFromElement(_computerDetail);
        System.out.println("Computer Details: "+actualComputerDetails);
       // Assert.assertEquals(actualComputerDetails,expectedDetails,"No Details match");
        //click on checkbox
        clickOnElement(_termsOfCheckBox);

        //click on checkout method
        clickOnElement(_checkOutButton);


    }
}
