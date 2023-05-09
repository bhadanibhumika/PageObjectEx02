package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShippingPage extends Utils{
    String expectedOrderConfirmationMessage = "Order is not confirmed";
    private By _nextDayAir = By.cssSelector("input#shippingoption_1");
    private By _continue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By _creditCard = By.xpath("//input[@id='paymentmethod_1']");
    private By _continue1 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private By _visa = By.cssSelector("select.dropdownlists");
    private By _cardHolderName = By.cssSelector("input#CardholderName");
    private By _cardNumber = By.cssSelector("input#CardNumber");
    private By _exMonth = By.cssSelector("select#ExpireMonth");
    private By _exYear = By.cssSelector("select#ExpireYear");
    private  By _cardCode = By.cssSelector("input#CardCode");
    private By _continue2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _confirm = By.xpath("//button[text()='Confirm']");
    private By _orderSuccessfullyMessage = By.xpath("//div[@class='section order-completed']");


    public void fillShippinDetails(){
        //click on net day air
        clickOnElement(_nextDayAir);
        //click on contunue
        clickOnElement(_continue);
        //select credit card
        clickOnElement(_creditCard);
        //click on contunue

        clickOnElement(_continue1);
    }
    public  void paymentInfo(){
        //select payment card
        selectElementByText(_visa,"Visa");
        //type cardholder name
        typeText(_cardHolderName,"raipatel");
        //type card number
        typeText(_cardNumber,"4929404071175412");
        //select expiration date
        selectElementByValue(_exMonth,"12");
        //select year
        selectElementByValue(_exYear,"2029");
        //type code
        typeText(_cardCode,"779");
        //click on continue
        clickOnElement(_continue2);
    }
    public void confirmOrder(){
        //click on confirm button
        clickOnElement(_confirm);
        //verify and assert order is successful message
        String orderSuccessfullyMessage = getTextFromElement(_orderSuccessfullyMessage);
        System.out.println("Order Details: " +orderSuccessfullyMessage);
        Assert.assertEquals(orderSuccessfullyMessage,expectedOrderConfirmationMessage,"Order is not processed");
    }
}
