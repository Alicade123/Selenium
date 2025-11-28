package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.net.CookieStore;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Set;
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
//        driver = new ChromeDriver(); //any interaction happen in testing is made using this webdriver
        // base driver
        driver = new ChromeDriver();
//        WebDriver baseDriver = new ChromeDriver(getChromeOptions());
        // listener
        EventReporter reporter = new EventReporter();
        // decorate and assign to GLOBAL driver
//        driver = new EventFiringDecorator(reporter).decorate(baseDriver);
        driver.get("https://the-internet.herokuapp.com/");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().SetScriptTimeout(Duration.ofSeconds(30));
//        goHome(); // to make sure that you run different test cases in whole class alerts using single object.
        //Form Testing page:https://formy-project.herokuapp.com/form

        homePage = new HomePage(driver);

        //Manage the screen size of the window
        driver.manage().window().maximize();
        setCookies();
        deleteCookie();
        System.out.println(driver.getTitle());
    }
//    @AfterMethod
//    public void goHome(){
//        driver.get("https://the-internet.herokuapp.com/");
//    }

//      @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
          var camera = (TakesScreenshot)driver;
          File screenShoot = camera.getScreenshotAs(OutputType.FILE);
          System.out.println("The absolute path of the screenshot is: " +screenShoot.getAbsolutePath());
        if(ITestResult.FAILURE == result.getStatus()){ //(SUCCESS, FAIL, SKIP)
                Files.move(screenShoot.toPath(),new File("resources/failedTestScreenshot/"+ result.getMethod().getMethodName() +".png").toPath());
            }
        else{
            Files.move(screenShoot.toPath(), new File("resources/passedTestScreenshoot/"+ result.getMethod().getMethodName() +".png").toPath());
        }
    }


    @AfterClass
    public void tearDown(){
       // driver.quit();  //closes all the driver's session
        //driver.close(); //closes only the current tab (window)
    }

    public WindowManager getWebDriver(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");//no longer working because of the security issues
        chromeOptions.addArguments("--headless=new"); // modern headless mode
        return chromeOptions;
    }
    private void setCookies(){
        Cookie cookie = new Cookie.Builder("Alicade", "12345")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
        }
    private void deleteCookie(){
        String cookieNameToDelete = "optimizelyBuckets";

       Set<Cookie> cookieSet = driver.manage().getCookies();
        for(Cookie cookie : cookieSet){
//            System.out.println(cookie.getName());
            if(cookie.getName().equalsIgnoreCase(cookieNameToDelete)){
                driver.manage().deleteCookieNamed(cookieNameToDelete);
            }
//            System.out.println();
//            System.out.println(cookie.getName());
        }

    }
}

