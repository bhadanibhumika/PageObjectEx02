package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    // create object by access modifiers
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LogInPage logInPage = new LogInPage();
    DigitalDownloads digitalDownloads = new DigitalDownloads();
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();
    AppleMacBookPro_13_Page appleMacBookPro13Page = new AppleMacBookPro_13_Page();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotosPage cameraAndPhotosPage = new CameraAndPhotosPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CompareProductPage compareProductPage = new CompareProductPage();
    ProductPage productPage = new ProductPage();
    FaceBookPage faceBookPage = new FaceBookPage();
    CheckingOutAsGuestPage checkingOutAsGuestPage = new CheckingOutAsGuestPage();
    CheckoutBillingPage checkoutBillingPage = new CheckoutBillingPage();
    ShippingPage shippingPage = new ShippingPage();
    NopComNewRealesePage nopComNewRealesePage = new NopComNewRealesePage();

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
        //click on good button
        homePage.clickOnGoodRadioButton();
        //click on vote button
        homePage.clickOnVote();
        homePage.verifyUserShouldNotAbleToVote();
    }
    @Test
    public  void verifyRegisteredUserShouldAbleToReferAProductToAFriendSuccessfully(){
        //click on register link
        homePage.clickOnRegisterButton();
        //type first naME
        registerPage.enterRegistrationDetails();
        //log in link
        homePage.clickOnLogInButton();
        //enter login details
        logInPage.enterLogInDetails();
        //click on digital downloads
        homePage.clickOnDigitalDownloads();
        //click on london grammar add to cart
        digitalDownloads.clickOnLondonGrammerBook();
        //click on email a friend
        digitalDownloads.clickOnEmailAFriend();
        //fill  friend email detail
        productEmailAFriendPage.fillInEmailAFriendDetailsForRegisteredUser();

    }
    @Test
    public void verifyRegisteredUsersShouldAbleToVoteSuccessfully(){
        //click on register link
        homePage.clickOnRegisterButton();
        //fill all register detail
        registerPage.enterRegistrationDetails();
        // click on login button
        homePage.clickOnLogInButton();
        //fii login detail
        logInPage.enterLogInDetails();
       //click on good button
        homePage.clickOnGoodRadioButton();
        //click on vote
        homePage.clickOnVote();
        //get result for vote
        homePage.verifyUserShouldBeAbleToVoteSuccessfully();

    }
    @Test
    public  void verifyNonRegisteredShouldNotAbleToEmailAFriend() {
        // click on apple macbook
        homePage.clickOnAddToCartButton();
        //click on email button
        appleMacBookPro13Page.clickOnEmailAFriend();
        //fill all email detail
        productEmailAFriendPage.fillInEmailAFriendDetailsForNonRegisteredUser();


    }
    @Test
    public void verifyUserShouldBeAbleToSeeProductInShoppingCartSuccessfully(){
        //click on electronics link
        homePage.clickOnElectronics();

        //click on camera & photo
        electronicsPage.clickOnCamaraAndPhotos();

        // click on add to cart button
        cameraAndPhotosPage.clickOnAddToCart();

        //click on shopping cart link
        cameraAndPhotosPage.clickonShoppingCart();

        //get product name
        shoppingCartPage.clickOnProductName();


    }
    @Test
    public  void verifyUserShouldBeAbleToCompareTwoProductSuccessfully(){
        //Click on First product Htc 18
        homePage.verifyCompareTwoProducts();
        //compare two product in cart
        compareProductPage.twoProductsName();


    }
    @Test
    public void verifyToPrintOutHomePageProductsName(){
        homePage.printOutTheProductName();
    }
    @Test
    public void verifyTheSearchAlertMessage(){
        homePage.searchAlertMassage();
    }
    @Test
    public void verifyUserShouldBeAbleToSelectAndPrintAccordingly(){
        homePage.printCurrencyInUsDollar();
        homePage.printCurrencyInEuro();
    }
    @Test
    public void verifySearchFunctionIsWorkingFine(){
        //type product name in search placeholder
        homePage.searchProductsFunction("Nike","Apple");


    }
    @Test
    public void verifyNopCommerceNewReleaseLatestCommentShouldBeAppearLast(){
        homePage.clickOnNewReleaseDetails();
        nopComNewRealesePage.fillInNewReleaseDetails();


    }
    @Test
    public void verifyGuestUsersShouldBeAbleToCheckoutSuccessfully(){
        homePage.clickOnOwnComputer();
        productPage.buildYourOwnComputerProduct();
        shoppingCartPage.verifyBuildYourOwnComputerShoppingCart();
        checkingOutAsGuestPage.verifyCheckOutAsAGuest();
        checkoutBillingPage.fillInBillingDetail();
        shippingPage.fillShippinDetails();
        shippingPage.paymentInfo();
        shippingPage.confirmOrder();

    }
    @Test
    public void verifyUserShouldBeAbleToSwitchToFacebookWindowTab(){
        homePage.clickOnFacebookIcon();
        faceBookPage.verifyFacebookpage();
        homePage.verifyWelcomeMessage();

    }
    @Test
    public void verifyAlertMessageWhenUserClickOnVoteWithoutSelectingAnyOption(){
        homePage.verifyVoteAlertMessage();


    }
}
