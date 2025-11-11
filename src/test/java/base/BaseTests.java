package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    //step1: Creating the new object of Webdriver
    private WebDriver driver;

    //step2: Creating the method
    public void setUp(){
        //i. Setting up the executable file to run which is the chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");


        //ii. instantiate our webdriver object, and the type of driver we want to use
        //Interface WebDriver /ChromeDriver, ChromiumDriver, EdgeDriver, FirefoxDriver, InternetExplorerDriver, RemoteWebDriver, SafariDriver
        driver = new ChromeDriver(); //any interaction happen in testing is made using this webdriver
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> list = driver.findElements(By.tagName("li"));
        System.out.println(list.size());
        //Manage the screen size of the window
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(375, 812));

        System.out.println(driver.getTitle());
        //driver.quit();//closes all the driver's session
        //driver.close(); //closes only the current tab (window)
    }

    public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
