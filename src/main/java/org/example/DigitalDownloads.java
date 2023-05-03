package org.example;

import org.openqa.selenium.By;

public class DigitalDownloads extends Utils{

private By _addToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[1]");

private  By _emailAFriendButton = By.xpath("//div[@class='email-a-friend']");

  public void clickOnLondonGrammerBook() {
      clickOnElement(_addToCartButton);
  }
  public  void clickOnEmailAFriend(){
      clickOnElement(_emailAFriendButton);
  }



}
