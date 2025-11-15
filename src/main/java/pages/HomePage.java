package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //1. Click Form Authentication
    public LoginPage ClickAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //2. Click Dropdown
    public DropDownPage ClickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    //3.Click ForgotPassword
    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    //4.Click Hovers
    public HoversPage clickHovers(){
    clickLink("Hovers");
    return new HoversPage(driver);
    }
    //5.Click KeyPressesPage
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    //6. Click HorizontalSlider
    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    //7. Click JavaScriptAlerts
    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);

    }
    /* */

    private void clickLink(String linkText){
    driver.findElement(By.linkText(linkText)).click();
    }

}
