package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotosPage extends Utils{
    private By _clickOnProduct = By.xpath("//a[text()='Leica T Mirrorless Digital Camera']");
    private  By _clickOnAddToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private  By _clickOnShoppingCartLink = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/cart\"]");


    public void clickOnAddToCart(){
        //click on
        clickOnElement(_clickOnAddToCartButton);
    }
    public void clickonShoppingCart(){
        clickOnElement(_clickOnShoppingCartLink);
    }
}
