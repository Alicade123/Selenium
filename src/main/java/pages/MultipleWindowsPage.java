package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private final WebDriver driver;
    private By clickHereLink = By.cssSelector(".example a");
    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickClickHereLink(){
        driver.findElement(clickHereLink).click();
    }
}
