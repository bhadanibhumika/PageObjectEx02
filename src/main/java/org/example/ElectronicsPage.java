package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    private By _clickOnCameraAndPhotosImg = By.xpath("//img[@alt ='Picture for category Camera & photo']");
    public void clickOnCamaraAndPhotos(){
        clickOnElement(_clickOnCameraAndPhotosImg);

    }

}
