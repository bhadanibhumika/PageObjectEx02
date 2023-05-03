package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPro_13_Page extends Utils{
    private By _emailAFriendButton = By.xpath("//button[text()=\"Email a friend\"]");

    public void clickOnEmailAFriend(){
        clickOnElement(_emailAFriendButton);
    }
}
