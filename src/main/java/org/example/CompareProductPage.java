package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductPage extends Utils{
    static String expecetdMassageForCompareProduct = "You have two items to compare.";
    private  By _firstProductName = By.xpath("//table[@class=\"compare-products-table\"]/tbody/tr[3]/td[2]/a");
    private  By _secondProductName = By.xpath("//table[@class=\"compare-products-table\"]/tbody/tr[3]/td[3]/a");
    private  By _clearList = By.xpath("//a[text()='Clear list']");
    private  By _getMassage = By.xpath("//div[text()='You have no items to compare.']");
    public void twoProductsName(){
        String productName = getTextFromElement(_firstProductName);
        System.out.println("Frist product name is "+productName);
        String productname = getTextFromElement(_secondProductName);
        System.out.println("Second product name is "+productname);
        // click on clear list
        clickOnElement(_clearList);
        //get massage
        String actualmassage = getTextFromElement(_getMassage);
        System.out.println("Massage "+actualmassage);
        Assert.assertEquals(actualmassage,expecetdMassageForCompareProduct,"You have two items to compare.");





    }

}
