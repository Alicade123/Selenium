package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage ClickAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage ClickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    private void clickLink(String linkText){
    driver.findElement(By.linkText(linkText)).click();
    }

}
