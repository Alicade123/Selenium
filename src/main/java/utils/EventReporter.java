package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventReporter implements WebDriverListener {
    @Override
    public void beforeClick(WebElement element) {
        System.out.println("Clicking element: " + element);
    }

    @Override
    public void afterClick(WebElement element) {
//        System.out.println("Clicked element: " + element);
    }

    @Override
    public void beforeGet(WebDriver driver, String url) {
//        System.out.println("Navigating to: " + url);
    }

    @Override
    public void afterGet(WebDriver driver, String url) {
//        System.out.println("Finished navigating to: " + url);
    }


}
