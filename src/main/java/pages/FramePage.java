package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");
    public FramePage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage  clickFrames(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }
}
