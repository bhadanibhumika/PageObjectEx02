package org.example;

import org.openqa.selenium.By;

public class CheckingOutAsGuestPage extends Utils{
    private By _guestbutton = By.xpath("//button[text()='Checkout as Guest']");
    public void verifyCheckOutAsAGuest(){
        clickOnElement(_guestbutton);

    }

}
