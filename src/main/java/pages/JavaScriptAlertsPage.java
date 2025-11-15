package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void getAlert(){
        driver.switchTo().alert().accept();
    }
    /**/
}
