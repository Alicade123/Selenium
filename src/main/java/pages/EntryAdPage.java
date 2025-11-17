package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    WebDriver driver;
    private By closeModal = By.cssSelector("#modal .modal-footer p");
    private By PageHeading = By.cssSelector(".example h3");
    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }
    public String ClickCloseModal(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the modal footer close button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(closeModal));
        driver.findElement(closeModal).click();
        return driver.findElement(PageHeading).getText();
    }


}
