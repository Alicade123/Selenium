package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
//    String linkXpathPattern = ".//a[contains(text(), '%s')";
//    private By link_Example1 = By.xpath(String.format(linkXpathPattern,"Example 1"));
    private By link_Example1 = By.linkText("Example 1: Element on page that is hidden");
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    public  DynamicLoadingExample1Page clickDynamicLoadingExample1Page(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
