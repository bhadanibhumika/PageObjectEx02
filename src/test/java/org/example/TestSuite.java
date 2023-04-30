package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    // create object by access modifiers
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Test
    public  void verifyToUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill all details
        registerPage.enterRegistrationDetails();
        //verify user register successfully
        registerResultPage.verifyToUserShouldRegisterSuccessfully();
    }
    @Test
    public  void verifyNOnRegisteredUserShouldNotBeAbleToVote(){
        homePage.clickOnGoodRadioButton();
        homePage.clickOnVote();
        homePage.verifyUserShouldNotAbleToVote();
    }

}
