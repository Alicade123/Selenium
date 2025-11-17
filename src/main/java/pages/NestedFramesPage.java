package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    WebDriver driver;
    private By frameLeft = By.name("frame-left");
     String left_frame= "frame-left";
    private By button_frame = By.name("frame-bottom");
    NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    public void SwitchToLeftFrame(){
        driver.switchTo().frame(left_frame);
    }
    public void SwitchToMainFrame(){
        driver.switchTo().defaultContent();
    }
    public void getLeftFrameText(){
        SwitchToLeftFrame();
        SwitchToMainFrame();

    }
    public String getBottomFrameText(){
        SwitchToLeftFrame();
        SwitchToMainFrame();
        return "";
    }

    /*


     */

}
