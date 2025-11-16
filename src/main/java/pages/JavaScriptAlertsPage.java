package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    WebDriver driver;
    //test the alert and accept
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By resultStatus = By.id("result");


    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void getAlert(){
        driver.switchTo().alert().accept();
    }

    public String getStatusResult(){
        return driver.findElement(resultStatus).getText();
    }

    /*

    */


    //2 test the aler and cancel
    private By triggerAlertButtonDismiss = By.xpath(".//button[text()='Click for JS Confirm']");

    public void triggerAlertButtonDismiss(){
        driver.findElement(triggerAlertButtonDismiss).click();
    }
    public String getAlertTestDismuss(){
        return driver.switchTo().alert().getText();
    }
    public void getAlertDismiss(){
        driver.switchTo().alert().dismiss();
    }

    //3 test the aler prompt

    private By triggerAlertButtonPrompt = By.xpath(".//button[text()='Click for JS Prompt']");

    public void clickTriggerAlertButtonPrompt (){
        driver.findElement(triggerAlertButtonPrompt).click();
    }
    public void setValue(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void getAlertPrompt(){
        driver.switchTo().alert().accept();
    }




}
