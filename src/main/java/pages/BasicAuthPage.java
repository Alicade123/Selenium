package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasicAuthPage {

    WebDriver driver;
    private By h3 = By.tagName("h3");
//    private By p = By.tagName("p");
    public BasicAuthPage(WebDriver driver) {
   this.driver = driver;
    }
    public String getPageStatus(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h3"))));
        return driver.findElement(h3).getText();
    }

}
