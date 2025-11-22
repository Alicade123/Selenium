package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.WindowManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BaseTests {
    //step1: Creating the new object of Webdriver
    private WebDriver driver;
    protected HomePage homePage;

    //step2: Creating the method
    @BeforeClass
    public void setUp(){
        //i. Setting up the executable file to run which is the chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        
        //ii. instantiate our webdriver object, and the type of driver we want to use
        //Interface WebDriver /ChromeDriver, ChromiumDriver, EdgeDriver, FirefoxDriver, InternetExplorerDriver, RemoteWebDriver, SafariDriver
        driver = new ChromeDriver(); //any interaction happen in testing is made using this webdriver
        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().SetScriptTimeout(Duration.ofSeconds(30));
//        goHome(); // to make sure that you run different test cases in whole class alerts using single object.
        //Form Testing page:https://formy-project.herokuapp.com/form

        homePage = new HomePage(driver);

        //Manage the screen size of the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
//    @AfterMethod
//    public void goHome(){
//        driver.get("https://the-internet.herokuapp.com/");
//    }
    @AfterClass
    public void tearDown(){
        //driver.quit();  //closes all the driver's session
        //driver.close(); //closes only the current tab (window)
    }
    public WindowManager getWebDriver(){
        return new WindowManager(driver);
    }
}

