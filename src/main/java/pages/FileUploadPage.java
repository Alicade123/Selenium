package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By file_uploadField = By.id("file-upload");
    private By file_submitButton = By.id("file-submit");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickFileUpload(String absolutePath){
        driver.findElement(file_uploadField).sendKeys(absolutePath);
    }

    public FileUploadedPage clickFileUploadButton(){
        driver.findElement(file_submitButton).click();
        return new FileUploadedPage(driver);
    }
}
