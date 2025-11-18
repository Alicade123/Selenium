package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    WebDriver driver;


     String top_Frame ="frame-top";
    String left_Frame= "frame-left";
    String buttom_Frame ="frame-bottom";
    String middle_Frame ="frameset-middle";


        private By topFrame =By.name("frame-top");
        private By middleFrame =By.name("frameset-middle");
        private By leftFrame =By.name("frame-left");
        private By bottomFrame =By.name("frame-bottom");
        private By body = By.tagName("body");

    NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }


        public String getLeftFrameText(){
            driver.switchTo().frame(top_Frame);
            driver.switchTo().frame(left_Frame);
            String text = driver.findElement(body).getText();
            driver.switchTo().parentFrame(); //exit left to top
            driver.switchTo().parentFrame(); //exit top to main
            return text;


    }
    public String getBottomFrameText(){
        driver.switchTo().frame(driver.findElement(bottomFrame));
        String txt= driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return txt;
    }

}
