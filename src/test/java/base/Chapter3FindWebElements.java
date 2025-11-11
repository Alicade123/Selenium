package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3FindWebElements {
    WebDriver myWebDriver;

    public void findWebElements(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        myWebDriver = new ChromeDriver();
        myWebDriver.get("https://the-internet.herokuapp.com/");

        List<WebElement> list = myWebDriver.findElements(By.tagName("a"));
        System.out.println(list.size());

        myWebDriver.findElement(By.linkText("Inputs")).click();
        myWebDriver.manage().window().maximize();
        myWebDriver.close();


    }
    public static void main(String[] args){
        Chapter3FindWebElements test = new Chapter3FindWebElements();
        test.findWebElements();
    }
}
