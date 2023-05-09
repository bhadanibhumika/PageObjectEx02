package org.example;

import org.openqa.selenium.By;

public class CheckoutBillingPage extends Utils{
    private By _FirsttName = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName = By.cssSelector("input#BillingNewAddress_LastName");
    private By _email = By.cssSelector("input#BillingNewAddress_Email");
    private By _country = By.cssSelector("select#BillingNewAddress_CountryId");
    private By _city = By.cssSelector("input#BillingNewAddress_City");
    private By _address1 = By.cssSelector("input#BillingNewAddress_Address1");
    private  By _postalCode = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private  By _phoneNumber = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _continue = By.xpath("//button[text()='Continue']");



    public  void fillInBillingDetail(){
        typeText(_FirsttName,"rahi");
        typeText(_lastName,"patel");
        typeText(_email,"rapatel@gmail.com");
        selectElementByText(_country,"United Kingdom");
        typeText(_city,"kingsbury");
        typeText(_address1,"21 harrow road");
        typeText(_postalCode,"wd27dj");
        typeText(_phoneNumber,"07834258002");
        clickOnElement(_continue);





    }

}
