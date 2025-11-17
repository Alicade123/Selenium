package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    WebDriver driver;

    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By indentationButton = By.cssSelector("button[aria-label='Increase indent']");
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver=driver;
    }

    private void switchToiFrame(){
        driver.switchTo().frame(editorIframeId);
    }
    public void switchMainFrame(){
        // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }
    public void ClearEditorArea(){
        switchToiFrame();
//        driver.findElement(textArea).clear();
        driver.findElement(textArea).sendKeys(Keys.CONTROL + "a"); // select all
        driver.findElement(textArea).sendKeys(Keys.DELETE);
        switchMainFrame();
    }

    public void setTextInTextArea(String text){
        switchToiFrame();
        driver.findElement(textArea).sendKeys(text);
        switchMainFrame();
    }
    public void clickIndentation(){
        driver.findElement(indentationButton).click();
    }
    public String getTextInTextArea(){
        switchToiFrame();
       String txt =  driver.findElement(textArea).getText();
        switchMainFrame();
        return txt;
    }



/*


 */
}
