package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDOMPage {
    private WebDriver driver;
    private By largeTableElement = By.id("large-table");
    public LargeDeepDOMPage(WebDriver driver) {
        this.driver =driver;
    }
    public void scrollToTable(){
        WebElement largeTable = driver.findElement(largeTableElement);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, largeTable);
    }

}
