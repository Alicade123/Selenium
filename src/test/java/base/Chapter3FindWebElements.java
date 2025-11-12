package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3FindWebElements {
    WebDriver driver;

    public void findWebElements(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> items = driver.findElements(By.tagName("li"));
        System.out.println(items.size());

        driver.manage().window().maximize();
//      driver.manage().window().fullscreen();
//      driver.manage().window().setSize(new Dimension(375, 812));
        driver.close();


    }
    public static void main(String[] args){
        Chapter3FindWebElements test = new Chapter3FindWebElements();
        test.findWebElements();
    }
}
