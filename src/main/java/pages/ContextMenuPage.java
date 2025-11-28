package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hot_spotBox = By.id("hot-spot");
    public ContextMenuPage(WebDriver  driver)    {
        this.driver = driver;
    }
    public void RightClickInBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hot_spotBox)).perform();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void getAlertAccept(){
        driver.switchTo().alert().accept();
    }
}