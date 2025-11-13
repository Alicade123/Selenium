package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    WebDriver driver;
     private By emailField = By.id("email");
     private By retrieveButton = By.id("form_submit");
     private By status = By.tagName("h1");

    public ForgotPassword( WebDriver driver){
        this.driver = driver;
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public String clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return driver.findElement(status).getText();
    }
}
