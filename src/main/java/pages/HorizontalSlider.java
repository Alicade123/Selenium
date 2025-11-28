package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

import static javax.management.Query.value;

public class HorizontalSlider {
    WebDriver driver;
    private By slideBar = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");

    public HorizontalSlider(WebDriver driver){
        this.driver = driver;
    }
    public void SlideRight(int value){
        //        for (int i = 0; i < value; i++) {
//          driver.findElement(sliderValue).sendKeys(Keys.ARROW_RIGHT);
//        }
        double x = Double.parseDouble(driver.findElement(sliderValue).getText());
       double max = Double.parseDouble(driver.findElement(slideBar).getAttribute("max"));
       while(x<max){
           driver.findElement(slideBar).sendKeys(Keys.ARROW_RIGHT);

           x+=1.5;
       }
    }


}
