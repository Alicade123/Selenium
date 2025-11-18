package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By textAfterClick = By.cssSelector("#finish h4");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public String clickStartButton(){
        driver.findElement(startButton).click();

        //Explicitly Time waiter
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        waiter.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        //Advanced waiting techniques (FluentWait, Waiter, ...)
            //FluentWaiter
//        FluentWait <WebDriver> waiter = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        waiter.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

            //Wait Generic
//        Wait<WebDriver> wait =
//                new FluentWait<>(driver)
//                        .withTimeout(Duration.ofSeconds(2))
//                        .pollingEvery(Duration.ofMillis(300))
//                        .ignoring(ElementNotInteractableException.class)
//                        .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        return driver.findElement(textAfterClick).getText();
    }

}
