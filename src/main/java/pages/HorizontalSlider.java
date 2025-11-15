package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static javax.management.Query.value;

public class HorizontalSlider {
    WebDriver driver;
    private By slideBar = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");

    public HorizontalSlider(WebDriver driver){
        this.driver = driver;
    }
    public void SlideRight(int value){
//        driver.findElement(slideBar).sendKeys(Keys.ARROW_RIGHT);
        WebElement slider = driver.findElement(slideBar);
        for (int i = 0; i < value; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }


}
