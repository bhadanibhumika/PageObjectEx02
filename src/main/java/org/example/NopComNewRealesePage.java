package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopComNewRealesePage extends Utils{
    private By _title = By.cssSelector("input.enter-comment-title");
    private By _comment =By.cssSelector("textarea.enter-comment-text");
    private By _newcommentbutton = By.xpath("//button[text()='New comment']");
    private By _pageTitle = By.cssSelector("div.page-title");
    private By _newsCommentMessage = By.cssSelector("div.result");
    private By _commentsList = By.cssSelector("div.comments");

    public void fillInNewReleaseDetails(){
        typeText(_title,"Hello");
        typeText(_comment,"Excellent Product ");
        clickOnElement(_newcommentbutton);
        String actualTitle = getTextFromElement(_pageTitle);
        System.out.println("Title of the page is : "+actualTitle);
        Assert.assertEquals(actualTitle,"nopCommerce new release!");
        String actualComment =  getTextFromElement(_newsCommentMessage);
        System.out.println("Message: "+actualComment);
        Assert.assertEquals(actualComment,"News comment is successfully added.");
        scrollviewElement(_commentsList);







    }


}
