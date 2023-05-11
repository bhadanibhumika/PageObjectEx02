package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ProductPage extends Utils{
    private By _proccessor =By.cssSelector("select#product_attribute_1");
    private By _ram = By.cssSelector("select#product_attribute_2");
    private By _hdd = By.cssSelector("input#product_attribute_3_6");
    private By _vistaPremium = By.cssSelector("input#product_attribute_4_9");
    private By _checkBox2 = By.cssSelector("input#product_attribute_5_11");
    private By _checkBox1 = By.xpath("//input[@id='product_attribute_5_10']");
    private By _checkBox3 = By.cssSelector("input#product_attribute_5_12");
    private By _addToCartButton = By.cssSelector("button#add-to-cart-button-1");
    private By _shoppingCartButton = By.cssSelector("span.cart-label");

   public void buildYourOwnComputerProduct(){
        //select proccessor
        selectElementByIndex(_proccessor,1);
        //select ram
        selectElementByValue(_ram,"5");
        //click on hdd
        clickOnElement(_hdd);
        //click on vista premium
        clickOnElement(_vistaPremium);
        //click on check box 1 for uncheck
        clickOnElement(_checkBox1);
       //click on check box 1
        clickOnElement(_checkBox1);
       //click on check box 2
        clickOnElement(_checkBox2);
       //click on check box 3
        clickOnElement(_checkBox3);
        //click on add to cart button
        clickOnElement(_addToCartButton);
        //click on shopping cart button
        clickOnElement(_shoppingCartButton);










   }

}
