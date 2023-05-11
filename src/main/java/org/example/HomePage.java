package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class HomePage extends Utils {
    static String expectedErrorMassage = "Your vote was successfully.";
    static String expecerMassageForVote ="User can not vote";
    static String expectedAlertMassage = "Please enter any search keyword";
    String expectedWelcomeMessage = "No Message";
  private   By _registerButton = By.className("ico-register");
  private By _goodRadioButton = By.cssSelector("input#pollanswers-2");
  private By _voteButton = By.xpath("//button[text()='Vote']");
  private By _verifyErrorVoteMassage = By.xpath("//div[@class='poll-vote-error']");
  private By _loginButton = By.xpath("//a[text()='Log in' ]");
  private By _digitalDownloads = By.xpath("//img[@alt='Picture for category Digital downloads']");
  private By _voteResult = By.className("poll-total-votes");
  private By _addToCartButton = By.xpath("//div[@class='item-grid']/div[2]/div/div[2]/div[3]/div[2]/button[1]");
  private By _electronicsLink = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[2]/a[@href=\"/electronics\"]");
  private  By _firstProduct = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]");
  private  By _close = By.xpath("//span[@class= 'close']");
  private  By _secondProduct = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[4]/div/div[2]/div[3]/div[2]/button[2]");
  private  By _greenPopupWindow = By.xpath("//div[@id='bar-notification']/div/p/a");
  private By _searchButton = By.xpath("//button[@class='button-1 search-box-button']");
  private By _currencySelector = By.cssSelector("select#customerCurrency");
  private By _searchPlaceHolderText = By.cssSelector("input#small-searchterms");
  private By _facebookLogo = By.cssSelector("li.facebook");
    private By _welcomeMessage = By.xpath("//div[@class='topic-block-title']/h2");
    private By _clickOnBuildyourowncomputerImg = By.xpath("//img[@alt='Picture of Build your own computer']");
    private By _clickOnDetailsButton = By.xpath("//a[@href=\"/nopcommerce-new-release\"][text()='details']");
    private By _usDollar = By.xpath("//option[text()='US Dollar']");
    private By _euro = By.xpath("//option[text()='Euro']");
    private By _productPrices = By.cssSelector("div.prices");

    public void clickOnRegisterButton() {
        //click on register link
        clickOnElement(_registerButton);
    }
    public void clickOnGoodRadioButton(){
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }
    public void clickOnVote(){
      // click on vote button
        clickOnElement(_voteButton);
    }
    public void verifyUserShouldNotAbleToVote(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"poll-vote-error\"]")));
        //get error massage
        String actualMassage = getTextFromElement(_verifyErrorVoteMassage);
        System.out.println("Error Massage:"+actualMassage);
        Assert.assertEquals(actualMassage,expectedErrorMassage,"Your vote was successfully.");

    }
    public void clickOnLogInButton(){
        //click on login button
       clickOnElement(_loginButton);

    }
    public  void clickOnDigitalDownloads(){
        // click on digital download link
        clickOnElement(_digitalDownloads);

    }
    public void verifyUserShouldBeAbleToVoteSuccessfully(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pollanswers-2']")));
        String actualMassage =getTextFromElement(_voteResult);
        System.out.println("Massage for vote: "+actualMassage);
        Assert.assertEquals(actualMassage,expecerMassageForVote,"User can not vote");
    }
    public void clickOnAddToCartButton(){
        // click on apple macbook
        clickOnElement(_addToCartButton);

    }
    public void clickOnElectronics(){
        //click on Electronics link
        clickOnElement(_electronicsLink);
    }
    public void verifyCompareTwoProducts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       //click on first product
        clickOnElement(_firstProduct);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='bar-notification success']")));
        //click on second product
        clickOnElement(_secondProduct);
        //click green pop up window
        clickOnElement(_greenPopupWindow);

    }
    public void printOutTheProductName(){
        //create list for elements
        List<WebElement>productList = driver.findElements(By.cssSelector("div.product-grid h2"));
        //for each loop
        for (WebElement e:productList) {
            //print product name
           System.out.println(e.getText());}}
    public void searchAlertMassage(){
        clickOnElement(_searchButton);
        //create alert object
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),expectedAlertMassage,"Please enter any search keyword");
        // use for alert handel (click on ok)
        alert.accept();
    }

        public void printCurrencyInUsDollar() {
            String actualCurrency = getTextFromElement(_usDollar);
            System.out.println("Selected Currency: "+actualCurrency);
            //select Us Dollar in currency selector
            selectElementByText(_currencySelector,"US Dollar");
            //create list for elements
            List<WebElement>actualCurrency1 = driver.findElements(By.cssSelector("span.price"));
            for (WebElement e:actualCurrency1) {
                //print product price with US Dollar sign
                System.out.println(e.getText());
            }
            Assert.assertEquals(actualCurrency,"US Dollar");
    }
    public void printCurrencyInEuro(){
        String actualCurrency = getTextFromElement(_euro);
        System.out.println("Selected Currency: "+actualCurrency);
        //select euro in currency selector
        selectElementByText(_currencySelector,"Euro");
        //create list for elements
        List<WebElement>actualCurrency1 = driver.findElements(By.cssSelector("span.price"));
        for (WebElement e:actualCurrency1) {
            //print product price with euro sign
            System.out.println(e.getText());
        }
        Assert.assertEquals(actualCurrency,"Euro");
    }
    public void verifyVoteAlertMessage(){
        //click on vote button
        clickOnElement(_voteButton);
        //get alert message
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please select an answer");
        //click on ok button
        alert.accept();
    }
    public void searchProductsFunction(String searchText,String expectedResult){
        //type in placeholder
       typeText(_searchPlaceHolderText,searchText);
       //click on search button
       clickOnElement(_searchButton);

        List<WebElement> product_List = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e :product_List) {
           System.out.println(e.getText());
        }
        String actualMessage = searchText;
        Assert.assertEquals(actualMessage,expectedResult);


    }
    public void clickOnFacebookIcon(){
        clickOnElement(_facebookLogo);
        }
    public void verifyWelcomeMessage() {

        String currentURL = driver.getCurrentUrl();
        System.out.println("Homepage Url:"+currentURL);
        Assert.assertEquals(currentURL,"https://demo.nopcommerce.com/");
        String actualmessage = getTextFromElement(_welcomeMessage);
        //to print message
        System.out.println("message: " + actualmessage);
        //to verify actual and expected result matched or not
        Assert.assertEquals(actualmessage, expectedWelcomeMessage, "No Message");


    }
    public void clickOnOwnComputer(){
        clickOnElement(_clickOnBuildyourowncomputerImg);


    }
    public void clickOnNewReleaseDetails(){
        clickOnElement(_clickOnDetailsButton);

    }





}