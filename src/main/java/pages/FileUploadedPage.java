package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {
    WebDriver driver;
    private By status = By.id("uploaded-files");
    public FileUploadedPage(WebDriver driver){
        this.driver = driver;
    }
    public String getStatus(){
        return driver.findElement(status).getText();
    }

}
