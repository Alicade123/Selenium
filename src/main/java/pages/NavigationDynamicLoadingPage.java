package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class NavigationDynamicLoadingPage {
    WebDriver driver;

    private By link_Example2 = By.linkText("Example 2: Element rendered after the fact");
    public NavigationDynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewWindowDynamicLoadingExample2Page clickDynamicLoadingExample2Page(){
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(link_Example2);
        actions.keyDown(Keys.CONTROL).click(target).keyUp(Keys.CONTROL).perform();
      return new NewWindowDynamicLoadingExample2Page(driver);
    }

 public void switchWindow(String newTabUrl){
        var windows = driver.getWindowHandles();
        for(String window : windows){

            driver.switchTo().window(window);
            if(newTabUrl.equals(driver.getCurrentUrl())) break;
        }

 }


}
