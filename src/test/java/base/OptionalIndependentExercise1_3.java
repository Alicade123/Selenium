package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OptionalIndependentExercise1_3 {
    WebDriver driver;

    public void checkOut(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> list =driver.findElements(By.tagName("li"));
        System.out.println(list.size());
       driver.manage().window().setPosition(new Point(500, 100));
        driver.quit();


    }
     public static void main(String[] args){
         OptionalIndependentExercise1_3 testX = new OptionalIndependentExercise1_3();
         testX.checkOut();
     }
}
