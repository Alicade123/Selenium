package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWindowDynamicLoadingExample2Page {
    WebDriver driver;
    private By startButton = By.tagName("button");
    public NewWindowDynamicLoadingExample2Page(WebDriver driver) {
        this.driver = driver;

    }
    public boolean isButtonExist(){
        WebElement button  = driver.findElement(startButton);
        if(button.isDisplayed()) return true;
        return false;
    }


}
