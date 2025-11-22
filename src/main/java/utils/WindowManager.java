package utils;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation Navigation;
    public WindowManager(WebDriver driver){
        this.driver = driver;
        Navigation = driver.navigate();
    }

    public void goBack(){
//        driver.navigate().back();
        Navigation.back();
    }
    public void goForward(){
        Navigation.forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        Navigation.to(url);
    }

    public void switchToTabs(String pageTitle){
        var setOfWindows  = driver.getWindowHandles();
        System.out.println("The number of windows is : "+setOfWindows.size());
        System.out.println("The window handles are:");
        setOfWindows.forEach(System.out::println);

        for (String window: setOfWindows){
            System.out.println("Switching to window: "+window);
            driver.switchTo().window(window);
            System.out.println("Current Window Title: "+driver.getTitle());
            if(pageTitle.equalsIgnoreCase(driver.getTitle())) break;
        }
    }

}
